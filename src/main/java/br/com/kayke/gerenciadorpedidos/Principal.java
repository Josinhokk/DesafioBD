package br.com.kayke.gerenciadorpedidos;

import br.com.kayke.gerenciadorpedidos.model.Categoria;
import br.com.kayke.gerenciadorpedidos.model.Produto;
import br.com.kayke.gerenciadorpedidos.repositorios.produtoRepositorio;

import java.util.List;
import java.util.Scanner;

public class Principal {

    Scanner leitura = new Scanner(System.in);
    private int opcao = -1;


    private produtoRepositorio produtoRepositorio;

    public Principal(produtoRepositorio produtoRepositorio) {
        this.produtoRepositorio = produtoRepositorio;
    }

    public void teste(){

        while(opcao != 0){

            System.out.println("Oque deseja fazer?");
            System.out.println("""
                Digite 1 - Para adicionar um produto
                Digite 0 - Para Sair""");
            opcao = leitura.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    String nome = leitura.nextLine().toLowerCase();

                    Produto p = new Produto(nome, 50);
                    produtoRepositorio.save(p);
                    break;
                case 2:
                    List<Produto> produtos = produtoRepositorio.findAll();
                    System.out.println(produtos);
                    break;
                default:
                    System.out.println("Opção invalida!!!");
                    break;
            }

        }

        Produto p = new Produto("Paçoca", 50);
        produtoRepositorio.save(p);

    }
}