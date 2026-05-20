package com.universidad.refactoringu11.domain;

import java.util.Objects;

public class DatosCliente {
    private final String nombre;
    private final String email;
    private final String telefono;
    private final Direccion direccion;

    public DatosCliente(String nombre, String email, String telefono, Direccion direccion) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("Nombre requerido");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email invalido");
        }
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DatosCliente that = (DatosCliente) o;
        return Objects.equals(nombre, that.nombre)
                && Objects.equals(email, that.email)
                && Objects.equals(telefono, that.telefono)
                && Objects.equals(direccion, that.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, email, telefono, direccion);
    }
}
