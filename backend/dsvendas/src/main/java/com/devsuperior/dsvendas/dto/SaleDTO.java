package com.devsuperior.dsvendas.dto;

import java.time.LocalDate;

import com.devsuperior.dsvendas.entities.Sale;

import lombok.Data;

@Data
public class SaleDTO {

	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	private SellerDTO seller;
	
	public SaleDTO(Sale sale) {
		
		this.id = sale.getId();
		this.visited = sale.getVisited();
		this.deals = sale.getDeals();
		this.amount = sale.getAmount();
		this.date = sale.getDate();
		this.seller = new SellerDTO(sale.getSeller());
		
	}
	

}
