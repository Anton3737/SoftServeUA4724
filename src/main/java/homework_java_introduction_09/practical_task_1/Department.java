package homework_java_introduction_09.practical_task_1;

import java.util.ArrayList;
import java.util.List;

public class Department implements Cloneable {
    private String name;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public class Address {
        private String city;
        private String street;
        private int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }


        public Address(Address other) {
            this.city = other.city;
            this.street = other.street;
            this.building = other.building;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public void setBuilding(int building) {
            this.building = building;
        }

        @Override
        public String toString() {
            return "City: " + city + ", " + street + ", Bld.:" + building;
        }
    }

    public Department(String name, String city, String street, int building) {
        this.name = name;
        this.address = new Address(city, street, building);
    }

    @Override
    public Department clone() {
        try {
            Department cloned = (Department) super.clone();
            cloned.address = new Address(this.address);
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void setCity(String city) {
        this.address.setCity(city);
    }

    @Override
    public String toString() {
        return "Department: " + name + ", Address: " + address.toString();
    }


    public static void main(String[] args) {
        Department departmentCurrentAccrss = new Department("Department network accessibility", "Kyiv", "Shevchenka Boulevard", 17);
        Department departmentCurrentCore = new Department("Department core of network", "Kyiv", "Beresteysky Avenue", 32);
        Department depClone1 = departmentCurrentAccrss.clone();
        Department depClone2 = departmentCurrentAccrss.clone();
        Department depClone3 = departmentCurrentAccrss.clone();
        Department depClone4 = departmentCurrentAccrss.clone();
        Department depClone5 = departmentCurrentAccrss.clone();

        Department depClone6 = departmentCurrentCore.clone();
        Department depClone7 = departmentCurrentCore.clone();
        Department depClone8 = departmentCurrentCore.clone();
        Department depClone9 = departmentCurrentCore.clone();
        Department depClone10 = departmentCurrentCore.clone();

        depClone1.setCity("Rivne");
        depClone2.setCity("Lviv");
        depClone3.setCity("Dnipro");
        depClone4.setCity("Kharkov");
        depClone5.setCity("Sumy");


        depClone6.setCity("Rivne");
        depClone7.setCity("Lviv");
        depClone8.setCity("Dnipro");
        depClone9.setCity("Kharkov");
        depClone10.setCity("Sumy");

        depClone1.address.setStreet("Soborna");
        depClone2.address.setStreet("Svobody Avenue");
        depClone3.address.setStreet("Dmytra Yavornytskoho Avenue");
        depClone4.address.setStreet("Sumska");
        depClone5.address.setStreet("Kharkivska");
        depClone6.address.setStreet("Soborna");
        depClone7.address.setStreet("Svobody Avenue");
        depClone8.address.setStreet("Dmytra Yavornytskoho Avenue");
        depClone9.address.setStreet("Sumska");
        depClone10.address.setStreet("Kharkivska");


        depClone1.address.setBuilding(7);
        depClone2.address.setBuilding(33);
        depClone3.address.setBuilding(12);
        depClone4.address.setBuilding(7);
        depClone5.address.setBuilding(115);
        depClone6.address.setBuilding(7);
        depClone7.address.setBuilding(33);
        depClone8.address.setBuilding(12);
        depClone9.address.setBuilding(7);
        depClone10.address.setBuilding(115);


        List<Department> departmentList = new ArrayList<>();

        departmentList.add(depClone1);
        departmentList.add(depClone2);
        departmentList.add(depClone3);
        departmentList.add(depClone4);
        departmentList.add(depClone5);
        departmentList.add(depClone6);
        departmentList.add(depClone7);
        departmentList.add(depClone8);
        departmentList.add(depClone9);
        departmentList.add(depClone10);

        for (Department dp : departmentList) {
            System.out.println(dp);
        }

    }
}
