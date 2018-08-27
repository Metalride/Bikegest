package model.entities;

public class Fork extends Product {

	private int length;
	private final String[] TYPE = {"Springs", "Hydraulic", "Pneumatic"};
	private final String[] BRAKE_SUPPORT = {"Horseshoe brake", "V-brake", "Disk brake"};
	
	
	public Fork(int id, String brand, String model, float price, String barcode, String bidi) {
		super(id, brand, model, price, barcode, bidi);
		// TODO Auto-generated constructor stub
	}

}
