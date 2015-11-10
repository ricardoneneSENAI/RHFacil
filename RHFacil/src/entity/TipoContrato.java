/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

/**
 *
 * @author roger_alexsander
 */
public enum TipoContrato {
    MENSAL(1, "Mensal"),
    INDICACAO(2, "Indicação");
    
    private int id;
    private String descricao;

    private TipoContrato(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
    
    
    
    
}
