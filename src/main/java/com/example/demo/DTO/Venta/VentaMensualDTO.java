package com.example.demo.DTO.Venta;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VentaMensualDTO {
    private int anio;
    private int mes;
    private double total;
}