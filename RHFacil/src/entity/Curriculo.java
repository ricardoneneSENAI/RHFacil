package entity;

import java.util.Date;

public class Curriculo {    
    private Integer id;
    private String nome;
    private Date dtNascimento;
    private String objetivo; 
    private Character cnh;
    private Character deficiencia;
    private String cep;
    private String cidade;
    private String uf;
    private String bairro;
    private String rua;
    private Integer numero;
    private String complemento;
   
       

    public Curriculo() {
    }

    public Curriculo(Integer id, String nome, Date dtNascimento, String objetivo, Character cnh, Character deficiencia, String cep, String cidade, String uf, String bairro, String rua, Integer numero, String complemento) {
        this.id = id;
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.objetivo = objetivo;
        this.cnh = cnh;
        this.deficiencia = deficiencia;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public Character getCnh() {
        return cnh;
    }

    public void setCnh(Character cnh) {
        this.cnh = cnh;
    }

    public Character getDeficiencia() {
        return deficiencia;
    }

    public void setDeficiencia(Character deficiencia) {
        this.deficiencia = deficiencia;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    
                        
}
