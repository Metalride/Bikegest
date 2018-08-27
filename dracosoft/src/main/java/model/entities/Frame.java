package model.entities;

import javax.persistence.Column;

public class Frame extends Product {

	private String material;
	private float size;
	private float pipeUpperSize;
	private float pipeLowerSize;
	private float bottomBracketDiameter;
	private float bottomBracketWidestSupported;
	private float shankSize;
	private int warranty;
	
	public Frame(int id, String brand, String model, float price, String barcode, String bidi, String material, float size,
			float pipeUpperSize, float pipeLowerSize, float bottomBracketDiameter, float bottomBracketWidestSupported,
			float shankSize, int warranty) {
		super(id, brand, model, price, barcode, bidi);
		this.material = material;
		this.size = size;
		this.pipeUpperSize = pipeUpperSize;
		this.pipeLowerSize = pipeLowerSize;
		this.bottomBracketDiameter = bottomBracketDiameter;
		this.bottomBracketWidestSupported = bottomBracketWidestSupported;
		this.shankSize = shankSize;
		this.warranty = warranty;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Column(columnDefinition = "Decimal(2,2) default '0.0'")
	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	@Column(columnDefinition = "Decimal(2,2) default '0.0'")
	public float getPipeUpperSize() {
		return pipeUpperSize;
	}

	public void setPipeUpperSize(float pipeUpperSize) {
		this.pipeUpperSize = pipeUpperSize;
	}

	@Column(columnDefinition = "Decimal(2,2) default '0.0'")
	public float getPipeLowerSize() {
		return pipeLowerSize;
	}

	public void setPipeLowerSize(float pipeLowerSize) {
		this.pipeLowerSize = pipeLowerSize;
	}

	@Column(columnDefinition = "Decimal(2,2) default '0.0'")
	public float getBottomBracketDiameter() {
		return bottomBracketDiameter;
	}

	public void setBottomBracketDiameter(float bottomBracketDiameter) {
		this.bottomBracketDiameter = bottomBracketDiameter;
	}

	@Column(columnDefinition = "Decimal(2,2) default '0.0'")
	public float getBottomBracketWidestSupported() {
		return bottomBracketWidestSupported;
	}

	public void setBottomBracketWidestSupported(float bottomBracketWidestSupported) {
		this.bottomBracketWidestSupported = bottomBracketWidestSupported;
	}

	@Column(columnDefinition = "Decimal(2,2) default '0.0'")
	public float getShankSize() {
		return shankSize;
	}

	public void setShankSize(float shankSize) {
		this.shankSize = shankSize;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	
}
