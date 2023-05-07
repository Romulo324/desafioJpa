package Desafiojpa.com.br.desafiojpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity(name = "tb_funcionario_responsavel")
public class FuncionarioResponsavel {

    @Id
    private Integer codigo;


    @Column(length = 256)
    private String nome;
    @Column(length = 50)
    private String cpf;

    @Column(length = 20)
    private String cargo;

    @ManyToOne
    private EstoqueMovimento estoqueMovimento;
}