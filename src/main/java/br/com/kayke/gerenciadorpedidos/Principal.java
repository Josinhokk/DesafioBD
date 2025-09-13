package br.com.kayke.gerenciadorpedidos;

import br.com.kayke.gerenciadorpedidos.model.Categoria;
import br.com.kayke.gerenciadorpedidos.model.Produto;
import br.com.kayke.gerenciadorpedidos.repositorios.produtoRepositorio;

public class Principal {

    private produtoRepositorio produtoRepositorio;

    public Principal(produtoRepositorio produtoRepositorio) {
        this.produtoRepositorio = produtoRepositorio;
    }

    public void teste(){
        Produto p = new Produto("Paçoca", 50);
        produtoRepositorio.save(p);


    }
}
