package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import entity.Usuarios;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Ederley Carvalho
 */
public class UsuarioDAO {

    Connection conecta = null;
    ResultSet rs = null;
    PreparedStatement sttm = null;
    public static ResultSet rsST;

    public void salvar(Usuarios usuario) {

        usuario.setIdUsuarios(usuario.getIdUsuarios());
        try {
            conecta = ConnectionManager.getConnection();
            String SQL_INSERT = "insert into usuarios(nome, senha, email, perfil) values (?,?,?,?)";
            String SQL_UPDATE = "update usuarios set nome = ?, senha = ?, email = ?, perfil = ? where idusuarios = ?";

            if (usuario.getIdUsuarios() == null || usuario.getIdUsuarios() == 0) {
                sttm = conecta.prepareStatement(SQL_INSERT);

                sttm.setString(1, usuario.getNomeUsuarios());
                sttm.setString(2, usuario.getSenhaUsuarios());
                sttm.setString(3, usuario.getEmailUsuarios());
                sttm.setString(4, usuario.getPerfilUsuarios());

                JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            } else {
                sttm = conecta.prepareStatement(SQL_UPDATE);

                sttm.setString(1, usuario.getNomeUsuarios());
                sttm.setString(2, usuario.getSenhaUsuarios());
                sttm.setString(3, usuario.getEmailUsuarios());
                sttm.setString(4, usuario.getPerfilUsuarios());

                sttm.setInt(5, usuario.getIdUsuarios());
                JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            }
            sttm.executeUpdate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro ao gravar no banco de dados!");
        }

    }

    public List<Usuarios> listar() {

        List<Usuarios> lista = new ArrayList<Usuarios>();

        try {
            String QUERY_DETALHE = "select idusuarios, nome, email, perfil from usuarios order by nome ASC";

            conecta = ConnectionManager.getConnection();

            ResultSet rs = null;

            sttm = conecta.prepareStatement(QUERY_DETALHE);
            rs = sttm.executeQuery();

            while (rs.next()) {
                Usuarios usuario = new Usuarios();
                usuario.setIdUsuarios(rs.getInt("idusuarios"));
                usuario.setNomeUsuarios(rs.getString("nome"));
                usuario.setEmailUsuarios(rs.getString("email"));
                usuario.setPerfilUsuarios(rs.getString("perfil"));
                lista.add(usuario);
            }
            //conecta.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro ao listar!");
        }
        return lista;
    }

    public void deletar(Usuarios usuarios) {

        try {
            conecta = ConnectionManager.getConnection();
            String QUERY_DELETE = "delete from usuarios where idusuarios = ?";

            sttm = conecta.prepareStatement(QUERY_DELETE);
            sttm.setInt(1, usuarios.getIdUsuarios());

            sttm.execute();
            //conn.close();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "erro ao excluir!");
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public Usuarios detalhe(Usuarios usuario) {

        Usuarios retorno = null;

        try {
            conecta = ConnectionManager.getConnection();

            String QUERY_DETALHE = "SELECT nome, senha, email from usuarios where idusuarios = ?";

            sttm = conecta.prepareStatement(QUERY_DETALHE);
            sttm.setInt(1, usuario.getIdUsuarios());

            rs = sttm.executeQuery();

            while (rs.next()) {

                retorno = new Usuarios();

                retorno.setNomeUsuarios(rs.getString("nome"));
                retorno.setSenhaUsuarios(rs.getString("senha"));
                retorno.setEmailUsuarios(rs.getString("email"));

            }

            //conecta.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro ao consultar banco de dados!");
        } finally {
            return retorno;
        }

    }

    public void pesquisarUsuarios(Usuarios usuario) {

        conecta = ConnectionManager.getConnection();
        String sql = "select idusuarios, nome, email, perfil from usuarios where nome LIKE '%' ? '%'";
        try {
            sttm = conecta.prepareStatement(sql);
            sttm.setString(1, usuario.getNomeUsuarios());
            rsST = sttm.executeQuery();

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, error);
        }

    }

    public static TableModel setaResultadojTabela(ResultSet rs) {
        try {
            ResultSetMetaData metaData = rs.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            Vector columnNames = new Vector();

            // Obter os nomes de coluna
            for (int column = 0; column < numberOfColumns; column++) {
                columnNames.addElement(metaData.getColumnLabel(column + 1));
            }

            // Obter todas as linhas.
            Vector rows = new Vector();

            while (rs.next()) {
                Vector newRow = new Vector();

                for (int i = 1; i <= numberOfColumns; i++) {
                    newRow.addElement(rs.getObject(i));
                }

                rows.addElement(newRow);
            }

            return new DefaultTableModel(rows, columnNames);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro ao carregar tabela!");
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

}
