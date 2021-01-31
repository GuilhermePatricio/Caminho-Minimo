/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Busca.BuscaAestrela;
import Model.Matriz;

import Model.No;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Gui
 */
public class TelaModificaMapa extends javax.swing.JFrame {

    private int matriz[][] = new int[42][42];
    private final Matriz m = new Matriz();
    private JLabel mapa[][];
    private int pingenteVermelhoL = 1;
    private int pingenteVermelhoC = 24;
    private int pingenteVerdeL = 32;
    private int pingenteVerdeC = 5;
    private int pingenteAzulL = 17;
    private int pingenteAzulC = 39;
    private int masterSwordL = 1;
    private int masterSwordC = 2;
    private int linkL = 27;
    private int linkC = 23;

    public TelaModificaMapa() {
        mapa = new JLabel[42][42];
        matriz = m.preencheMatrizNUM();
        initComponents();
        setLocationRelativeTo(null);
    }

    public void organiza(JCheckBox checkbox) {

        if (checkbox.isSelected()) {
            cbAgua.setEnabled(false);
            cbFloresta.setEnabled(false);
            cbGrama.setEnabled(false);
            cbMontanha.setEnabled(false);
            cbAreia.setEnabled(false);
            cbAzul.setEnabled(false);
            cbVerde.setEnabled(false);
            cbVermelho.setEnabled(false);
            cbLink.setEnabled(false);
            cbMasterSword.setEnabled(false);
            checkbox.setEnabled(true);

        } else {
            cbAgua.setEnabled(true);
            cbFloresta.setEnabled(true);
            cbGrama.setEnabled(true);
            cbMontanha.setEnabled(true);
            cbAreia.setEnabled(true);
            cbAzul.setEnabled(true);
            cbVerde.setEnabled(true);
            cbVermelho.setEnabled(true);
            cbLink.setEnabled(true);
            cbMasterSword.setEnabled(true);
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        tfColuna = new javax.swing.JTextField();
        tfLinha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbGrama = new javax.swing.JCheckBox();
        cbAreia = new javax.swing.JCheckBox();
        cbFloresta = new javax.swing.JCheckBox();
        cbMontanha = new javax.swing.JCheckBox();
        cbAgua = new javax.swing.JCheckBox();
        alterar = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cbVermelho = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        cbAzul = new javax.swing.JCheckBox();
        cbVerde = new javax.swing.JCheckBox();
        cbLink = new javax.swing.JCheckBox();
        cbMasterSword = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        jLabel1.setText("Entre com a coordenada que deseja alterar:");

        tfColuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfColunaActionPerformed(evt);
            }
        });

        tfLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLinhaActionPerformed(evt);
            }
        });

        jLabel2.setText("Linha:");

        jLabel3.setText("Coluna:");

        jLabel4.setText("Escolha o tipo de terreno:");

        cbGrama.setText("Grama");
        cbGrama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGramaActionPerformed(evt);
            }
        });

        cbAreia.setText("Areia");
        cbAreia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAreiaActionPerformed(evt);
            }
        });

        cbFloresta.setText("Floresta");
        cbFloresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFlorestaActionPerformed(evt);
            }
        });

        cbMontanha.setText("Montanha");
        cbMontanha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMontanhaActionPerformed(evt);
            }
        });

        cbAgua.setText("Agua");
        cbAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAguaActionPerformed(evt);
            }
        });

        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbVermelho.setText("Pingente Vermelho");
        cbVermelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVermelhoActionPerformed(evt);
            }
        });

        jLabel5.setText("Objetos:");

        cbAzul.setText("Pingente Azul");
        cbAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAzulActionPerformed(evt);
            }
        });

        cbVerde.setText("Pingente Verde");
        cbVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVerdeActionPerformed(evt);
            }
        });

        cbLink.setText("Link");
        cbLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLinkActionPerformed(evt);
            }
        });

        cbMasterSword.setText("Master Sword");
        cbMasterSword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMasterSwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel1)
                                                .addComponent(tfLinha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tfColuna, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbVermelho)
                            .addComponent(cbAgua)
                            .addComponent(jLabel4)
                            .addComponent(cbFloresta)
                            .addComponent(cbMontanha)
                            .addComponent(cbGrama)
                            .addComponent(cbAreia)
                            .addComponent(jLabel5)
                            .addComponent(cbAzul)
                            .addComponent(cbVerde)
                            .addComponent(cbLink)
                            .addComponent(cbMasterSword))
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbGrama)
                            .addComponent(tfLinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbAreia))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbFloresta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbMontanha))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(tfColuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbAgua)
                .addGap(37, 37, 37)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(alterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbVermelho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbAzul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbVerde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbLink)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbMasterSword)
                .addGap(41, 41, 41)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar)
                    .addComponent(jButton1))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLinhaActionPerformed

    }//GEN-LAST:event_tfLinhaActionPerformed

    private void tfColunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfColunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfColunaActionPerformed

    private void cbAreiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAreiaActionPerformed

        organiza(cbAreia);

    }//GEN-LAST:event_cbAreiaActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed

        if (tfLinha.getText().equals("") || tfColuna.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Insira uma coordenada valida!");
            return;
        }
        
        int linha = parseInt(tfLinha.getText());
        int coluna = parseInt(tfColuna.getText());
        int terreno = 0;

        if (linha < 0 || linha >= 42 || coluna < 0 || coluna >= 42) {
            JOptionPane.showMessageDialog(null, "Coordenada invalida!");
            return;
        }

        if ((linha == linkL && coluna == linkC || linha == pingenteAzulL && coluna == pingenteAzulC
                || linha == pingenteVerdeL && coluna == pingenteVerdeC
                || linha == pingenteVermelhoL && coluna == pingenteVermelhoC || linha == masterSwordL && coluna == masterSwordC)
                &&(cbLink.isSelected() || cbMasterSword.isSelected() || cbVerde.isSelected()|| cbVermelho.isSelected()|| cbAzul.isSelected())) {
                JOptionPane.showMessageDialog(null, "Coordenada Ocupada!");
                return;
        }
        if (cbAgua.isSelected()) {
            terreno = 180;
            matriz = m.modificaTerreno(matriz, linha, coluna, terreno);
        } else if (cbAreia.isSelected()) {
            terreno = 20;
            matriz = m.modificaTerreno(matriz, linha, coluna, terreno);
        } else if (cbFloresta.isSelected()) {
            terreno = 100;
            matriz = m.modificaTerreno(matriz, linha, coluna, terreno);
        } else if (cbGrama.isSelected()) {
            terreno = 10;
            matriz = m.modificaTerreno(matriz, linha, coluna, terreno);
        } else if (cbMontanha.isSelected()) {
            terreno = 150;
            matriz = m.modificaTerreno(matriz, linha, coluna, terreno);
        } else if (cbAzul.isSelected()) {
            this.pingenteAzulL = parseInt(tfLinha.getText());
            this.pingenteAzulC = parseInt(tfColuna.getText());
        } else if (cbVerde.isSelected()) {
            this.pingenteVerdeL = parseInt(tfLinha.getText());
            this.pingenteVerdeC = parseInt(tfColuna.getText());
        } else if (cbVermelho.isSelected()) {
            this.pingenteVermelhoL = parseInt(tfLinha.getText());
            this.pingenteVermelhoC = parseInt(tfColuna.getText());
        } else if (cbLink.isSelected()) {
            this.linkL = parseInt(tfLinha.getText());
            this.linkC = parseInt(tfColuna.getText());
        } else if (cbMasterSword.isSelected()) {
            this.masterSwordL = parseInt(tfLinha.getText());
            this.masterSwordC = parseInt(tfColuna.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um terreno!");
        }

        tfLinha.setText("");
        tfColuna.setText("");

    }//GEN-LAST:event_alterarActionPerformed

    private void cbGramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGramaActionPerformed

        organiza(cbGrama);

    }//GEN-LAST:event_cbGramaActionPerformed

    private void cbFlorestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFlorestaActionPerformed

        organiza(cbFloresta);

    }//GEN-LAST:event_cbFlorestaActionPerformed

    private void cbMontanhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMontanhaActionPerformed

        organiza(cbMontanha);

    }//GEN-LAST:event_cbMontanhaActionPerformed

    private void cbAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAguaActionPerformed

        organiza(cbAgua);

    }//GEN-LAST:event_cbAguaActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed

        ArrayList<No> caminho;

        mapa = m.converteMatriz(matriz, mapa);
        BuscaAestrela Astar = new BuscaAestrela(42, 42, this.linkL, this.linkC, this.masterSwordL, this.masterSwordC, this.pingenteVerdeL, this.pingenteVerdeC, this.pingenteVermelhoL, this.pingenteVermelhoC, this.pingenteAzulL, this.pingenteAzulC, matriz, mapa);
        caminho = Astar.getCaminho();
        mapa[linkL][linkC].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Link.png")));
        mapa[masterSwordL][masterSwordC].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MasterSword.png")));
        mapa[pingenteAzulL][pingenteAzulC].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/PingenteAzul.jpg")));
        mapa[pingenteVerdeL][pingenteVerdeC].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/PingenteVerde.jpg")));
        mapa[pingenteVermelhoL][pingenteVermelhoC].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/PingenteVermelho.jpg")));
        Grid G = new Grid(mapa, caminho);
        Frame frame = new Frame(G);

    }//GEN-LAST:event_salvarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbVermelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVermelhoActionPerformed

        organiza(cbVermelho);

    }//GEN-LAST:event_cbVermelhoActionPerformed

    private void cbAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAzulActionPerformed

        organiza(cbAzul);

    }//GEN-LAST:event_cbAzulActionPerformed

    private void cbLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLinkActionPerformed

        organiza(cbLink);

    }//GEN-LAST:event_cbLinkActionPerformed

    private void cbVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVerdeActionPerformed

        organiza(cbVerde);

    }//GEN-LAST:event_cbVerdeActionPerformed

    private void cbMasterSwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMasterSwordActionPerformed

        organiza(cbMasterSword);

    }//GEN-LAST:event_cbMasterSwordActionPerformed

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
            java.util.logging.Logger.getLogger(TelaModificaMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaModificaMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaModificaMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaModificaMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaModificaMapa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JCheckBox cbAgua;
    private javax.swing.JCheckBox cbAreia;
    private javax.swing.JCheckBox cbAzul;
    private javax.swing.JCheckBox cbFloresta;
    private javax.swing.JCheckBox cbGrama;
    private javax.swing.JCheckBox cbLink;
    private javax.swing.JCheckBox cbMasterSword;
    private javax.swing.JCheckBox cbMontanha;
    private javax.swing.JCheckBox cbVerde;
    private javax.swing.JCheckBox cbVermelho;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton salvar;
    private javax.swing.JTextField tfColuna;
    private javax.swing.JTextField tfLinha;
    // End of variables declaration//GEN-END:variables
}
