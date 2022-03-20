package classwork.lesson13;

import java.util.Objects;

public class Address {
	private static int counter;
	private String city;
	private String country;
	private String house;
	
	
	public Address(String city, String country, String house) {
		this.city = city;
		this.country = country;
		this.house = house;
		counter++;
	}

	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getHouse() {
		return house;
	}


	public void setHouse(String house) {
		this.house = house;
	}
	
	public static int getCounter() {
		return counter;
	}
	
	public boolean compareAddress(Address second) {
		
		return city.equals(second.city) 
				&& country.equals(second.country) 
				&& house.equals(second.house);
	}
	
}
