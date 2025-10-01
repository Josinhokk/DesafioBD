package br.com.kayke.gerenciadorpedidos.repositorios;

import br.com.kayke.gerenciadorpedidos.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface fornecedorRepository extends JpaRepository<Fornecedor, Long>
{
}
