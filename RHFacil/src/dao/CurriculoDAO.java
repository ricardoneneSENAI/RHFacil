package dao;

import entity.Curriculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CurriculoDAO {

    public int salvar(Curriculo curriculo) {
    
        //Inicializando o retorno da função, caso tenha algum problema deve ser retornado o valor -1
        int resultado = -1;

        try {
            PreparedStatement stmt = null;
            Connection conn = ConnectionManager.getConnection();

            /*ARRUMAR BANCO*/ String QUERY_INSERT = "insert into curriculo (idCurriculos, nome, rua, numero, cep, "
                    + "cidade, uf, bairro, complemento, data_nascimento, tipo_pcd, cnh) "
                    + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            /*ARRUMAR BANCO*/ String QUERY_UPDATE = "update curriculo set idCurriculos = ?, nome = ?, rua = ?, "
                    + "numero = ?, cep = ?, cidade = ?, uf = ?, bairro = ?, complemento = ?,"
                    + "data_nascimento = ?, tipo_pcd, cnh = ?"
                    + "where idcurriculo = ? ";
            
                  //CAMPOS DO BD
                  /*idCurriculos, nome, rua, numero, cep, cidade, uf, 
                    bairro, complemento, data_nascimento, tipo_pcd, cnh  */
            
            if (curriculo.getId() == null) {
                
                stmt = conn.prepareStatement(QUERY_INSERT, Statement.RETURN_GENERATED_KEYS);
                stmt.setInt(1, curriculo.getId());
                stmt.setString(2, curriculo.getNome());
                //stmt.setDate(3, curriculo.getDtNascimento());
                stmt.setString(4, curriculo.getObjetivo());
                //stmt.setCharacter(5, curriculo.getCnh());
                //stmt.setCharacter(6, curriculo.getDeficiencia());
                stmt.setString(7, curriculo.getCep());
                stmt.setString(8, curriculo.getCidade());
                stmt.setString(9, curriculo.getUf());
                stmt.setString(10, curriculo.getBairro());
                stmt.setString(11, curriculo.getRua());
                stmt.setInt(12, curriculo.getNumero());
                stmt.setString(13, curriculo.getComplemento());
                
                stmt.executeUpdate();
                ResultSet rs = stmt.getGeneratedKeys();
                

                if (rs.next()) {
                    resultado = rs.getInt(1);
                }
                
            } else {
                
                stmt = conn.prepareStatement(QUERY_UPDATE);
                stmt.setInt(1, curriculo.getId());
                stmt.setString(2, curriculo.getNome());
                //stmt.setDate(3, curriculo.getDtNascimento());
                stmt.setString(4, curriculo.getObjetivo());
                //stmt.setCharacter(5, curriculo.getCnh());
                //stmt.setCharacter(6, curriculo.getDeficiencia());
                stmt.setString(7, curriculo.getCep());
                stmt.setString(8, curriculo.getCidade());
                stmt.setString(9, curriculo.getUf());
                stmt.setString(10, curriculo.getBairro());
                stmt.setString(11, curriculo.getRua());
                stmt.setInt(12, curriculo.getNumero());
                stmt.setString(13, curriculo.getComplemento());
                
                
                stmt.executeUpdate();
                resultado = curriculo.getId();
            }

            conn.close();

            JOptionPane.showMessageDialog(null, "Os dados do currículo foram salvo com sucesso!");

        } catch (Exception ex) {
            ex.printStackTrace();
            resultado = -1;
            JOptionPane.showMessageDialog(null, "Não foi possível salvar o dados do currículo!");      
        }
        return resultado;
    }
    
    public boolean deletar(Curriculo curriculo) {

        boolean resultado = false;

        try {
            PreparedStatement stmt = null;
            Connection conn = ConnectionManager.getConnection();

            String QUERY_DELETE = "delete from curriculo where idcurriculo = ?";

            stmt = conn.prepareStatement(QUERY_DELETE);
            stmt.setInt(1, curriculo.getId());

            stmt.executeUpdate();
            conn.close();

            resultado = true;
            JOptionPane.showMessageDialog(null, "Curriculo excluído com sucesso!");

        } catch (Exception ex) {

            ex.printStackTrace();
            resultado = false;
        }

        return resultado;
    }

    public Curriculo GetById(int id) {

        Curriculo curriculo = new Curriculo();
        
        try {

            String QUERY_DETALHE = "select * from curriculo where idcurriculo = ?";
            PreparedStatement stmt = null;
            Connection conn = ConnectionManager.getConnection();

            ResultSet rs = null;
            stmt = conn.prepareStatement(QUERY_DETALHE);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            while (rs.next()) {
                curriculo = new Curriculo();
                curriculo.setId(rs.getInt("idCurriculo"));
                stmt.setInt(1, curriculo.getId());
                stmt.setString(2, curriculo.getNome());
                //stmt.setDate(3, curriculo.getDtNascimento());
                stmt.setString(4, curriculo.getObjetivo());
                //stmt.setCharacter(5, curriculo.getCnh());
                //stmt.setCharacter(6, curriculo.getDeficiencia());
                stmt.setString(7, curriculo.getCep());
                stmt.setString(8, curriculo.getCidade());
                stmt.setString(9, curriculo.getUf());
                stmt.setString(10, curriculo.getBairro());
                stmt.setString(11, curriculo.getRua());
                stmt.setInt(12, curriculo.getNumero());
                stmt.setString(13, curriculo.getComplemento());
            }
            conn.close();

        } catch (Exception ex) {
            
            ex.printStackTrace();
            curriculo = null;
            JOptionPane.showMessageDialog(null, "Não foi possível localizar os dados do currículo selecionado!");
            
        }
        
        return curriculo;
    }

    public List<Curriculo> listar() {
        List<Curriculo> lista = new ArrayList<Curriculo>();
        try {
            String QUERY_DETALHE = "select * from curriculo";
            PreparedStatement stmt = null;
            Connection conn = ConnectionManager.getConnection();

            ResultSet rs = null;
            stmt = conn.prepareStatement(QUERY_DETALHE);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Curriculo curriculo = new Curriculo();
                curriculo.setId(rs.getInt("idCurriculo"));
                stmt.setInt(1, curriculo.getId());
                stmt.setString(2, curriculo.getNome());
                //stmt.setDate(3, curriculo.getDtNascimento());
                stmt.setString(4, curriculo.getObjetivo());
                //stmt.setCharacter(5, curriculo.getCnh());
                //stmt.setCharacter(6, curriculo.getDeficiencia());
                stmt.setString(7, curriculo.getCep());
                stmt.setString(8, curriculo.getCidade());
                stmt.setString(9, curriculo.getUf());
                stmt.setString(10, curriculo.getBairro());
                stmt.setString(11, curriculo.getRua());
                stmt.setInt(12, curriculo.getNumero());
                stmt.setString(13, curriculo.getComplemento());
                lista.add(curriculo);
            }
            conn.close();

        } catch (Exception ex) {
            
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Não foi possível localizar os curriculos cadastrados!");
            
        } finally {
            
            return lista;
            
        }
    }
}