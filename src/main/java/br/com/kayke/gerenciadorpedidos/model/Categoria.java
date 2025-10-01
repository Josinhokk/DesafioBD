package br.com.kayke.gerenciadorpedidos.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    //Fetch type para Eager para evitar o erro lazy
    //cascade ja salva as operações em cascada
    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Produto> produtos;

    public Categoria() {}

    public long getId() {
        return id;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public String getNome() {
        return nome;
    }

    public Categoria(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
