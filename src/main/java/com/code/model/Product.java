package com.code.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	private String productName;
	private String productCode;
	private float importQuality;
	private float soldQuality = 0;
	private float inStockQuality;
	private float importPrice;
	private float retailPrice;
	private String status = "InStock";
	private LocalDate creationDate = LocalDate.now();
	private LocalDate expiry;
}
