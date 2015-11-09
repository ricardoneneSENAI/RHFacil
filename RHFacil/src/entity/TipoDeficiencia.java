package entity;

public enum TipoDeficiencia {    
    FISICA(1,"Física"),
    VISUAL(2,"Visual"),    
    AUDITIVA(3,"Auditiva"),
    INTELECTUAL(4,"Intelectual");
    
    private int tipo;
    private String descricao;

    private TipoDeficiencia(int tipo, String descricao) {
        this.tipo = tipo;
        this.descricao = descricao;
    }
}
