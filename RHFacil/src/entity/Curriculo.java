package entity;

import java.util.Date;
import java.util.List;

public class Curriculo {

    private Integer id;
    private String nome;
    private Date dtNascimento;
    private String objetivo;
    private String cnh;
    private String cep;
    private String cidade;
    private String uf;
    private String bairro;
    private String rua;
    private Integer numero;
    private String complemento;
    private List<TipoDeficiencia> deficiencia;
    private List<Telefone> telefone;
    private List<String> email;
    private List<Competencia> competencia;
    private List<Experiencia> experiencia;
    private List<Formacao> formacao;

    public Curriculo() {
    }

    public Curriculo(Integer id, String nome, Date dtNascimento, String objetivo, String cnh, String cep, String cidade, String uf, String bairro, String rua, Integer numero, String complemento, List<TipoDeficiencia> deficiencia, List<Telefone> telefone, List<String> email, List<Competencia> competencia, List<Experiencia> experiencia, List<Formacao> formacao) {
        this.id = id;
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.objetivo = objetivo;
        this.cnh = cnh;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.deficiencia = deficiencia;
        this.telefone = telefone;
        this.email = email;
        this.competencia = competencia;
        this.experiencia = experiencia;
        this.formacao = formacao;
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

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
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

    public List<TipoDeficiencia> getDeficiencia() {
        return deficiencia;
    }

    public void setDeficiencia(List<TipoDeficiencia> deficiencia) {
        this.deficiencia = deficiencia;
    }

    public List<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<Telefone> telefone) {
        this.telefone = telefone;
    }

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }

    public List<Competencia> getCompetencia() {
        return competencia;
    }

    public void setCompetencia(List<Competencia> competencia) {
        this.competencia = competencia;
    }

    public List<Experiencia> getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(List<Experiencia> experiencia) {
        this.experiencia = experiencia;
    }

    public List<Formacao> getFormacao() {
        return formacao;
    }

    public void setFormacao(List<Formacao> formacao) {
        this.formacao = formacao;
    }

    
    
    
}

