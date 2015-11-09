package entity;

public enum TipoDeficiencia {
    AUDITIVA(1,"Auditiva"),
    FISICA(2,"Física"),
    MENTAL(3,"Mental"),
    VISUAL(4,"Visual");
    
    private int tipo;
    private String descricao;

    private TipoDeficiencia(int tipo, String descricao) {
        this.tipo = tipo;
        this.descricao = descricao;
    }
}
