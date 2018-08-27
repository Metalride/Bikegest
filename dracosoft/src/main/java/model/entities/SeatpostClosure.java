package model.entities;

import javax.persistence.Column;

public class SeatpostClosure extends Product {

	private float diameter;
	private String color;
	private String type;
	
	public SeatpostClosure(int id, String brand, String model, float price, String barcode, String bidi, float diameter,
			String color, String type) {
		super(id, brand, model, price, barcode, bidi);
		this.diameter = diameter;
		this.color = color;
		this.type = type;
	}

	@Column(columnDefinition = "Decimal(2,2) default '0.0'")
	public float getDiameter() {
		return diameter;
	}

	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
