package com.code.model;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product {
	private String productId;
	private String productName;
	private String productCode;
	private String image;
	private float importQuality;
	private float soldQuality = 0;
	private float inStockQuality;
	private float importPrice;
	private float retailPrice;
	private String status;
	private Date creationDate;
	private Date expiry;
}
