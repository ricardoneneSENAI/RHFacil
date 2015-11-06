/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipos;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author kevin_murilo
 */
public class TelaRelatorio extends javax.swing.JDialog {

    /**
     * Creates new form TelaRelatorio
     */
//    TelaRelatorioCandidato candidato; // = new TelaRelatorioCandidato();
//    TelaRelatorioVaga vaga; // = new TelaRelatorioVaga();
//    TelaRelatorioEmpresa empresa; // = new TelaRelatorioEmpresa();

    public TelaRelatorio(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        Component[] listaObjetos = getPnlTipoRelatorio().getComponents();
        
        for (Component component : listaObjetos) {
            if (component instanceof JButton) {
                ((JButton)component).setBorderPainted(false);
                ((JButton)component).setContentAreaFilled(false);
                ((JButton)component).setSelected(false);
            }
        }
        repaint();
        revalidate();
        
            TelaRelatorioVaga vaga  = new TelaRelatorioVaga();   
            pnlTipoFiltro.removeAll();
            pnlTipoFiltro.add(vaga );
            vaga.setVisible(true);
            pnlTipoFiltro.repaint();
            pnlTipoFiltro.revalidate();  
        
    }

    public JButton getBtnCurriculo() {
        return btnCurriculo;
    }

    public JButton getBtnEmpresa() {
        return btnEmpresa;
    }

    public JButton getBtnPesquisar() {
        return btnPesquisar;
    }

    public JButton getBtnVagas() {
        return btnVagas;
    }

    public JComboBox getCbxFiltro() {
        return cbxFiltro;
    }

    public JPanel getPnlFundo() {
        return pnlResultado;
    }

    public JPanel getPnlTipoRelatorio() {
        return pnlTipoRelatorio;
    }

    public JTable getTblResultado() {
        return tblResultado;
    }

    public JFormattedTextField getTxtDataFinal() {
        return txtDataFinal;
    }

    public JFormattedTextField getTxtDataInicial() {
        return txtDataInicial;
    }

    public JTextField getTxtPesquisa() {
        return txtPesquisa;
    }

    public JTextField getTxtRetorno() {
        return txtRetorno;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        pnlTipoRelatorio = new javax.swing.JPanel();
        btnVagas = new javax.swing.JButton();
        btnCurriculo = new javax.swing.JButton();
        btnEmpresa = new javax.swing.JButton();
        pnlResultado = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultado = new javax.swing.JTable();
        pnlTipoFiltro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbxFiltro = new javax.swing.JComboBox();
        txtDataInicial = new javax.swing.JFormattedTextField();
        txtDataFinal = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRetorno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        jCheckBox3 = new javax.swing.JCheckBox();

        jCheckBox1.setText("jCheckBox1");

        jCheckBox2.setText("jCheckBox2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlTipoRelatorio.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Relatório"));

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

        btnEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1443593833_Shop.png"))); // NOI18N
        btnEmpresa.setText("Empresas");
        btnEmpresa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmpresa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpresaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTipoRelatorioLayout = new javax.swing.GroupLayout(pnlTipoRelatorio);
        pnlTipoRelatorio.setLayout(pnlTipoRelatorioLayout);
        pnlTipoRelatorioLayout.setHorizontalGroup(
            pnlTipoRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTipoRelatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVagas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnlTipoRelatorioLayout.setVerticalGroup(
            pnlTipoRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTipoRelatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTipoRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCurriculo)
                    .addComponent(btnVagas)
                    .addComponent(btnEmpresa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlResultado.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        pnlResultado.setLayout(new java.awt.CardLayout());

        tblResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblResultado);

        pnlResultado.add(jScrollPane1, "card2");

        pnlTipoFiltro.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Filtro");

        cbxFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TIPO", "NOME" }));
        cbxFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxFiltroItemStateChanged(evt);
            }
        });
        cbxFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFiltroActionPerformed(evt);
            }
        });

        try {
            txtDataInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataInicial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDataInicial.setText("10/02/2015");

        try {
            txtDataFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataFinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDataFinal.setText("10/02/2015");

        jLabel2.setText("Período");

        jLabel3.setText("até");

        jLabel4.setText("Retornos");

        jLabel5.setText("Pesquisa");

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/buttons/Find.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");

        jCheckBox3.setText("PCD");

        javax.swing.GroupLayout pnlTipoFiltroLayout = new javax.swing.GroupLayout(pnlTipoFiltro);
        pnlTipoFiltro.setLayout(pnlTipoFiltroLayout);
        pnlTipoFiltroLayout.setHorizontalGroup(
            pnlTipoFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTipoFiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTipoFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTipoFiltroLayout.createSequentialGroup()
                        .addGroup(pnlTipoFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTipoFiltroLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cbxFiltro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlTipoFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlTipoFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(pnlTipoFiltroLayout.createSequentialGroup()
                        .addComponent(txtPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar))
                    .addGroup(pnlTipoFiltroLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTipoFiltroLayout.setVerticalGroup(
            pnlTipoFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTipoFiltroLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(pnlTipoFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlTipoFiltroLayout.createSequentialGroup()
                        .addGroup(pnlTipoFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTipoFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)))
                        .addGap(26, 26, 26))
                    .addGroup(pnlTipoFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jCheckBox3)
                        .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTipoFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pnlTipoFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlTipoRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(pnlTipoRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVagasActionPerformed
         cbxFiltro.removeAllItems();
         cbxFiltro.addItem("CARGO");
         cbxFiltro.addItem("TIPO");
         cbxFiltro.addItem("FAIXA SALARIAL");
        /*TelaRelatorioVaga vaga  = new TelaRelatorioVaga();   
            pnlTipoFiltro.removeAll();
            pnlTipoFiltro.add(vaga);
            vaga.setVisible(true);
            pnlTipoFiltro.repaint();
            pnlTipoFiltro.revalidate();  */      
    }//GEN-LAST:event_btnVagasActionPerformed

    private void btnCurriculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurriculoActionPerformed
         cbxFiltro.removeAllItems();
         cbxFiltro.addItem("FORMAÇAO");
         cbxFiltro.addItem("EXPERIÊNCIA");   
         cbxFiltro.addItem("COMPETÊNCIA");   
        /* TelaRelatorioCandidato candidato  = new TelaRelatorioCandidato();
            pnlTipoFiltro.removeAll();
            pnlTipoFiltro.add(candidato );
            candidato.setVisible(true);
            pnlTipoFiltro.repaint();
            pnlTipoFiltro.revalidate();*/
    }//GEN-LAST:event_btnCurriculoActionPerformed

    private void btnEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpresaActionPerformed
         cbxFiltro.removeAllItems();
         cbxFiltro.addItem("TIPO DE CONTRATO");
         cbxFiltro.addItem("VAGAS EM ABERTO");   
        /* TelaRelatorioEmpresa empresa = new TelaRelatorioEmpresa();    
            pnlTipoFiltro.removeAll();
            pnlTipoFiltro.add(empresa);
            empresa.setVisible(true);
            pnlTipoFiltro.repaint();
            pnlTipoFiltro.revalidate(); */
    }//GEN-LAST:event_btnEmpresaActionPerformed

    private void cbxFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFiltroActionPerformed

    }//GEN-LAST:event_cbxFiltroActionPerformed

    private void cbxFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxFiltroItemStateChanged
                    
        /*if (cbxFiltro.getSelectedIndex() == -1) {
           
        }
        if (cbxFiltro.getSelectedIndex() == 0) {

        }
        if (cbxFiltro.getSelectedIndex() == 1) {

        }
        if (cbxFiltro.getSelectedIndex() == 2) {

        }*/
    }//GEN-LAST:event_cbxFiltroItemStateChanged

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
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaRelatorio dialog = new TelaRelatorio(new javax.swing.JFrame(), true);
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

    public JPanel getPnlResultado() {
        return pnlResultado;
    }

    public JPanel getPnlTipoFiltro() {
        return pnlTipoFiltro;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCurriculo;
    private javax.swing.JButton btnEmpresa;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVagas;
    private javax.swing.JComboBox cbxFiltro;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlResultado;
    private javax.swing.JPanel pnlTipoFiltro;
    private javax.swing.JPanel pnlTipoRelatorio;
    private javax.swing.JTable tblResultado;
    private javax.swing.JFormattedTextField txtDataFinal;
    private javax.swing.JFormattedTextField txtDataInicial;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtRetorno;
    // End of variables declaration//GEN-END:variables
}
