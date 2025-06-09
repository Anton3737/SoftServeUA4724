package homework_java_introduction_01;

import java.util.Scanner;

public class UserInfo {
    private String name;
    private String address;

    public UserInfo() {
    }

    public UserInfo(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name");
        String name = scanner.nextLine();

        System.out.println("Where do you live," + name + "?");
        String address = scanner.nextLine();

        UserInfo user = new UserInfo(name, address);

        System.out.println("Name: " + user.getName() + "\n" + "Address: " + user.getAddress());
    }
}
