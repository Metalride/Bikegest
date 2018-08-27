package model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Bearing extends Product {

	private float outerSize;
	private float innerSize;
	private String type;
	
	public Bearing(int id, String brand, String model, float price, String barcode, String bidi, float outerSize,
			float innerSize, String type) {
		super(id, brand, model, price, barcode, bidi);
		this.outerSize = outerSize;
		this.innerSize = innerSize;
		this.type = type;
	}

	@Column(columnDefinition = "Decimal(3,2), default '0.0'")
	public float getOuterSize() {
		return outerSize;
	}

	public void setOuterSize(float outerSize) {
		this.outerSize = outerSize;
	}

	@Column(columnDefinition = "Decimal(3,2), default '0.0'")
	public float getInnerSize() {
		return innerSize;
	}

	public void setInnerSize(float innerSize) {
		this.innerSize = innerSize;
	}

	@Column
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
