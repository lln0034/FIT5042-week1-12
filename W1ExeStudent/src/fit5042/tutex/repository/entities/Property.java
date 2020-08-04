package fit5042.tutex.repository.entities;

public class Property {
	private int id; 
	
	@Override
	public String toString() {
		return  id + " " + address + " " + numberOfBedrooms + "BR)s_ "
				+ size + "sqm " +"$"+ price + ",000.00";//use the price in thousand units
	}
	public Property(int id, String address, int numberOfBedrooms, int size, double price) {
		super();
		this.id = id;
		this.address = address;
		this.numberOfBedrooms = numberOfBedrooms;
		this.size = size;
		this.price = price;
	}
	private String address;
	private int numberOfBedrooms;
	private int size;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}
	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}
	

}
