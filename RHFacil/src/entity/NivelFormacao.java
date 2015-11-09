/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Gustavo
 */
public enum NivelFormacao {
    
    MEDIO(1,"Médio"),
    TECNICO(2,"Técnico"),    
    SUPERIOR(3,"Superior"),
    POSGRADUACAO(4, "Pós Graduação"),
    MESTRADO(5, "Mestrado"),
    DOUTORADO (6, "Doutorado");
        
    private int tipo;
    private String descricao;

    private NivelFormacao(int tipo, String descricao) {
        this.tipo = tipo;
        this.descricao = descricao;
    }    
    
}
