package model.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Brake extends Product {

	private String type;
	private BrakePad brakePad;
	
	public Brake(int id, String brand, String model, float price, String barcode, String bidi, String type,
			BrakePad brakePad) {
		super(id, brand, model, price, barcode, bidi);
		this.type = type;
		this.brakePad = brakePad;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@OneToMany
	public BrakePad getBrakePad() {
		return brakePad;
	}

	public void setBrakePad(BrakePad brakePad) {
		this.brakePad = brakePad;
	}
	
}
