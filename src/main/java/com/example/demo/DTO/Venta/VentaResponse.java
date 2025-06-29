package com.example.demo.DTO.Venta;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import lombok.Data;

@Data
public class VentaResponse {
    private Long id;
    private LocalDate fecha;
    private LocalTime hora;
    private String usuarioCorreo;
    private double total;
    private String metodoPago;
    private List<DetalleVentaDTO> detalles;
}
