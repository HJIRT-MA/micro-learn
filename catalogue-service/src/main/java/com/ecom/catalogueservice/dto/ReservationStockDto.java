package com.ecom.catalogueservice.dto;

import java.util.Map;

public class ReservationStockDto {
    private int quantite;
    private Map<Long, Integer> listeProduitIdQuantite;

    public ReservationStockDto() {
    }

    public ReservationStockDto(int quantite) {
        this.quantite = quantite;
    }

    public ReservationStockDto(Map<Long, Integer> listeProduitIdQuantite) {
        this.listeProduitIdQuantite = listeProduitIdQuantite;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Map<Long, Integer> getListeProduitIdQuantite() {
        return listeProduitIdQuantite;
    }

    public void setListeProduitIdQuantite(Map<Long, Integer> listeProduitIdQuantite) {
        this.listeProduitIdQuantite = listeProduitIdQuantite;
    }
}