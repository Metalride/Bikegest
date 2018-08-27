package model.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Chain extends Product {

	private int linksNumber;
	private boolean sealed;
	private String color;
	
	public Chain(int id, String brand, String model, float price, String barcode, String bidi, int linksNumber, boolean sealed,
			String color) {
		super(id, brand, model, price, barcode, bidi);
		this.linksNumber = linksNumber;
		this.sealed = sealed;
		this.color = color;
	}

	public int getLinksNumber() {
		return linksNumber;
	}

	public void setLinksNumber(int linksNumber) {
		this.linksNumber = linksNumber;
	}

	public boolean isSealed() {
		return sealed;
	}

	public void setSealed(boolean sealed) {
		this.sealed = sealed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
