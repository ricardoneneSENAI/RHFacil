package dao;

import java.sql.Connection;
//import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class VagasDAO {

    public Vaga salvar(Vaga vaga) {
        Vaga retorno = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/senai", "root", "");
            if (vaga.getId() == null) {
                String query = "insert into vaga() values()";
                PreparedStatement sttm = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                sttm.setString(1, vaga.getNome());
//                Date dataValidadeSql = new Date(vaga.getValidade().getTime());
//                sttm.setDate(2, dataValidadeSql);
                sttm.executeUpdate();
                ResultSet rs = sttm.getGeneratedKeys();
                if (rs.next()) {
                    vaga.setId(rs.getInt(1));
                }
                retorno = vaga;
                sttm.close();
            } else {
                String query = "update produto set idvaga=?";
                PreparedStatement sttm = conn.prepareStatement(query);
                sttm.setInt(1, vaga.getId());
                sttm.setString(2, vaga.getNome());
//                Date dataValidadeSql = new Date(vaga.getValidade().getTime());
//                sttm.setDate(3, dataValidadeSql);
                sttm.executeUpdate();
                retorno = vaga;
                sttm.close();
            }
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return retorno;
    }
    
}
