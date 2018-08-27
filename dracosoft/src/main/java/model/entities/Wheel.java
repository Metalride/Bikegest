package model.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Wheel extends Product {

	private WheelRing ring;
	private WheelHub hub;
	private Ratio ratio;
	private int ratiosQuantity;
	public Wheel(int id, String brand, String model, float price, String barcode, String bidi, WheelRing ring, WheelHub hub,
			Ratio ratio, int ratiosQuantity) {
		super(id, brand, model, price, barcode, bidi);
		this.ring = ring;
		this.hub = hub;
		this.ratio = ratio;
		this.ratiosQuantity = ratiosQuantity;
	}
	
	public WheelRing getRing() {
		return ring;
	}
	public void setRing(WheelRing ring) {
		this.ring = ring;
	}
	public WheelHub getHub() {
		return hub;
	}
	public void setHub(WheelHub hub) {
		this.hub = hub;
	}
	public Ratio getRatio() {
		return ratio;
	}
	public void setRatio(Ratio ratio) {
		this.ratio = ratio;
	}
	public int getRatiosQuantity() {
		return ratiosQuantity;
	}
	public void setRatiosQuantity(int ratiosQuantity) {
		this.ratiosQuantity = ratiosQuantity;
	}
	
}
