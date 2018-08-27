package model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Ratio extends Product{

	private float length;
	private float width;
	private String color;
	private String form;
	
	public Ratio(int id, String brand, String model, float price, String barcode, String bidi, float length, float width,
			String color, String form) {
		super(id, brand, model, price, barcode, bidi);
		this.length = length;
		this.width = width;
		this.color = color;
		this.form = form;
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

	@Column
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Column
	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}
	
}
