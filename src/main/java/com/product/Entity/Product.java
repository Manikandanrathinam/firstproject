package com.product.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Product_table")
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
/**
 * @param id
 */
private int id;
/**
 * @param name
 */
private String name;
/**
 * @param price
 */
private int price;
/**
 * @param hashCode
 */
private int hashCode;
/**
 * @param Colour
 */
private String colour;
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the price
 */
public int getPrice() {
	return price;
}
/**
 * @param price the price to set
 */
public void setPrice(int price) {
	this.price = price;
}
/**
 * @return the hashCode
 */
public int getHashCode() {
	return hashCode;
}
/**
 * @param hashCode the hashCode to set
 */
public void setHashCode(int hashCode) {
	this.hashCode = hashCode;
}
/**
 * @return the colour
 */
public String getColour() {
	return colour;
}
/**
 * @param colour the colour to set
 */
public void setColour(String colour) {
	this.colour = colour;
}


}
