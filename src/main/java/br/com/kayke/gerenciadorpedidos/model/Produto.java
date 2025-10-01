package br.com.kayke.gerenciadorpedidos.model;

import jakarta.persistence.*;

import java.util.List;

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

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @ManyToOne
    @JoinColumn(name = "fornecedor_id")
    private Fornecedor fornecedor;

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

    public Produto(String nome, double preco, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }
}
