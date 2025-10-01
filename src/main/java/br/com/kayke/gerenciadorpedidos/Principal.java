package br.com.kayke.gerenciadorpedidos;

import br.com.kayke.gerenciadorpedidos.model.Categoria;
import br.com.kayke.gerenciadorpedidos.model.Fornecedor;
import br.com.kayke.gerenciadorpedidos.model.Pedido;
import br.com.kayke.gerenciadorpedidos.model.Produto;
import br.com.kayke.gerenciadorpedidos.repositorios.categoriaRepositorio;
import br.com.kayke.gerenciadorpedidos.repositorios.fornecedorRepository;
import br.com.kayke.gerenciadorpedidos.repositorios.pedidoRepositorio;
import br.com.kayke.gerenciadorpedidos.repositorios.produtoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

//essa anotação transforma a classe principal em uma classe gerenciada pelo Spring
@Component
public class Principal  {
    Scanner leitura = new Scanner(System.in);


    @Autowired
    private categoriaRepositorio categoriaRepositorio;
    @Autowired
    private pedidoRepositorio pedidoRepositorio;
    @Autowired
    private produtoRepositorio produtoRepositorio;

    @Autowired
    private fornecedorRepository forneceedorRepositorio;

//    public Principal(produtoRepositorio produtoRepositorio) {
//        this.produtoRepositorio = produtoRepositorio;
//    }

    public void teste(){
        //Neste codigo abaixo estamos criando as categorias
        Categoria categoriaEletronicos = new Categoria(null, "Eletronicos");
        Categoria categoriaComidas = new Categoria(null, "Comidas");
        //Salvando categorias
        categoriaRepositorio.saveAll(List.of(categoriaEletronicos,categoriaComidas));

        // Criando fornecedores
        Fornecedor fornecedorTech = new Fornecedor("Tech Supplier");
        Fornecedor fornecedorLivros = new Fornecedor("Livraria Global");
        forneceedorRepositorio.saveAll(List.of(fornecedorTech, fornecedorLivros));



        //Aqui vamos criar e associar o produto com as categorias
        Produto p1 = new Produto("Paçoca", 50, categoriaComidas);
        Produto p2 = new Produto("Celular", 2000, categoriaEletronicos);
        Produto p3 = new Produto("Pizza", 80, categoriaComidas);
        //fornecedor
        p1.setFornecedor(fornecedorTech);
        p2.setFornecedor(fornecedorLivros);
        p3.setFornecedor(fornecedorTech);
        //Associando os produtos ás categorias
        categoriaComidas.setProdutos(List.of(p1,p3));
        categoriaEletronicos.setProdutos(List.of(p2));
        produtoRepositorio.saveAll(List.of(p1,p2,p3));

        //Criando pedidos e associando aos produtos
        Pedido pedido = new Pedido(1L, LocalDate.now());
        pedido.setProdutos(List.of(p1,p3));
        pedidoRepositorio.save(pedido);


        System.out.println("Categorias e seus produtos: ");
        categoriaRepositorio.findAll().forEach(c -> {
            System.out.println("Categoria: " + c.getNome());
            c.getProdutos().forEach(p ->
                    System.out.printf(" - Produto: " + p.getNome()));
        });

        acharProduto();

    }
    private void acharProduto(){
        System.out.println("Digite o nome exato do produto:");
        var produto = leitura.nextLine();
        Produto produtoEcontrado = produtoRepositorio.findByNomeEquals(produto);
        System.out.println("Produto: " + produtoEcontrado.getNome());

    }
}