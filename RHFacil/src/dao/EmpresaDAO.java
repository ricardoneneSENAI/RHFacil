/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Empresas;
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

    public Empresas salvar(Empresas empresa) {
        Empresas retorno = null;
        try {
            
            Connection conn = ConnectionManager.getConnection();
            if (empresa.getIdEmpresas()== null) {
                String query = "insert into empresa "
                        + "(idEmpresa, nomeEmpresa, razaoSocial, CNPJ, inscricaoEstadual, logradouro, "
                        + "numero, complemento, CEP, bairro, UF, cidade) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement sttm = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                sttm.setInt(1, empresa.getIdEmpresas());
                sttm.setString(2, empresa.getNomeEmpresa());
                sttm.setString(3, empresa.getRazaoSocial());
                sttm.setString(4, empresa.getCNPJ());
                sttm.setString(5, empresa.getInscricaoEstadual());
                sttm.setString(6, empresa.getLogradouro());
                sttm.setString(7, empresa.getNumero());
                sttm.setString(8, empresa.getComplemento());
                sttm.setString(9, empresa.getCEP());
                sttm.setString(10, empresa.getBairro());
                sttm.setString(11, empresa.getUF());
                sttm.setString(12, empresa.getCidade());
                sttm.executeUpdate();
                ResultSet rs = sttm.getGeneratedKeys();
                if (rs.next()) {
                    empresa.setIdEmpresas(rs.getInt(1));
                }
                retorno = empresa;
                sttm.close();
            } else {
                String query = "insert into empresa "
                        + "(idEmpresa, nomeEmpresa, razaoSocial, CNPJ, inscricaoEstadual, logradouro, "
                        + "numero, complemento, CEP, bairro, UF, cidade) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement sttm = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                sttm.setInt(1, empresa.getIdEmpresas());
                sttm.setString(2, empresa.getNomeEmpresa());
                sttm.setString(3, empresa.getRazaoSocial());
                sttm.setString(4, empresa.getCNPJ());
                sttm.setString(5, empresa.getInscricaoEstadual());
                sttm.setString(6, empresa.getLogradouro());
                sttm.setString(7, empresa.getNumero());
                sttm.setString(8, empresa.getComplemento());
                sttm.setString(9, empresa.getCEP());
                sttm.setString(10, empresa.getBairro());
                sttm.setString(11, empresa.getUF());
                sttm.setString(12, empresa.getCidade());
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
