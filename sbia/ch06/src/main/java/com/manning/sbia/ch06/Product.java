/**
 *
 */
package com.manning.sbia.ch06;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author templth
 *
 */
@Entity
public class Product {
	@Id
	private String id;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private float price;

	public String getId() { return id; }
	public void setId(String id) { this.id = id; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }
	public float getPrice() { return price; }
	public void setPrice(float price) { this. price = price; }
}

