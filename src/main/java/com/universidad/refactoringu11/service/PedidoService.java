package com.universidad.refactoringu11.service;

import com.universidad.refactoringu11.domain.CodigoDescuento;
import com.universidad.refactoringu11.domain.DatosCliente;
import com.universidad.refactoringu11.domain.LineaPedido;
import com.universidad.refactoringu11.domain.Pedido;
import com.universidad.refactoringu11.repository.PedidoRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    private final PedidoRepository repo;
    private final NotificacionService notificacion;

    public PedidoService(PedidoRepository repo, NotificacionService notificacion) {
        this.repo = repo;
        this.notificacion = notificacion;
    }

    public String procesarPedido(DatosCliente cliente, LineaPedido[] lineas,
                                 String metodoPago, boolean esUrgente,
                                 CodigoDescuento descuento) {
        double total = calcularTotal(lineas);
        double totalConDescuento = aplicarDescuento(total, descuento);
        notificacion.notificarPedido(cliente, esUrgente);
        return persistirPedido(cliente, totalConDescuento);
    }

    private double calcularTotal(LineaPedido[] lineas) {
        double total = 0;
        for (LineaPedido linea : lineas) {
            total += linea.getPrecioUnitario() * linea.getCantidad();
        }
        return total;
    }

    private double aplicarDescuento(double total, CodigoDescuento descuento) {
        return descuento != null ? total * (1 - descuento.getPorcentaje()) : total;
    }

    private String persistirPedido(DatosCliente cliente, double total) {
        Pedido pedido = new Pedido(cliente.getNombre(), total);
        return "OK_" + repo.save(pedido).getId();
    }
}
