
package entity;

/**
 *
 * @author willyam evangelista / João Souza
 */
public class Usuarios {
    private Integer IdUsuarios;
    private String nomeUsuarios;
    private String senhaUsuarios;
    private String cpfUsuarios;
    private String emailUsuarios;
    private String perfilUsuarios;
    
public Usuarios (){

}
    public Usuarios(Integer IdUsuarios, String nomeUsuarios, String senhaUsuarios, String cpfUsuarios, String emailUsuarios, String perfilUsuarios) {
        this.IdUsuarios = IdUsuarios;
        this.nomeUsuarios = nomeUsuarios;
        this.senhaUsuarios = senhaUsuarios;
        this.cpfUsuarios = cpfUsuarios;
        this.emailUsuarios = emailUsuarios;
        this.perfilUsuarios = perfilUsuarios;
    }
    
   
    

    public Integer getIdUsuarios() {
        return IdUsuarios;
    }

    public void setIdUsuarios(Integer IdUsuarios) {
        this.IdUsuarios = IdUsuarios;
    }
    
    public String getNomeUsuarios() {
        return nomeUsuarios;
    }

    public void setNomeUsuarios(String nomeUsuarios) {
        this.nomeUsuarios = nomeUsuarios;
    }

    public String getSenhaUsuarios() {
        return senhaUsuarios;
    }

    public void setSenhaUsuarios(String senhaUsuarios) {
        this.senhaUsuarios = senhaUsuarios;
    }

    public String getCpfUsuarios() {
        return cpfUsuarios;
    }

    public void setCpfUsuarios(String cpfUsuarios) {
        this.cpfUsuarios = cpfUsuarios;
    }

    public String getEmailUsuarios() {
        return emailUsuarios;
    }

    public void setEmailUsuarios(String emailUsuarios) {
        this.emailUsuarios = emailUsuarios;
    }

    public String getPerfilUsuarios() {
        return perfilUsuarios;
    }

    public void setPerfilUsuarios(String perfilUsuarios) {
        this.perfilUsuarios = perfilUsuarios;
    }
   
}
