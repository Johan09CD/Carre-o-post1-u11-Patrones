package com.universidad.refactoringu11.domain;

public class Direccion {
    private final String calle;
    private final String ciudad;
    private final String codigoPostal;

    public Direccion(String calle, String ciudad, String codigoPostal) {
        if (calle == null || calle.isBlank()) {
            throw new IllegalArgumentException("Calle requerida");
        }
        if (ciudad == null || ciudad.isBlank()) {
            throw new IllegalArgumentException("Ciudad requerida");
        }
        if (codigoPostal == null || codigoPostal.isBlank()) {
            throw new IllegalArgumentException("Codigo postal requerido");
        }
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    public String getCalle() {
        return calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }
}
