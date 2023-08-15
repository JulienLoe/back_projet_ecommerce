package spring.firstApp.model;

import jakarta.persistence.*;

@Entity
public class Heel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private double price;

    @Column(name = "stock")
    private int stock;

    @Column(name = "url")
    private String url;

    public Heel() {
        super();
    }

    public Heel(int id, String name, double price, int stock, String url) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.url = url;

    }
}