package model.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class BrakePad extends Product {

	private String composite;
	private String type;
	
	public BrakePad(int id, String brand, String model, float price, String barcode, String bidi, String composite,
			String type) {
		super(id, brand, model, price, barcode, bidi);
		this.composite = composite;
		this.type = type;
	}

	public String getComposite() {
		return composite;
	}

	public void setComposite(String composite) {
		this.composite = composite;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
