/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author Gustavo
 */
public class Experiencia {
    
    private Integer id;
    private String empresa;
    private Date dtInicio;
    private Date dtFim;
    private Boolean atual;
    private String cargo;
    private String atividade;

    public Experiencia() {
    }

    public Experiencia(Integer id, String empresa, Date dtInicio, Date dtFim, Boolean atual, String cargo, String atividade) {
        this.id = id;
        this.empresa = empresa;
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.atual = atual;
        this.cargo = cargo;
        this.atividade = atividade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Date getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(Date dtInicio) {
        this.dtInicio = dtInicio;
    }

    public Date getDtFim() {
        return dtFim;
    }

    public void setDtFim(Date dtFim) {
        this.dtFim = dtFim;
    }

    public Boolean getAtual() {
        return atual;
    }

    public void setAtual(Boolean atual) {
        this.atual = atual;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
    
    
    
}
