package Desafiojpa.com.br.desafiojpa.repositories.criteria;

import Desafiojpa.com.br.desafiojpa.models.Produto;
import Desafiojpa.com.br.desafiojpa.repositories.criteria.params.ProdutoFilterParam;
import java.util.List;

public interface ProdutoRepositoryCustom {
    List<Produto> getFiltro (ProdutoFilterParam param);

    List<Produto>positivo(Integer codigo);
}