package Desafiojpa.com.br.desafiojpa.controllers;
import Desafiojpa.com.br.desafiojpa.models.EstoqueMovimento;
import Desafiojpa.com.br.desafiojpa.services.EstoqueMovimentoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EstoqueMovimentoController {

    private EstoqueMovimentoService estoqueMovimentoService;

    @GetMapping(value = "/adicionar/estoque")
    public ResponseEntity novoEstoque(@RequestBody EstoqueMovimento estoqueMovimento) {
        return new ResponseEntity(estoqueMovimento, HttpStatus.CREATED);
    }
    @GetMapping(value = "/listar")
    public ResponseEntity listarTodosFuncionario() {
        return new ResponseEntity(estoqueMovimentoService.listarTudo(), HttpStatus.OK);
    }
    public ResponseEntity listarHistoricoEstoque(Integer codigo){
        return new ResponseEntity(estoqueMovimentoService.listarHistoricoEstoque(codigo),HttpStatus.OK);
    }
    @DeleteMapping
    public ResponseEntity deletar(@PathVariable Integer codigo) {
        estoqueMovimentoService.remover(codigo);
        return new ResponseEntity(HttpStatus.OK);
    }
    @PutMapping(value = "/atualizar/{codigo}")
    public ResponseEntity atualizarEstoque(@PathVariable Integer codigo, @RequestBody EstoqueMovimento estoqueMovimento){
        estoqueMovimentoService.update(codigo, estoqueMovimento);
        return new ResponseEntity(codigo, HttpStatus.OK);
    }
}


