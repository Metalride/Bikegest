package model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Seat extends Product {
	
	private float length;
	private float width;
	private float height;
	private boolean	antiprostatic;
	
	public Seat(int id, String brand, String model, float price, String barcode, String bidi, float length, float width,
			float height, boolean antiprostatic) {
		super(id, brand, model, price, barcode, bidi);
		this.length = length;
		this.width = width;
		this.height = height;
		this.antiprostatic = antiprostatic;
	}

	@Column(columnDefinition = "Decimal(2,2) default '0.0'")
	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	@Column(columnDefinition = "Decimal(2,2) default '0.0'")
	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	@Column(columnDefinition = "Decimal(2,2) default '0.0'")
	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public boolean isAntiprostatic() {
		return antiprostatic;
	}

	public void setAntiprostatic(boolean antiprostatic) {
		this.antiprostatic = antiprostatic;
	}
	
}
