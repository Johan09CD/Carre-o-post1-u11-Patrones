package com.universidad.refactoringu11.service;

import com.universidad.refactoringu11.domain.DatosCliente;
import org.springframework.stereotype.Service;

@Service
public class NotificacionService {
    public void notificarPedido(DatosCliente cliente, boolean urgente) {
        System.out.println("Enviando email a: " + cliente.getEmail());
        System.out.println("Pedido urgente: " + urgente);
    }
}
