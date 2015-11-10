/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.List;

/**
 *
 * @author Gustavo
 */
public class Formacao {
    
    private Integer id;
    private String titulo;
    private Integer anoInicio;
    private Integer anoConclusao;
    private String instituicao;
    private List<NivelFormacao> nivelFormacao;
    private String area;
    private Boolean cursando;

    public Formacao() {
    }

    public Formacao(Integer id, String titulo, Integer anoInicio, Integer anoConclusao, String instituicao, List<NivelFormacao> nivelFormacao, String area, Boolean cursando) {
        this.id = id;
        this.titulo = titulo;
        this.anoInicio = anoInicio;
        this.anoConclusao = anoConclusao;
        this.instituicao = instituicao;
        this.nivelFormacao = nivelFormacao;
        this.area = area;
        this.cursando = cursando;
    }

    public Boolean getCursando() {
        return cursando;
    }

    public void setCursando(Boolean cursando) {
        this.cursando = cursando;
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(Integer anoInicio) {
        this.anoInicio = anoInicio;
    }

    public Integer getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(Integer anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public List<NivelFormacao> getNivelFormacao() {
        return nivelFormacao;
    }

    public void setNivelFormacao(List<NivelFormacao> nivelFormacao) {
        this.nivelFormacao = nivelFormacao;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    
    
}
