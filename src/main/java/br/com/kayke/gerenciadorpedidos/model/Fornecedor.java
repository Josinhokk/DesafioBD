package br.com.kayke.gerenciadorpedidos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;


    public Fornecedor(String nome) {
        this.nome = nome;
    }

    public Fornecedor() {

    }
}
