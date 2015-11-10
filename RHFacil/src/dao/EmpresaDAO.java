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

    public Empresas salvar(Empresas empresas) {
        Empresas retorno = null;
        try {
            
            Connection conn = ConnectionManager.getConnection();
            if (empresas.getIdEmpresas()== null) {
                String query = "insert into empresas "
                        + "(nome_fantasia, razao_social, cnpj, inscricao_estadual, logradouro, "
                        + "numero, complemento, cep, bairro, uf, cidade, contrato, data_inicio, data_fim) values"
                        + " (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement sttm = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
              //  sttm.setInt(1, empresas.getIdEmpresas());
                sttm.setString(1, empresas.getNome_fantasia());
                sttm.setString(2, empresas.getRazao_social());
                sttm.setString(3, empresas.getCnpj());
                sttm.setString(4, empresas.getInscricao_estadual());
                sttm.setString(5, empresas.getLogradouro());
                sttm.setString(6, empresas.getNumero());
                sttm.setString(7, empresas.getComplemento());
                sttm.setString(8, empresas.getCep());
                sttm.setString(9, empresas.getBairro());
                sttm.setString(10, empresas.getUf());
                sttm.setString(11, empresas.getCidade());
                sttm.setInt(12, empresas.getContrato().getId());
                sttm.setString(13, empresas.getData_inicio());
                sttm.setString(14, empresas.getData_fim());
                sttm.executeUpdate();
                ResultSet rs = sttm.getGeneratedKeys();
                if (rs.next()) {
                    empresas.setIdEmpresas(rs.getInt(1));
                }
                retorno = empresas;
                sttm.close();
            } else {
                String query = "insert into empresas "
                        + "(nome_fantasia, razao_social, cnpj, inscricao_estadual, logradouro, "
                        + "numero, complemento, cep, bairro, uf, cidade, contrato, data_inicio, data_fim) values "
                        + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement sttm = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
               // sttm.setInt(1, empresas.getIdEmpresas());
                sttm.setString(1, empresas.getNome_fantasia());
                sttm.setString(2, empresas.getRazao_social());
                sttm.setString(3, empresas.getCnpj());
                sttm.setString(4, empresas.getInscricao_estadual());
                sttm.setString(5, empresas.getLogradouro());
                sttm.setString(6, empresas.getNumero());
                sttm.setString(7, empresas.getComplemento());
                sttm.setString(8, empresas.getCep());
                sttm.setString(9, empresas.getBairro());
                sttm.setString(10, empresas.getUf());
                sttm.setString(11, empresas.getCidade());
                sttm.setInt(12, empresas.getContrato().getId());
                sttm.setString(13, empresas.getData_inicio());
                sttm.setString(14, empresas.getData_fim());
                sttm.executeUpdate();
                retorno = empresas;
                sttm.close();
            }
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return retorno;
    }
}
