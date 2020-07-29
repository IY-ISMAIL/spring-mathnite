package br.com.mathnite.spring.dto;

import br.com.mathnite.spring.model.Address;

public class AddressDto {
    private Long id;
    private String logradouro;
    private Integer numero;
    private String bairro;
    private Long cep;
    private String cidade;
    private String estado;
    private String complemento;

    public AddressDto(Address address) {
        this.id = address.getId();
        this.logradouro = address.getLogradouro();
        this.numero = address.getNumero();
        this.bairro = address.getBairro();
        this.cep = address.getCep();
        this.cidade = address.getCidade();
        this.estado = address.getEstado();
        this.complemento = address.getComplemento();
    }
    public AddressDto() { }

    public Long getId() {
        return id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public Long getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getComplemento() {
        return complemento;
    }
}
