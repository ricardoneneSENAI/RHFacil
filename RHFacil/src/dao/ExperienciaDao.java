/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import entity.Experiencia;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author joao_petri
 */
public class ExperienciaDao {
    
    public int salvar(Experiencia experiencia) {
    
        //Inicializando o retorno da função, caso tenha algum problema deve ser retornado o valor -1
        int resultado = -1;

        try {
            PreparedStatement stmt = null;
            Connection conn = ConnectionManager.getConnection();

            /*ARRUMAR BANCO*/ String QUERY_INSERT = "insert into experiencia " + 
                "(idExperiencia, idCurriculo, empresa, dtinicio, dtfim, atual, cargo, atividade) " +
                "values (?, ?, ?, ?, ?, ?, ?, ?)";
            /*ARRUMAR BANCO*/ String QUERY_UPDATE = "update experiencia set idExperiencia = ?, idCurriculo = ?, " +
                    "empresa = ?, dtinicio = ?, dtfim = ?, atual = ? " +
                    "cargo = ?, atividade = ? " +
                    "where idExperiencia = ? ";
            
                  //CAMPOS DO BD
                  /*idExperiencia, nome, rua, numero, cep, cidade, uf, 
                    bairro, complemento, data_nascimento, tipo_pcd, cnh  */
            
            if (experiencia.getId() == null) {
                
                stmt = conn.prepareStatement(QUERY_INSERT, Statement.RETURN_GENERATED_KEYS);
                stmt.setInt(1, experiencia.getId());
                stmt.setInt(2, experiencia.getIdCurriculo());
                stmt.setString(3, experiencia.getEmpresa());
                stmt.setDate(4, (Date) experiencia.getDtInicio());
                stmt.setDate(5, (Date) experiencia.getDtFim());
                stmt.setBoolean(6, experiencia.getAtual());
                stmt.setString(7, experiencia.getCargo());
                stmt.setString(8, experiencia.getCargo());
                                
                stmt.executeUpdate();
                ResultSet rs = stmt.getGeneratedKeys();
                

                if (rs.next()) {
                    resultado = rs.getInt(1);
                }
                
            } else {
                
                stmt = conn.prepareStatement(QUERY_UPDATE);
                stmt.setInt(1, experiencia.getId());
                stmt.setInt(2, experiencia.getIdCurriculo());
                stmt.setString(3, experiencia.getEmpresa());
                stmt.setDate(4, (Date) experiencia.getDtInicio());
                stmt.setDate(5, (Date) experiencia.getDtFim());
                stmt.setBoolean(6, experiencia.getAtual());
                stmt.setString(7, experiencia.getCargo());
                stmt.setString(8, experiencia.getCargo());                
                
                stmt.executeUpdate();
                resultado = experiencia.getId();
            }
            
            stmt.close();
            conn.close();

            JOptionPane.showMessageDialog(null, "Os dados da experiência foram salvos com sucesso!");

        } catch (Exception ex) {
            ex.printStackTrace();
            resultado = -1;
            JOptionPane.showMessageDialog(null, "Não foi possível salvar o dados da experiência!");      
        }
        return resultado;
    }
    
    
     public boolean deletar(Experiencia experiencia) {

        boolean resultado = false;

        try {
            PreparedStatement stmt = null;
            Connection conn = ConnectionManager.getConnection();

            String QUERY_DELETE = "delete from experiencia where idexperiencia = ? " + 
                    "and idcurriculo = ?";

            stmt = conn.prepareStatement(QUERY_DELETE);
            stmt.setInt(1, experiencia.getId());
            stmt.setInt(2, experiencia.getIdCurriculo());            

            stmt.executeUpdate();
            stmt.close();
            conn.close();

            resultado = true;
            JOptionPane.showMessageDialog(null, "Experiencia excluída com sucesso!");

        } catch (Exception ex) {

            ex.printStackTrace();
            resultado = false;
        }

        return resultado;
    }
    
 public Experiencia GetById(int idExperiencia, int idCurriculo) {

        Experiencia experiencia = new Experiencia();
        
        try {

            String QUERY_DETALHE = "select * from experiencia where idexperiencia = ? " +
            "and idcurriculo = ? ";
            PreparedStatement stmt = null;
            Connection conn = ConnectionManager.getConnection();

            ResultSet rs = null;
            stmt = conn.prepareStatement(QUERY_DETALHE);
            stmt.setInt(1, idExperiencia);
            stmt.setInt(2, idCurriculo);
            rs = stmt.executeQuery();

            while (rs.next()) {     
                stmt.setInt(1, experiencia.getId());
                stmt.setInt(2, experiencia.getIdCurriculo());
                stmt.setString(3, experiencia.getEmpresa());
                stmt.setDate(4, (Date) experiencia.getDtInicio());
                stmt.setDate(5, (Date) experiencia.getDtFim());
                stmt.setBoolean(6, experiencia.getAtual());
                stmt.setString(7, experiencia.getCargo());
                stmt.setString(8, experiencia.getCargo()); 
            }
            stmt.close();
            conn.close();

        } catch (Exception ex) {
            
            ex.printStackTrace();
            experiencia = null;
            JOptionPane.showMessageDialog(null, "Não foi possível localizar os dados da experiencia selecionada!");
            
        }
        
        return experiencia;
    }
 
    public List<Experiencia> listar() {
        List<Experiencia> lista = new ArrayList<Experiencia>();
        try {
            String QUERY_DETALHE = "select * from experiencia ";
            PreparedStatement stmt = null;
            Connection conn = ConnectionManager.getConnection();

            ResultSet rs = null;
            stmt = conn.prepareStatement(QUERY_DETALHE);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Experiencia experiencia = new Experiencia();
                experiencia.setId(rs.getInt("idExperiencia"));
                experiencia.setIdCurriculo(rs.getInt("idCurriculo"));
                stmt.setInt(1, experiencia.getId());
                stmt.setInt(2, experiencia.getIdCurriculo());
                stmt.setString(3, experiencia.getEmpresa());
                stmt.setDate(4, (Date) experiencia.getDtInicio());
                stmt.setDate(5, (Date) experiencia.getDtFim());
                stmt.setBoolean(6, experiencia.getAtual());
                stmt.setString(7, experiencia.getCargo());
                stmt.setString(8, experiencia.getCargo()); 
                lista.add(experiencia);
            }
            stmt.close();
            conn.close();

        } catch (Exception ex) {
            
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Não foi possível localizar os curriculos cadastrados!");
            
        } finally {
            
            return lista;
            
        }
    }
 
 
}
