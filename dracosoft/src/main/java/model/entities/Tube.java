package model.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Tube extends Product {

	private int diameter;
	private String minWidth;
	private String maxWidth;
	private boolean antiPuncture;
	
	public Tube(int id, String brand, String model, float price, String barcode, String bidi, int diameter, String minWidth,
			String maxWidth, boolean antiPuncture) {
		super(id, brand, model, price, barcode, bidi);
		this.diameter = diameter;
		this.minWidth = minWidth;
		this.maxWidth = maxWidth;
		this.antiPuncture = antiPuncture;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public String getMinWidth() {
		return minWidth;
	}

	public void setMinWidth(String minWidth) {
		this.minWidth = minWidth;
	}

	public String getMaxWidth() {
		return maxWidth;
	}

	public void setMaxWidth(String maxWidth) {
		this.maxWidth = maxWidth;
	}

	public boolean isAntiPuncture() {
		return antiPuncture;
	}

	public void setAntiPuncture(boolean antiPuncture) {
		this.antiPuncture = antiPuncture;
	}
	
}
