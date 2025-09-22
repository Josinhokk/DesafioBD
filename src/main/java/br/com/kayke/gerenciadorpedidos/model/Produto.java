package br.com.kayke.gerenciadorpedidos.model;

import jakarta.persistence.*;

@Entity
public class Produto {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, unique = true)
    private String nome;

    @Column(name = "valor")
    private double preco;

    @ManyToOne
    @JoinColumn(name = "categoia_id")
    private Categoria categoria;

    public Produto() {}


    public double getPreco() {
        return preco;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}
