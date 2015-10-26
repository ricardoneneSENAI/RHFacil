/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipos;

/**
 *
 * @author ricardo.nene
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEmpresa = new javax.swing.JButton();
        btnVagas = new javax.swing.JButton();
        btnCurriculo = new javax.swing.JButton();
        btnCandidatosAptos = new javax.swing.JButton();
        btnEntrevista = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1443593833_Shop.png"))); // NOI18N
        btnEmpresa.setText("Empresas");
        btnEmpresa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmpresa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpresaActionPerformed(evt);
            }
        });

        btnVagas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/vagas.png"))); // NOI18N
        btnVagas.setText("Vagas");
        btnVagas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVagas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVagasActionPerformed(evt);
            }
        });

        btnCurriculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/entrevista.png"))); // NOI18N
        btnCurriculo.setText("Currículos");
        btnCurriculo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCurriculo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCurriculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurriculoActionPerformed(evt);
            }
        });

        btnCandidatosAptos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1443587194_icon-91.png"))); // NOI18N
        btnCandidatosAptos.setText("Candidatos Aptos");
        btnCandidatosAptos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCandidatosAptos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCandidatosAptos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCandidatosAptosActionPerformed(evt);
            }
        });

        btnEntrevista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1443586393_chat_conversation.png"))); // NOI18N
        btnEntrevista.setText("Entrevistas");
        btnEntrevista.setToolTipText("");
        btnEntrevista.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEntrevista.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEntrevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrevistaActionPerformed(evt);
            }
        });

        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1443586504_neck-tie.png"))); // NOI18N
        btnUsuarios.setText("Usuários");
        btnUsuarios.setToolTipText("");
        btnUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVagas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCandidatosAptos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEntrevista, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUsuarios)
                    .addComponent(btnEntrevista)
                    .addComponent(btnCandidatosAptos)
                    .addComponent(btnCurriculo)
                    .addComponent(btnVagas)
                    .addComponent(btnEmpresa))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 174, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpresaActionPerformed
        TelaPesquisarEmpresa tela = new TelaPesquisarEmpresa(this, true);
    }//GEN-LAST:event_btnEmpresaActionPerformed

    private void btnVagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVagasActionPerformed
        TelaPesquisarVaga tela = new TelaPesquisarVaga(this, true);

    }//GEN-LAST:event_btnVagasActionPerformed

    private void btnCurriculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurriculoActionPerformed
        TelaPesquisarCurriculo tela = new TelaPesquisarCurriculo(this, true);
    }//GEN-LAST:event_btnCurriculoActionPerformed

    private void btnCandidatosAptosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandidatosAptosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCandidatosAptosActionPerformed

    private void btnEntrevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrevistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrevistaActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCandidatosAptos;
    private javax.swing.JButton btnCurriculo;
    private javax.swing.JButton btnEmpresa;
    private javax.swing.JButton btnEntrevista;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVagas;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
