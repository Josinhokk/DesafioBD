package br.com.kayke.gerenciadorpedidos.repositorios;

import br.com.kayke.gerenciadorpedidos.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface categoriaRepositorio extends JpaRepository<Categoria, Long> {
}
