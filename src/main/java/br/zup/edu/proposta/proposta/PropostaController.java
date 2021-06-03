package br.zup.edu.proposta.proposta;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/propostas")
public class PropostaController {

    private PropostaRepository repository;

    public PropostaController(PropostaRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Proposta salvarProposta(@RequestBody @Valid PropostaRequest request){
        return repository.save(request.toProposta());
    }

}
