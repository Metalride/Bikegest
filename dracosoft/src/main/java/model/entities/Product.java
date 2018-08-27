package model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * This is base class for all products in the shop, each kind of products must 
 * heritage from this class
 * @author dracosoft.es
 * @version 0.1
 */
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Product {
	private int id;
	private String brand;
	private String model;
	private float price;
	private String barcode;
	private String bidi;
	
	public Product(int id, String brand, String model, float price, String barcode, String bidi) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.barcode = barcode;
		this.bidi = bidi;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Column
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Column
	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	@Column
	public String getBidi() {
		return bidi;
	}

	public void setBidi(String bidi) {
		this.bidi = bidi;
	}

	@Column(columnDefinition = "Decimal(7,2) default '0.0'")
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
