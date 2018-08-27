package model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Sprocket extends Product {

	private int speeds;
	private final String[] KIND = {"Cassette", "Freewheel"};
	
	public Sprocket(int id, String brand, String model, float price, String barcode, String bidi, int id2, int speeds) {
		super(id, brand, model, price, barcode, bidi);
		id = id2;
		this.speeds = speeds;
	}
	
	public String[] getKIND() {
		return KIND;
	}

	@Column
	public int getSpeeds() {
		return speeds;
	}

	public void setSpeeds(int speeds) {
		this.speeds = speeds;
	}

}
