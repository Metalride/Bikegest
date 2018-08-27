package model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class WheelRing extends Product {

	private float size;
	private String color;
	private int ratios;
	private String type;
	private String material;
	private boolean tubeless;
	private boolean twinbody;
	private boolean brakeBand;
	
	public WheelRing(int id, String brand, String model, float price, String barcode, String bidi, float size, String color,
			int ratios, boolean tubeless, boolean twinbody, String type, String material) {
		super(id, brand, model, price, barcode, bidi);
		this.size = size;
		this.color = color;
		this.ratios = ratios;
		this.tubeless = tubeless;
		this.twinbody = twinbody;
		this.type = type;
		this.material = material;
	}

	@Column(columnDefinition = "Decimal(2,2) default '0.0'")
	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	@Column
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Column
	public int getRatios() {
		return ratios;
	}

	public void setRatios(int ratios) {
		this.ratios = ratios;
	}

	@Column
	public boolean isTubeless() {
		return tubeless;
	}

	public void setTubeless(boolean tubeless) {
		this.tubeless = tubeless;
	}

	@Column
	public boolean hasTwinbody() {
		return twinbody;
	}

	public void setTwinbody(boolean twinbody) {
		this.twinbody = twinbody;
	}

	@Column
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Column
	public boolean hasBrakeBand() {
		return brakeBand;
	}

	public void setBrakeBand(boolean brakeBand) {
		this.brakeBand = brakeBand;
	}
	
}
