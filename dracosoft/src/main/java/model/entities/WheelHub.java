package model.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class WheelHub extends Product {

	private int ratios;
	private Bearing bearing;
	private Axis axis;
	private String type;
	private boolean isRear;
	private boolean isFront;
	private boolean diskSupport;
	private Sprocket cassette;
	
	public WheelHub(int id, String brand, String model, float price, String barcode, String bidi, int ratios, Bearing bearing,
			Axis axis, String type, boolean isRear, boolean isFront, boolean diskSupport, Sprocket cassette) {
		super(id, brand, model, price, barcode, bidi);
		this.ratios = ratios;
		this.bearing = bearing;
		this.axis = axis;
		this.type = type;
		this.isRear = isRear;
		this.isFront = isFront;
		this.diskSupport = diskSupport;
		this.cassette = cassette;
	}

	public int getRatios() {
		return ratios;
	}

	public void setRatios(int ratios) {
		this.ratios = ratios;
	}

	public Bearing getBearing() {
		return bearing;
	}

	public void setBearing(Bearing bearing) {
		this.bearing = bearing;
	}

	public Axis getAxis() {
		return axis;
	}

	public void setAxis(Axis axis) {
		this.axis = axis;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isRear() {
		return isRear;
	}

	public void setRear(boolean isRear) {
		this.isRear = isRear;
	}

	public boolean isFront() {
		return isFront;
	}

	public void setFront(boolean isFront) {
		this.isFront = isFront;
	}

	public boolean isDiskSupport() {
		return diskSupport;
	}

	public void setDiskSupport(boolean diskSupport) {
		this.diskSupport = diskSupport;
	}

	public Sprocket getCassette() {
		return cassette;
	}

	public void setCassette(Sprocket cassette) {
		this.cassette = cassette;
	}
	
}
