package com.universidad.refactoringu11.domain;

public enum CodigoDescuento {
    VIP10(0.10),
    NEW20(0.20);

    private final double porcentaje;

    CodigoDescuento(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }
}
