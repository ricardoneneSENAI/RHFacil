/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author elielson_freitas
 */
public class EmpresaDAO {

    public Empresa salvar(Empresa empresa) {
        Empresa retorno = null;

        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:mysql://localhost/senai", "root", "");
            if (Empresa.getId() == null) {
                String query = "insert into empresa ()";
                PreparedStatement sttm = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                sttm.setInt(1, empresa.getEmpresa().getIdEmpresa());
                sttm.executeUpdate();
                ResultSet rs = sttm.getGeneratedKeys();
                if (rs.next()) {
                    empresa.setId(rs.getInt(1));
                }
                retorno = empresa;
                sttm.close();
            } else {
                String query = "insert into empresa ()";
                PreparedStatement sttm = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                sttm.setInt(1, empresa.getEmpresa().getIdEmpresa());
                sttm.executeUpdate();
                retorno = empresa;
                sttm.close();
            }
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return retorno;
    }
}
