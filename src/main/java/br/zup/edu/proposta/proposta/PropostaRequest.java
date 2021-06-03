package br.zup.edu.proposta.proposta;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;

public class PropostaRequest {
    @NotBlank
    private String documentos;
    @NotBlank @Email
    private String email;
    @NotBlank
    private String nome;
    @NotBlank
    private String endereco;
    @PositiveOrZero
    private BigDecimal salario;

    public PropostaRequest(String documentos,
                           String email, String nome, String endereco,
                           BigDecimal salario) {
        this.documentos = documentos;
        this.email = email;
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
    }

    public String getDocumentos() {
        return documentos;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public Proposta toProposta(){
        return new Proposta(documentos, email,nome, endereco, salario);
    }
}
