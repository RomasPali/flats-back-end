package com.flats.flats.files;

public class SearchDTO {
	private long id;
	private String address;
	private int floor;
	private int rooms;
	private int area;
    private int price;
    private String description;
    private int priceFrom;
    private int priceTo;
    private int floorsFrom;
    private int floorsTo;
    
    
    
	public SearchDTO() {
	
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPriceFrom() {
		return priceFrom;
	}
	public void setPriceFrom(int priceFrom) {
		this.priceFrom = priceFrom;
	}
	public int getPriceTo() {
		return priceTo;
	}
	public void setPriceTo(int priceTo) {
		this.priceTo = priceTo;
	}
	public int getFloorsFrom() {
		return floorsFrom;
	}
	public void setFloorsFrom(int floorsFrom) {
		this.floorsFrom = floorsFrom;
	}
	public int getFloorsTo() {
		return floorsTo;
	}
	public void setFloorsTo(int floorsTo) {
		this.floorsTo = floorsTo;
	}
	
	
    
}