package Desafiojpa.com.br.desafiojpa.repositories.criteria;

import Desafiojpa.com.br.desafiojpa.models.EstoqueMovimento;
import Desafiojpa.com.br.desafiojpa.repositories.criteria.params.ProdutoFilterParam;
import java.util.List;

public interface EstoqueRepositoryCustom {
    List<EstoqueMovimento> getFiltro(ProdutoFilterParam param);
}