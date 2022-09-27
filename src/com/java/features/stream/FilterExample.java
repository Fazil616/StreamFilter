package com.java.features.stream;
import java.util.ArrayList;
import java.util.List;
public class FilterExample {
    public static void main (String[]args) {
        //create list of Products
        List<Product> list = new ArrayList<Product>();
        list.add(new Product(1, "Rose", 500));
        list.add(new Product(2, "Lily", 1000));
        list.add(new Product(3, "Lotus", 1500));
        list.add(new Product(4, "Jasmine", 2000));
        list.add(new Product(5, "Hibiscus", 3000));
        list.add(new Product(6, "Exora", 3500));
        //filter price <2000
        list.stream().filter(p -> p.price < 2000) //Converting List Into Stream
                .forEach(System.out::println); //Doble :: is Known As Method Refernce
        //filter Starts from"L"
        list.stream().filter(product -> product.name.startsWith("L"))
                .forEach(ele -> System.out.println(ele));
        //multiple filter
        System.out.println("multiple filter");
        list.stream()
                .filter(p -> p.price > 2000)
                .filter(product -> product.name.startsWith("L"))
                .forEach(System.out::println);
    }
}
class Product {
    int productid;
    String name;
    double price;

    public Product(int productid, String name, double price) {
        this.productid = productid;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "product [productid=" + productid + ",name=" + name + ", price=" + price + "]";
    }
}
