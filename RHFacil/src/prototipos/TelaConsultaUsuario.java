/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipos;

import dao.UsuarioDAO;
import entity.Usuarios;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ederley Carvalho
 */
public class TelaConsultaUsuario extends javax.swing.JDialog {

    private UsuarioDAO dao = new UsuarioDAO();

    /**
     * Creates new form TelaConsultaUsuario
     */
    public TelaConsultaUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        AtualizaLista(dao.listar());
        txtPesquisa_nome.requestFocus();
        //jTabela.changeSelection(jTabela.getColumnCount() - 2, 0, false, false);

    }

    public void AtualizaLista() {

        UsuarioDAO DAO = new UsuarioDAO();
        List<Usuarios> listaUsuarios = DAO.listar();
        //pega o modelo da Tabela e coloca na variavel "model"
        DefaultTableModel model = (DefaultTableModel) getjTabela().getModel();
        //insere na tabela o número de linhas que a lista tem
        model.setRowCount(listaUsuarios.size());

        //laço para inserir os dados dos objetos na Tabela
        for (int i = 0; i < listaUsuarios.size(); i++) {
            model.setValueAt(listaUsuarios.get(i).getIdUsuarios(), i, 0);
            model.setValueAt(listaUsuarios.get(i).getNomeUsuarios(), i, 1);
            model.setValueAt(listaUsuarios.get(i).getEmailUsuarios(), i, 2);
            model.setValueAt(listaUsuarios.get(i).getPerfilUsuarios(), i, 3);

            formatarTabela();
        }

    }

    public void AtualizaLista(List<Usuarios> listaUsuarios) {

        //pega o modelo da Tabela e coloca na variavel "model"
        DefaultTableModel model = (DefaultTableModel) getjTabela().getModel();
        //insere na tabela o número de linhas que a lista tem
        model.setRowCount(listaUsuarios.size());

        //laço para inserir os dados dos objetos na Tabela
        for (int i = 0; i < listaUsuarios.size(); i++) {
            model.setValueAt(listaUsuarios.get(i).getIdUsuarios(), i, 0);
            model.setValueAt(listaUsuarios.get(i).getNomeUsuarios(), i, 1);
            model.setValueAt(listaUsuarios.get(i).getEmailUsuarios(), i, 2);
            model.setValueAt(listaUsuarios.get(i).getPerfilUsuarios(), i, 3);

            formatarTabela();
        }

    }

    public void formatarTabela() {

        //REDIMENCIONAR COLUNAS DA jTabela
        getjTabela().getColumnModel().getColumn(0).setPreferredWidth(5);
        getjTabela().getColumnModel().getColumn(1).setPreferredWidth(120);
        getjTabela().getColumnModel().getColumn(2).setPreferredWidth(120);
        getjTabela().getColumnModel().getColumn(3).setPreferredWidth(60);

        //RENOMEAR COLUNAS DA jTabela
        jTabela.getColumnModel().getColumn(0).setHeaderValue("ID");
        jTabela.getColumnModel().getColumn(1).setHeaderValue("Nome");
        jTabela.getColumnModel().getColumn(2).setHeaderValue("Email");
        jTabela.getColumnModel().getColumn(3).setHeaderValue("Perfil");

    }

    public void excluir() {

        int linha = getjTabela().getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "Selecione usuário na tabela!");
        } else {

            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", "Excluir", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {

                int id = (int) (getjTabela().getModel().getValueAt(linha, 0));
                Usuarios usuarios = new Usuarios();
                UsuarioDAO dao = new UsuarioDAO();
                usuarios.setIdUsuarios(id);
                dao.deletar(usuarios);
                AtualizaLista();

            } else if (resposta == JOptionPane.NO_OPTION) {

            }

        }
    }

    public void alterar_Usuario() {
        Usuarios usu = new Usuarios();
        UsuarioDAO UsuDao = new UsuarioDAO();
        int linha = getjTabela().getSelectedRow();

        if (linha == -1) {

            JOptionPane.showMessageDialog(null, "Selecione usuário na tabela!");

        } else {
            int id = (int) (getjTabela().getModel().getValueAt(linha, 0));
            //System.out.println("ID: " + id);
            usu.setIdUsuarios(id);
            usu = UsuDao.detalhe(usu);
            //System.out.println("USU.id="+Usu.getIdUsuarios());
            JFrame mainFrame = new JFrame();
            TelaUsuario tela = new TelaUsuario(mainFrame, true, usu);
            tela.setVisible(true);
            AtualizaLista();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisa_nome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabela = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 400));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setText("Nome:");

        txtPesquisa_nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisa_nomeKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisa_nome)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPesquisa_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "E-mail", "Perfil"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTabelaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTabela);
        if (jTabela.getColumnModel().getColumnCount() > 0) {
            jTabela.getColumnModel().getColumn(0).setResizable(false);
            jTabela.getColumnModel().getColumn(1).setResizable(false);
            jTabela.getColumnModel().getColumn(2).setResizable(false);
            jTabela.getColumnModel().getColumn(3).setResizable(false);
        }

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/buttons/Back.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/buttons/Delete.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/buttons/Modify.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/buttons/New document.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVoltar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnNovo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluir();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        alterar_Usuario();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        JFrame mainFrame = new JFrame();
        TelaUsuario tela = new TelaUsuario(mainFrame, true, null);
        tela.setVisible(true);
        AtualizaLista(dao.listar());
    }//GEN-LAST:event_btnNovoActionPerformed

    private void jTabelaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabelaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabelaKeyPressed

    private void txtPesquisa_nomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisa_nomeKeyReleased
        AtualizaLista(dao.burcarPorNome(txtPesquisa_nome.getText()));
    }//GEN-LAST:event_txtPesquisa_nomeKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaConsultaUsuario dialog = new TelaConsultaUsuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabela;
    private javax.swing.JTextField txtPesquisa_nome;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the txtPesquisa_nome
     */
    public javax.swing.JTextField getTxtPesquisa_nome() {
        return txtPesquisa_nome;
    }

    /**
     * @param txtPesquisa_nome the txtPesquisa_nome to set
     */
    public void setTxtPesquisa_nome(javax.swing.JTextField txtPesquisa_nome) {
        this.txtPesquisa_nome = txtPesquisa_nome;
    }

    /**
     * @return the jTabela
     */
    public javax.swing.JTable getjTabela() {
        return jTabela;
    }

    /**
     * @param jTabela the jTabela to set
     */
    public void setjTabela(javax.swing.JTable jTabela) {
        this.jTabela = jTabela;
    }
}
