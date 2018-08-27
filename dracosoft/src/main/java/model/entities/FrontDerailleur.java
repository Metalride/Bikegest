package model.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class FrontDerailleur extends Product {

	private int speeds;
	private String swing;
	
	public FrontDerailleur(int id, String brand, String model, float price, String barcode, String bidi, int speeds, String swing) {
		super(id, brand, model, price, barcode, bidi);
		this.speeds = speeds;
		this.swing = swing;
	}

	public int getSpeeds() {
		return speeds;
	}

	public void setSpeeds(int speeds) {
		this.speeds = speeds;
	}

	public String getSwing() {
		return swing;
	}

	public void setSwing(String swing) {
		this.swing = swing;
	}
	
}
