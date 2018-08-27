package model.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class BrakeWire extends Product {

	private int length;
	private String connectingHeadType;
	
	public BrakeWire(int id, String brand, String model, float price, String barcode, String bidi, int length,
			String connectingHeadType) {
		super(id, brand, model, price, barcode, bidi);
		this.length = length;
		this.connectingHeadType = connectingHeadType;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getConnectingHeadType() {
		return connectingHeadType;
	}
	public void setConnectingHeadType(String connectingHeadType) {
		this.connectingHeadType = connectingHeadType;
	}
	
}
