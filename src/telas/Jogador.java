/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import fotos_JinternalFrame.JogadorInternalFrame;
import conectaBanco.Conexao;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Manoel Henrique
 */
public class Jogador extends javax.swing.JFrame {
    Level1 enviaString;
    conectaBanco.Conexao conectado = new Conexao();
    String jogador = "";
    int id = 0;
            
    public Jogador() {
        initComponents();
        conectado.conecta();
        try {
            tela.add(tJogador);
            tJogador.setVisible(true);
            tJogador.setMaximum(true);
            iniciar.setVisible(false);
        } catch (Exception e) {
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

        tela = new javax.swing.JDesktopPane();
        nomeJ = new javax.swing.JLabel();
        enviaNome = new javax.swing.JTextField();
        iniciar = new javax.swing.JButton();
        ok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Campo Minado - Dados do Jogador");
        setResizable(false);

        tela.setBackground(new java.awt.Color(255, 255, 255));
        tela.setForeground(new java.awt.Color(255, 255, 255));
        tela.setToolTipText("");

        nomeJ.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        nomeJ.setForeground(new java.awt.Color(242, 156, 24));
        nomeJ.setText("Nome do Jogador");

        enviaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviaNomeActionPerformed(evt);
            }
        });

        iniciar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        iniciar.setForeground(new java.awt.Color(242, 156, 24));
        iniciar.setText("Inicar!");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        ok.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        ok.setForeground(new java.awt.Color(242, 156, 24));
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        tela.setLayer(nomeJ, javax.swing.JLayeredPane.PALETTE_LAYER);
        tela.setLayer(enviaNome, javax.swing.JLayeredPane.PALETTE_LAYER);
        tela.setLayer(iniciar, javax.swing.JLayeredPane.PALETTE_LAYER);
        tela.setLayer(ok, javax.swing.JLayeredPane.PALETTE_LAYER);

        javax.swing.GroupLayout telaLayout = new javax.swing.GroupLayout(tela);
        tela.setLayout(telaLayout);
        telaLayout.setHorizontalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaLayout.createSequentialGroup()
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(enviaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(nomeJ))
                    .addGroup(telaLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(ok))
                    .addGroup(telaLayout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(iniciar)))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        telaLayout.setVerticalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(nomeJ)
                .addGap(18, 18, 18)
                .addComponent(enviaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ok)
                .addGap(28, 28, 28)
                .addComponent(iniciar)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tela)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tela)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
            this.dispose();
            level1.setVisible(true);
    }//GEN-LAST:event_iniciarActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        try {
            if(!enviaNome.getText().isEmpty()){        
            jogador = this.enviaNome.getText();
            if(jogador.length()>15)
                    JOptionPane.showMessageDialog(null, "O nome deve conter no máximo 15 caracteres","limite de caracteres", JOptionPane.WARNING_MESSAGE);
            
            else{
            nomeJ.setVisible(false);
            enviaNome.setVisible(false);
            ok.setVisible(false);
            iniciar.setVisible(true);
            
            PreparedStatement pst = conectado.conn.prepareStatement("insert into pontos(nome, pontuacao) values(?, 0)");
            pst.setString(1, enviaNome.getText());
            pst.executeUpdate();
            }
            }
            
            else
                JOptionPane.showMessageDialog(null, "Por favor preencha o campo nome do jogador!", "atenção", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_okActionPerformed

    private void enviaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enviaNomeActionPerformed

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
            java.util.logging.Logger.getLogger(Jogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogador().setVisible(true);
            }
        });
    }
    private Level1 level1 = new Level1();
    private JogadorInternalFrame tJogador = new JogadorInternalFrame();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField enviaNome;
    private javax.swing.JButton iniciar;
    private javax.swing.JLabel nomeJ;
    private javax.swing.JButton ok;
    private javax.swing.JDesktopPane tela;
    // End of variables declaration//GEN-END:variables
}
