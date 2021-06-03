package br.zup.edu.proposta.proposta;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Proposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = true, unique = true)
    private String documentos;
    @Column(nullable = true)
    private String email;
    @Column(nullable = true)
    private String nome;
    @Column(nullable = true)
    private String endereco;
    @Column(nullable = true)
    private BigDecimal salario;

    public Proposta() {
    }

    public Proposta(String documentos, String email,
                    String nome, String endereco, BigDecimal salario) {
        this.documentos = documentos;
        this.email = email;
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
    }

    public Long getId() {
        return id;
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
}
