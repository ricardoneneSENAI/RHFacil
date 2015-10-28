package entity;

import java.util.Date;
import java.util.List;

public class Curriculo {    
    private Integer id;
    private String nome;
    private Date dtNascimento;
    private String endereco;
    private List<String> telefone;
    private List<String> email;
    private Character cnh;
    private Character deficiencia;
    private String objetivo;    

    public Curriculo() {
    }

    public Curriculo(Integer id, String nome, Date dtNascimento, String endereco, List<String> telefone, List<String> email, Character cnh, Character deficiencia, String objetivo) {
        this.id = id;
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cnh = cnh;
        this.deficiencia = deficiencia;
        this.objetivo = objetivo;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<String> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<String> telefone) {
        this.telefone = telefone;
    }

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
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

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
    
    @Override
    public String toString() {
        return "Curriculo{" + "nome=" + nome + '}';
    }
                        
}
