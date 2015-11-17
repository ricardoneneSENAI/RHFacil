package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import entity.Usuarios;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Ederley Carvalho
 */
public class UsuarioDAO {

    Connection conecta = null;
    ResultSet rs = null;
    PreparedStatement sttm = null;

    public void salvar(Usuarios usuario) {
        try {
            conecta = ConnectionManager.getConnection();
            String SQL_INSERT = "insert into usuarios(nome, senha, email, perfil) values (?,?,?,?)";

            sttm = conecta.prepareStatement(SQL_INSERT);
            sttm.setString(1, usuario.getNomeUsuarios());
            sttm.setString(2, usuario.getSenhaUsuarios());
            sttm.setString(3, usuario.getEmailUsuarios());
            sttm.setString(4, usuario.getPerfilUsuarios());

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            sttm.executeUpdate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro ao gravar no banco de dados!");
        }

    }

    public void atualizar(Usuarios usuario) {

        try {
            conecta = ConnectionManager.getConnection();
            String SQL_UPDATE = "update usuarios set nome = ?, senha = ?, email = ?, perfil = ? where idusuario = ?";

            sttm = conecta.prepareStatement(SQL_UPDATE);
            sttm.setString(1, usuario.getNomeUsuarios());
            sttm.setString(2, usuario.getSenhaUsuarios());
            sttm.setString(3, usuario.getEmailUsuarios());
            sttm.setString(4, usuario.getPerfilUsuarios());

            sttm.setInt(5, usuario.getIdUsuarios());

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");

            sttm.executeUpdate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro ao gravar no banco de dados!");
        }

    }

    public List<Usuarios> listar() {

        List<Usuarios> lista = new ArrayList<Usuarios>();

        try {
            String QUERY_DETALHE = "select idusuario, nome, email, perfil from usuarios order by nome ASC";

            conecta = ConnectionManager.getConnection();

            ResultSet rs = null;

            sttm = conecta.prepareStatement(QUERY_DETALHE);
            rs = sttm.executeQuery();

            while (rs.next()) {
                Usuarios usuario = new Usuarios();
                usuario.setIdUsuarios(rs.getInt("idusuario"));
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

    public List<Usuarios> burcarPorNome(String nome) {

        List<Usuarios> lista = new ArrayList<Usuarios>();

        try {
            String QUERY_DETALHE = "select idusuario, nome, email, perfil from usuarios where nome LIKE '%' ? '%'";

            conecta = ConnectionManager.getConnection();

            ResultSet rs = null;

            sttm = conecta.prepareStatement(QUERY_DETALHE);
            sttm.setString(1, nome);
            rs = sttm.executeQuery();

            while (rs.next()) {
                Usuarios usuario = new Usuarios();
                usuario.setIdUsuarios(rs.getInt("idusuario"));
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
            String QUERY_DELETE = "delete from usuarios where idusuario = ?";

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

            String QUERY_DETALHE = "SELECT idusuario, nome, senha, email, perfil from usuarios where idusuario = ?";

            sttm = conecta.prepareStatement(QUERY_DETALHE);
            sttm.setInt(1, usuario.getIdUsuarios());

            rs = sttm.executeQuery();

            while (rs.next()) {

                retorno = new Usuarios();

                retorno.setIdUsuarios(rs.getInt("idusuario"));
                retorno.setNomeUsuarios(rs.getString("nome"));
                retorno.setSenhaUsuarios(rs.getString("senha"));
                retorno.setEmailUsuarios(rs.getString("email"));
                retorno.setPerfilUsuarios(rs.getString("perfil"));

            }

            //conecta.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro ao consultar banco de dados!");
        } finally {
            return retorno;
        }

    }

}
