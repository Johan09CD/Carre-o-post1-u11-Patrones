package com.universidad.refactoringu11.domain;

public class LineaPedido {
    private final Long productoId;
    private final double precioUnitario;
    private final int cantidad;

    public LineaPedido(Long productoId, double precioUnitario, int cantidad) {
        this.productoId = productoId;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public Long getProductoId() {
        return productoId;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }
}
