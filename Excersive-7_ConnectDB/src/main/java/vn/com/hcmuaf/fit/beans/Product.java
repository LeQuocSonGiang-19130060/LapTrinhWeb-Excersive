package vn.com.hcmuaf.fit.beans;

public class Product {

    private int id;
    private String name;

    private double price;
    private double sellPrice;
    private String image;

    public Product() {

    }

    public Product(int id, String name, double price, double sellPrice, String image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.sellPrice = sellPrice;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
