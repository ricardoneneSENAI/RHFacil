package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import entity.Vaga;

public class VagaDAO {

    public Vaga salvar(Vaga vaga) {
        Vaga retorno = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/senai", "root", "");
            if (vaga.getIdVagas() == null) {
                String query = "INSERT INTO VAGAS(temporaria, cargo, funcoes_exercidas,"
                        + " salario, carga_horaria, disponibilidade_viagem, vaga_pcd, cnh)"
                        + " VALUES(?,?,?,?,?,?,?,?)";
                PreparedStatement sttm = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                sttm.setBoolean(1, vaga.isTemporaria());
                sttm.setString(2, vaga.getCargo());
                sttm.setString(3, vaga.getFuncoesExercidas());
                sttm.setFloat(4, vaga.getSalario());
                sttm.setString(5, vaga.getCargaHoraria());
                sttm.setBoolean(6, vaga.isDisponibilidadeViagem());
                sttm.setBoolean(7, vaga.isVagaPcd());
                sttm.setString(8, vaga.getCnh());
                sttm.executeUpdate();
                ResultSet rs = sttm.getGeneratedKeys();
                if (rs.next()) {
                    vaga.setIdVagas(rs.getInt(1));
                }
                retorno = vaga;
                sttm.close();
            } else {
                String query = "UPDATE produto SET temporaria=?,cargo=?,funcoes_exercidas=?,"
                        + "salario=?, carga_horaria=?, disponibilidade_viagem=?, vaga_pcd=? cnh=?";
                PreparedStatement sttm = conn.prepareStatement(query);
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
            }
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return retorno;
    }
    
}
