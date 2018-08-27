package model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class SeatPost extends Product {

	private float length;
	private float diameter;
	private String material;
	private boolean nutInclude;
	
	public SeatPost(int id, String brand, String model, float price, String barcode, String bidi, float length, float diameter,
			String material, boolean nutInclude) {
		super(id, brand, model, price, barcode, bidi);
		this.length = length;
		this.diameter = diameter;
		this.material = material;
		this.nutInclude = nutInclude;
	}

	@Column(columnDefinition = "Decimal(2,2) default '0.0'")
	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	@Column(columnDefinition = "Decimal(2,2) default '0.0'")
	public float getDiameter() {
		return diameter;
	}

	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean isNutInclude() {
		return nutInclude;
	}

	public void setNutInclude(boolean nutInclude) {
		this.nutInclude = nutInclude;
	}

}
