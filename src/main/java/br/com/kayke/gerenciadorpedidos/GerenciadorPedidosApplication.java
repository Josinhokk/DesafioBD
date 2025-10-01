package br.com.kayke.gerenciadorpedidos;

import br.com.kayke.gerenciadorpedidos.model.Produto;
import br.com.kayke.gerenciadorpedidos.repositorios.categoriaRepositorio;
import br.com.kayke.gerenciadorpedidos.repositorios.pedidoRepositorio;
import br.com.kayke.gerenciadorpedidos.repositorios.produtoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GerenciadorPedidosApplication implements CommandLineRunner {

    @Autowired
    private Principal principal;

    public static void main(String[] args) {
        SpringApplication.run(GerenciadorPedidosApplication.class, args);
    }



    @Override
    public void run(String... args) throws Exception {
        principal.teste();
}}
