package br.com.kayke.gerenciadorpedidos.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Pedido {

    @Id
    long id;
    LocalDate data;

    @ManyToMany
    @JoinTable(
            name = "pedido_produto",
            joinColumns = @JoinColumn(name = "pedido_id"),
            inverseJoinColumns = @JoinColumn(name = "produto_id")
    )
    private List<Produto> produtos;


    public Pedido() {

    }

    public long getId() {
        return id;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public LocalDate getData() {
        return data;
    }

    public Pedido(long id, LocalDate data) {
        this.id = id;
        this.data = data;
    }
}
