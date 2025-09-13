package br.com.kayke.gerenciadorpedidos.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Pedido {

    @Id
    long id;
    LocalDate data;

    public Pedido() {

    }

    public long getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public Pedido(long id, LocalDate data) {
        this.id = id;
        this.data = data;
    }
}
