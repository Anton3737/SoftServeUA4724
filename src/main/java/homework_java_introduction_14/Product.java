package homework_java_introduction_14;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Product {

    private String manufactureCategory;
    private LocalDate dateOfManufacture;
    private double price;

    public Product(String manufactureCategory, LocalDate dateOfManufacture, double price) {
        this.manufactureCategory = manufactureCategory;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public void setManufactureCategory(String manufactureCategory) {
        this.manufactureCategory = manufactureCategory;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "manufactureCategory='" + manufactureCategory + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }


    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Phone", LocalDate.now().minusYears(2), 3500),
                new Product("Phone", LocalDate.now().minusYears(1).minusDays(1), 4000),
                new Product("Phone", LocalDate.now().minusMonths(6), 5000),
                new Product("Laptop", LocalDate.now().minusYears(3), 10000),
                new Product("Laptop", LocalDate.now().minusYears(5), 3200),
                new Product("Laptop", LocalDate.now().minusYears(2), 2500),
                new Product("PC", LocalDate.now().minusYears(2), 4500),
                new Product("PC", LocalDate.now().minusYears(1).minusMonths(1), 6000),
                new Product("PC", LocalDate.now().minusYears(4), 7000),
                new Product("MP3 Player", LocalDate.now().minusYears(2), 2999),
                new Product("MP3 Player", LocalDate.now().minusYears(2), 3900),
                new Product("MP3 Player", LocalDate.now().minusYears(3), 8000),
                new Product("Tablet", LocalDate.now().minusYears(1), 2000),
                new Product("Tablet", LocalDate.now().minusYears(1).minusDays(10), 3100),
                new Product("Tablet", LocalDate.now().minusYears(2), 4200),
                new Product("Headphones", LocalDate.now().minusYears(2), 5100),
                new Product("Headphones", LocalDate.now().minusYears(2), 3600),
                new Product("Headphones", LocalDate.now().minusYears(3), 5500),
                new Product("Smart Watch", LocalDate.now().minusYears(5), 9000),
                new Product("Smart Watch", LocalDate.now().minusYears(1).minusDays(5), 3300),
                new Product("Smart Watch", LocalDate.now().minusYears(3).minusDays(5), 3500)
        );

        LocalDate oneYearAgo = LocalDate.now().minusYears(1);

        List<Product> filteredSorted = products.stream()
                .filter(p -> p.getManufactureCategory().equalsIgnoreCase("Phone"))
                .filter(p -> p.getPrice() > 3000)
                .filter(p -> p.getDateOfManufacture().isBefore(oneYearAgo))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());

        filteredSorted.forEach(System.out::println);


    }
}
