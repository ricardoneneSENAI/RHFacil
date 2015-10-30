package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import entity.Usuarios;

public class UsuarioDAO {

    public Usuarios salvar(Usuarios usuario) {
        Usuarios retorno = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/senai", "root", "");
            if (usuario.getIdUsuarios() == null) {
                String query = "insert into usuario(idUsuarios, nomeUsuarios, senhaUsuarios, "
                        + "cpfUsuarios, emailUsuarios, perfilUsuarios) "
                        + "values(?,?,?,?,?,?)";
                PreparedStatement sttm = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                sttm.setString(1, usuario.getNomeUsuarios());
                sttm.setString(2, usuario.getSenhaUsuarios());
                sttm.setString(3, usuario.getCpfUsuarios());
                sttm.setString(4, usuario.getEmailUsuarios());
                sttm.setString(5, usuario.getPerfilUsuarios());
//              
                sttm.executeUpdate();
                ResultSet rs = sttm.getGeneratedKeys();
                if (rs.next()) {
                    usuario.setIdUsuarios(rs.getInt(1));
                }
                retorno = usuario;
                sttm.close();
            } else {
                String query = "update produto set idvaga=?";
                PreparedStatement sttm = conn.prepareStatement(query);
                sttm.setInt(1, usuario.getIdUsuarios());
                sttm.setString(2, usuario.getNomeUsuarios());
                sttm.setString(3, usuario.getSenhaUsuarios());
                sttm.setString(4, usuario.getCpfUsuarios());
                sttm.setString(5, usuario.getEmailUsuarios());
                sttm.setString(6, usuario.getPerfilUsuarios());

                sttm.executeUpdate();
                retorno = usuario;
                sttm.close();
            }
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return retorno;
    }
    
}
