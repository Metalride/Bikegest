package model.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class RearDerailleur extends Product {

	private int speeds;
	private String boxLength;
	
	public RearDerailleur(int id, String brand, String model, float price, String barcode, String bidi, int speeds,
			String boxLength) {
		super(id, brand, model, price, barcode, bidi);
		this.speeds = speeds;
		this.boxLength = boxLength;
	}

	public int getSpeeds() {
		return speeds;
	}

	public void setSpeeds(int speeds) {
		this.speeds = speeds;
	}

	public String getBoxLength() {
		return boxLength;
	}

	public void setBoxLength(String boxLength) {
		this.boxLength = boxLength;
	}
	
}
