package com.varxyz.jvx330.di.example7;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class MenuItem {
	private String name;
	private double price;
	
//	public MenuItem(String name, double price) {
//		super();
//		this.name = name;
//		this.price = price;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public double getPrice() {
//		return price;
//	}
//
//	public void setPrice(double price) {
//		this.price = price;
//	}
//
//	public String toString() {
//		return "MenuItem [name=" + name + ", price=" + price + "]";
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(name, price);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (!(obj instanceof MenuItem)) {
//			return false;
//		}
//		MenuItem other = (MenuItem) obj;
//		return Objects.equals(name, other.name)
//				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
//	}
	
	
}
