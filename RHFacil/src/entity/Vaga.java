package entity;

import java.util.List;

public class Vaga {
    private Integer idVagas;
    private Boolean temporaria;
    private String cargo;
    private String funcoesExercidas;
    private Float salario;
    private String cargaHoraria;
    private Boolean disponibilidadeViagem;
    private Boolean vagaPcd;
    private String cnh;
    private List<TipoDeficiencia> tipoDeficiencia;

    public List<TipoDeficiencia> getTipoDeficiencia() {
        return tipoDeficiencia;
    }

    public void setTipoDeficiencia(List<TipoDeficiencia> tipoDeficiencia) {
        this.tipoDeficiencia = tipoDeficiencia;
    }
    
    public Integer getIdVagas() {
        return idVagas;
    }

    public void setIdVagas(Integer idVagas) {
        this.idVagas = idVagas;
    }

    public Boolean isTemporaria() {
        return temporaria;
    }

    public void setTemporaria(Boolean temporaria) {
        this.temporaria = temporaria;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFuncoesExercidas() {
        return funcoesExercidas;
    }

    public void setFuncoesExercidas(String funcoesExercidas) {
        this.funcoesExercidas = funcoesExercidas;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Boolean isDisponibilidadeViagem() {
        return disponibilidadeViagem;
    }

    public void setDisponibilidadeViagem(Boolean disponibilidadeViagem) {
        this.disponibilidadeViagem = disponibilidadeViagem;
    }

    public Boolean isVagaPcd() {
        return vagaPcd;
    }

    public void setVagaPcd(Boolean vagaPcd) {
        this.vagaPcd = vagaPcd;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    
    
}
