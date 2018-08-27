package model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Axis extends Product {

	private float length;
	private float width;
	private boolean isHollow;
	
	public Axis(int id, String brand, String model, float price, String barcode, String bidi, float length, float width,
			boolean isHollow) {
		super(id, brand, model, price, barcode, bidi);
		this.length = length;
		this.width = width;
		this.isHollow = isHollow;
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

	public boolean isHollow() {
		return isHollow;
	}

	public void setHollow(boolean isHollow) {
		this.isHollow = isHollow;
	}
	
}
