package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

import lombok.Data;

@Data
public class SellerDTO implements Serializable {

	private static final long serialVersionUID = -2177506754313056061L;

	private Long id;
	private String name;

	public SellerDTO(Seller seller) {
		
		id = seller.getId();
		name = seller.getName();
		
	}

}
