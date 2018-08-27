package model.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Tyre extends Product {

	private int diameter;
	private int width;
	private String type;
	private boolean tubeless;
	private boolean antiPuncture;

	public Tyre(int id, String brand, String model, float price, String barcode, String bidi, int diameter, int width,
			String type, boolean tubeless, boolean antiPuncture) {
		super(id, brand, model, price, barcode, bidi);
		this.diameter = diameter;
		this.width = width;
		this.type = type;
		this.tubeless = tubeless;
		this.antiPuncture = antiPuncture;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isTubeless() {
		return tubeless;
	}

	public void setTubeless(boolean tubeless) {
		this.tubeless = tubeless;
	}

	public boolean isAntiPuncture() {
		return antiPuncture;
	}

	public void setAntiPuncture(boolean antiPuncture) {
		this.antiPuncture = antiPuncture;
	}
	
	
}
