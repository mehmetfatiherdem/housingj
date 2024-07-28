package org.example.model;

public abstract class Building {
    private double price;
    private double area;
    private int rooms;
    private int saloons;

    public Building(double price, double area, int rooms, int saloons) {
        this.price = price;
        this.area = area;
        this.rooms = rooms;
        this.saloons = saloons;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getSaloons() {
        return saloons;
    }

    public void setSaloons(int saloons) {
        this.saloons = saloons;
    }

    @Override
    public String toString() {
        return "Building{" +
                "price=" + price +
                ", area=" + area +
                ", rooms=" + rooms +
                ", saloons=" + saloons +
                '}';
    }
}
