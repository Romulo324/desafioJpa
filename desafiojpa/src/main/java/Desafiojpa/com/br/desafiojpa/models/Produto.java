package Desafiojpa.com.br.desafiojpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity(name = "tb_produto")
public class Produto {
    @Id
    private Integer codigo;
    @ManyToOne
    private EstoqueMovimento estoque_movimento;
    @Column(length = 256)
    private String descricao;

    @Column(name = "preco_venda")
    private BigDecimal precoVenda;

    private Integer saldoAtual;

}
