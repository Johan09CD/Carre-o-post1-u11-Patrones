package com.universidad.refactoringu11.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String clienteNombre;
    private double total;

    public Pedido() {
    }

    public Pedido(String clienteNombre, double total) {
        this.clienteNombre = clienteNombre;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public String getClienteNombre() {
        return clienteNombre;
    }

    public double getTotal() {
        return total;
    }
}
