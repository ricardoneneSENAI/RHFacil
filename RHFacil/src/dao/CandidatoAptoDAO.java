package dao;

import entity.Empresas;
import entity.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author willyam_evangelista
 */
public class CandidatoAptoDAO {

    Connection conecta = null;
    ResultSet rs = null;
    PreparedStatement sttm = null;
    public static ResultSet rsST;

    public List<Empresas> listar() {

        List<Empresas> lista = new ArrayList<Empresas>();

        try {
            String QUERY_DETALHE = "select nome_fantasia from empresas order by nome_fantasia ASC";

            conecta = ConnectionManager.getConnection();

            ResultSet rs = null;

            sttm = conecta.prepareStatement(QUERY_DETALHE);
            rs = sttm.executeQuery();

            while (rs.next()) {
                Empresas empresa = new Empresas();
                empresa.setNome_fantasia(rs.getString("nome_fantasia"));

                lista.add(empresa);
            }
            //conecta.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro ao listar!");
        }
        return lista;
    }

    public Vector<Empresas> listar2() {

        Vector<Empresas> lista = new Vector<Empresas>();

        try {
            String QUERY_DETALHE = "select nome_fantasia from empresas order by nome_fantasia ASC";

            conecta = ConnectionManager.getConnection();

            ResultSet rs = null;

            sttm = conecta.prepareStatement(QUERY_DETALHE);
            rs = sttm.executeQuery();

            while (rs.next()) {
                Empresas empresa = new Empresas();
                empresa.setNome_fantasia(rs.getString("nome_fantasia"));

                lista.add(empresa);
            }
            //conecta.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro ao listar!");
        }
        return lista;
    }

}
