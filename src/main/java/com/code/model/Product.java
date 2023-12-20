package com.code.model;

import java.util.Date;

public class Product {
	private String productId;
	private String productName;
	private String productCode;
	private float importQuality;
	private float soldQuality = 0;
	private float inStockQuality = this.importQuality;
	private float importPrice;
	private float retailPrice;
	private Date creationDate;
	private Date expiry;

	public Product() {
	}

	public Product(String productId, String productName, String productCode, float importQuality, float soldQuality, float inStockQuality, float importPrice, float retailPrice, Date creationDate, Date expiry) {
		this.productId = productId;
		this.productName = productName;
		this.productCode = productCode;
		this.importQuality = importQuality;
		this.soldQuality = soldQuality;
		this.inStockQuality = inStockQuality;
		this.importPrice = importPrice;
		this.retailPrice = retailPrice;
		this.creationDate = creationDate;
		this.expiry = expiry;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getImportQuality() {
		return importQuality;
	}

	public void setImportQuality(float importQuality) {
		this.importQuality = importQuality;
	}

	public float getSoldQuality() {
		return soldQuality;
	}

	public void setSoldQuality(float soldQuality) {
		this.soldQuality = soldQuality;
	}

	public float getInStockQuality() {
		return inStockQuality;
	}

	public void setInStockQuality(float inStockQuality) {
		this.inStockQuality = inStockQuality;
	}

	public float getImportPrice() {
		return importPrice;
	}

	public void setImportPrice(float importPrice) {
		this.importPrice = importPrice;
	}

	public float getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(float retailPrice) {
		this.retailPrice = retailPrice;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getExpiry() {
		return expiry;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	@Override
	public String toString() {
		return "Product{" +
				"productId='" + productId + '\'' +
				", productName='" + productName + '\'' +
				", productCode='" + productCode + '\'' +
				", importQuality=" + importQuality +
				", soldQuality=" + soldQuality +
				", inStockQuality=" + inStockQuality +
				", importPrice=" + importPrice +
				", retailPrice=" + retailPrice +
				", creationDate=" + creationDate +
				", expiry=" + expiry +
				'}';
	}
}
