package br.com.kayke.gerenciadorpedidos.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    private List<Produto> produtos;

    public Categoria() {}

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Categoria(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
