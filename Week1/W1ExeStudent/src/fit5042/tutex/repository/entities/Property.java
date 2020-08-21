

package fit5042.tutex.repository.entities;

public class Property {
    private int id;
    private String address;
    private int numberOfBedrooms;
    private int size;
    private double price;

    public String toString() {
        return this.id + " " + this.address + " " + this.numberOfBedrooms + "BR(s) " + this.size + "sqm " + "$" +  (int)this.price+",000.00" ;
    }

    public Property(int id, String address, int numberOfBedrooms, int size, double price) {
        this.id = id;
        this.address = address;
        this.numberOfBedrooms = numberOfBedrooms;
        this.size = size;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumberOfBedrooms() {
        return this.numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }
}
