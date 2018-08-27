package model.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class ShiftGuide extends Product {

	private int length;
	private int layers;
	private boolean teflon;
	
	public ShiftGuide(int id, String brand, String model, float price, String barcode, String bidi, int length, int layers,
			boolean teflon) {
		super(id, brand, model, price, barcode, bidi);
		this.length = length;
		this.layers = layers;
		this.teflon = teflon;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getLayers() {
		return layers;
	}

	public void setLayers(int layers) {
		this.layers = layers;
	}

	public boolean isTeflon() {
		return teflon;
	}

	public void setTeflon(boolean teflon) {
		this.teflon = teflon;
	}
	
}
