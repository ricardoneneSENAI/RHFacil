package dao;

//import conexao.ConnectionManager;
//import entity.Currculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CurriculoDAO {

    public int salvar(/*CRIAR ENTIDADE*/Curriculo curriculo) {
        
        /*CRIAR CONNECTION*/
        
        //inicializando o retorno da função, caso tenha algum problema deve ser retornar o valor -1
        int resultado = -1;

        try {
            PreparedStatement stmt = null;
            //Connection conn = ConnectionManager.getConnection();

            /*ARRUMAR QUERY*/String QUERY_INSERT = "insert into curriculo (?, ?, ?) values (?, ?, ?)";
            /*ARRUMAR QUERY*/String QUERY_UPDATE = "update curriculo set ? = ?, ? = ?, ? = ? where idcurriculo = ? ";

            if (curriculo.getId() == null) {
                
                stmt = conn.prepareStatement(QUERY_INSERT, Statement.RETURN_GENERATED_KEYS);
                /*ARRUMAR QUERY
                stmt.setString(1, curriculo.get?());
                stmt.setString(2, curriculo.get?());
                stmt.setString(3, curriculo.get?());
                */
                stmt.executeUpdate();
                ResultSet rs = stmt.getGeneratedKeys();
                

                if (rs.next()) {
                    resultado = rs.getInt(1);
                }
                
            } else {
                
                stmt = conn.prepareStatement(QUERY_UPDATE);
                /*ARRUMAR QUERY
                stmt.setString(1, curriculo.get?());
                stmt.setString(2, curriculo.get?());
                stmt.setString(3, curriculo.get?());
                */
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
            /*CRIAR CONNECTION*/
            Connection conn = ConnectionManager.getConnection();

            /*ARRUMAR QUERY*/String QUERY_DELETE = "delete from curriculo where idcurriculo = ?";

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
                /*ARRUMAR QUERY
                curriculo.setNome(rs.getString("?"));
                curriculo.setEmail(rs.getString("?"));
                curriculo.setTelefone(rs.getString("?"));
                */
            }
            conn.close();

        } catch (Exception ex) {
            
            ex.printStackTrace();
            curriculo = null;
            JOptionPane.showMessageDialog(null, "Não foi localizar os dados do currículo selecionado!");
            
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
                /*ARRUMAR QUERY
                curriculo.setNome(rs.getString("?"));
                curriculo.setEmail(rs.getString("?"));
                curriculo.setTelefone(rs.getString("?"));
                */
                lista.add(curriculo);
            }
            conn.close();

        } catch (Exception ex) {
            
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Não foi localizar os curriculos cadastrados!");
            
        } finally {
            
            return lista;
            
        }
    }
}