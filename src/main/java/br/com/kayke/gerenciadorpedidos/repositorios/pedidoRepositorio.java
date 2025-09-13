package br.com.kayke.gerenciadorpedidos.repositorios;

import br.com.kayke.gerenciadorpedidos.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface pedidoRepositorio extends JpaRepository<Pedido, Long> {
}
