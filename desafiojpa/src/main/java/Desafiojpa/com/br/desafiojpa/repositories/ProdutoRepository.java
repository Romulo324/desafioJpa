package Desafiojpa.com.br.desafiojpa.repositories;

import Desafiojpa.com.br.desafiojpa.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    public List <Produto> findByDescricaoContainingIgnoreCase(String descricao);

}
