package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

import lombok.Data;

@Data
public class SaleSumDTO implements Serializable {

	private static final long serialVersionUID = -4332198787101967674L;

	private String sellerName;
	private Double sum;

	public SaleSumDTO(Seller seller, Double sum) {
		this.sellerName = seller.getName();
		this.sum = sum;
	}

}
