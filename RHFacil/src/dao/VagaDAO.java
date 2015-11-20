package dao;

import entity.Empresas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import entity.Vaga;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import prototipos.TelaCadastroVaga;

public class VagaDAO {
    
    Connection conn = null;
    Vaga retorno = null;
    PreparedStatement sttm = null;
    ResultSet rs = null;
    
    public Vaga salvar(Vaga vaga) {        
        try {
            conn = ConnectionManager.getConnection();
            if (vaga.getIdVagas() == null) {
                insert(vaga);                
            } else {
                update(vaga);
            }            
        } catch (Exception e) {
            e.printStackTrace();            
        }
        return retorno;
    }
    
    public Vaga insert(Vaga vaga){
        Empresas empresa = new Empresas();
        TelaCadastroVaga tela = new TelaCadastroVaga(null, true);
        
        conn = ConnectionManager.getConnection();
        try{            
            String queryInsert = "INSERT INTO VAGAS(temporaria, cargo, funcoes_exercidas,"
                        + " salario, carga_horaria, disponibilidade_viagem, vaga_pcd, cnh, Empresas_idEmpresas)"
                        + " VALUES(?,?,?,?,?,?,?,?,?)";
            
            sttm = conn.prepareStatement(queryInsert, Statement.RETURN_GENERATED_KEYS);
            sttm.setBoolean(1, vaga.isTemporaria());
            sttm.setString(2, vaga.getCargo());
            sttm.setString(3, vaga.getFuncoesExercidas());
            sttm.setFloat(4, vaga.getSalario());
            sttm.setString(5, vaga.getCargaHoraria());
            sttm.setBoolean(6, vaga.isDisponibilidadeViagem());
            sttm.setBoolean(7, vaga.isVagaPcd());
            sttm.setString(8, vaga.getCnh());
            sttm.setInt(9, Integer.parseInt(tela.getCbEmpresa().getSelectedItem().toString()));
            sttm.executeUpdate();
            ResultSet rs = sttm.getGeneratedKeys();
            if (rs.next()) {
                vaga.setIdVagas(rs.getInt(1));
            }
            retorno = vaga;
            sttm.close();
            conn.close();
            JOptionPane.showMessageDialog(null, "Os dados da vaga foram salvos com sucesso!");
                
        }catch (Exception e) {
            e.printStackTrace();                        
            JOptionPane.showMessageDialog(null, "Não foi possível salvar: "+ e.getMessage()); 
        }
        return retorno;
    }
    
    public Vaga update(Vaga vaga){
        try{
            String queryUpdate = "UPDATE produto SET temporaria=?,cargo=?,funcoes_exercidas=?,"
                        + "salario=?, carga_horaria=?, disponibilidade_viagem=?, vaga_pcd=? cnh=?";
            
            sttm = conn.prepareStatement(queryUpdate);
            sttm.setBoolean(1, vaga.isTemporaria());
            sttm.setString(2, vaga.getCargo());
            sttm.setString(3, vaga.getFuncoesExercidas());
            sttm.setFloat(4, vaga.getSalario());
            sttm.setString(5, vaga.getCargaHoraria());
            sttm.setBoolean(6, vaga.isDisponibilidadeViagem());
            sttm.setBoolean(7, vaga.isVagaPcd());
            sttm.setString(8, vaga.getCnh());
            sttm.executeUpdate();
            retorno = vaga;
            sttm.close();
            conn.close();
            JOptionPane.showMessageDialog(null, "Os dados da vaga foram alterados com sucesso!");            
        }catch (Exception e) {
            e.printStackTrace();                        
            JOptionPane.showMessageDialog(null, "Não foi possível salvar: "+ e.getMessage()); 
        }
        return retorno;
    }
    
    public Vaga delete(Vaga vaga){
        try{
            String queryDelete = "delete from vaga where idVagas = ?";

            sttm = conn.prepareStatement(queryDelete);
            sttm.setInt(1, vaga.getIdVagas());

            sttm.execute();
            conn.close();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        }catch (Exception e) {
            e.printStackTrace();                        
            JOptionPane.showMessageDialog(null, "Não foi possível excluir: "+ e.getMessage()); 
        }
        return retorno;
    }
    
    public List<Empresas> listarEmpresa() {

        List<Empresas> lista = new ArrayList<Empresas>();

        try {
            String querySelect = "select idEmpresas, nome_fantasia from empresas";

            conn = ConnectionManager.getConnection();

            sttm = conn.prepareStatement(querySelect);
            rs = sttm.executeQuery();

            while (rs.next()) {
                Empresas empresa = new Empresas();
                empresa.setIdEmpresas(rs.getInt("idEmpresas"));
                empresa.setNome_fantasia(rs.getString("nome_fantasia"));

                lista.add(empresa);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar: " + e.getMessage());
        }
        return lista;
    }
    
    public List<Vaga> listarTelaPesquisarVaga() {

        List<Vaga> lista = new ArrayList<Vaga>();

        try {
            String querySelect = "select cargo, salario, temporaria from vagas order by cargo ASC";

            conn = ConnectionManager.getConnection();

            sttm = conn.prepareStatement(querySelect);
            rs = sttm.executeQuery();

            while (rs.next()) {
                Vaga vaga = new Vaga();
                vaga.setCargo(rs.getString("cargo"));
                vaga.setSalario(rs.getFloat("salario"));
                vaga.setTemporaria(rs.getBoolean("temporaria"));
                
                lista.add(vaga);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar: " + e.getMessage());
        }
        return lista;
    }
    
}
