package br.com.kayke.gerenciadorpedidos.repositorios;

import br.com.kayke.gerenciadorpedidos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface produtoRepositorio extends JpaRepository<Produto, Long> {
    Produto findByNomeEquals(String produto);
}
