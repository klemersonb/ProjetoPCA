/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ConexaoBD;
import javax.swing.JDesktopPane;

/**
 *
 * @author User
 */
public class TelaPrincipal extends javax.swing.JFrame {

    ConexaoBD conecta = new ConexaoBD();
    
    public TelaPrincipal() {
        initComponents();
        conecta.conexao();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpprincipal = new javax.swing.JDesktopPane();
        jInternalFrameBemvindo = new javax.swing.JInternalFrame();
        PainelBemVindo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fecharBemVindo = new javax.swing.JButton();
        MenuPrincipal = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnProdutos = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        MenuFerramenta = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        SairSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SSLA");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jInternalFrameBemvindo.setTitle("Bem-Vindo");
        jInternalFrameBemvindo.setToolTipText("");
        jInternalFrameBemvindo.setVisible(true);
        jInternalFrameBemvindo.getContentPane().setLayout(null);

        PainelBemVindo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PainelBemVindo.setLayout(null);

        jLabel2.setText("Cadastro -");
        PainelBemVindo.add(jLabel2);
        jLabel2.setBounds(10, 20, 60, 20);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_Profile_10593.png"))); // NOI18N
        jButton1.setToolTipText("Usuarios");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PainelBemVindo.add(jButton1);
        jButton1.setBounds(10, 40, 140, 110);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_Add_10577.png"))); // NOI18N
        jButton2.setToolTipText("Produtos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        PainelBemVindo.add(jButton2);
        jButton2.setBounds(150, 40, 140, 110);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_icons_menu_1564512.png"))); // NOI18N
        jButton3.setToolTipText("Prateleiras");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        PainelBemVindo.add(jButton3);
        jButton3.setBounds(290, 40, 140, 110);

        jButton4.setText("Relatorios");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        PainelBemVindo.add(jButton4);
        jButton4.setBounds(10, 190, 140, 110);

        jLabel3.setText("Relatorios");
        PainelBemVindo.add(jLabel3);
        jLabel3.setBounds(10, 170, 70, 20);

        jInternalFrameBemvindo.getContentPane().add(PainelBemVindo);
        PainelBemVindo.setBounds(10, 40, 1060, 490);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("GUIA DO SISTEMA");
        jInternalFrameBemvindo.getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 140, 17);

        fecharBemVindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_close_58007.png"))); // NOI18N
        fecharBemVindo.setToolTipText("Fechar tela Bem-Vindo");
        fecharBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharBemVindoActionPerformed(evt);
            }
        });
        jInternalFrameBemvindo.getContentPane().add(fecharBemVindo);
        fecharBemVindo.setBounds(970, 10, 40, 25);

        jdpprincipal.setLayer(jInternalFrameBemvindo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpprincipalLayout = new javax.swing.GroupLayout(jdpprincipal);
        jdpprincipal.setLayout(jdpprincipalLayout);
        jdpprincipalLayout.setHorizontalGroup(
            jdpprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpprincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrameBemvindo, javax.swing.GroupLayout.PREFERRED_SIZE, 1088, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jdpprincipalLayout.setVerticalGroup(
            jdpprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpprincipalLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jInternalFrameBemvindo, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jMenu1.setText("Vizualizar");

        btnProdutos.setText("Produtos");
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });
        jMenu1.add(btnProdutos);

        jMenuItem5.setText("Prateleiras");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Usuarios");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        MenuPrincipal.add(jMenu1);

        jMenu2.setText("Cadastros");

        jMenuItem1.setText("Cadastro de Produtos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Cadastro de Prateleiras");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Cadasto de Usuarios");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        MenuPrincipal.add(jMenu2);

        MenuFerramenta.setText("Ferramentas");

        jMenuItem4.setText("Tela Bem-Vindo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        MenuFerramenta.add(jMenuItem4);

        jMenuItem7.setText("Lançar Produtos");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        MenuFerramenta.add(jMenuItem7);

        MenuPrincipal.add(MenuFerramenta);

        jMenu3.setText("Sair");

        SairSistema.setText("Sair");
        SairSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairSistemaActionPerformed(evt);
            }
        });
        jMenu3.add(SairSistema);

        MenuPrincipal.add(jMenu3);

        setJMenuBar(MenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpprincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpprincipal)
        );

        setSize(new java.awt.Dimension(1054, 764));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
         CadastroUsuario2 obj = new CadastroUsuario2();
        jdpprincipal.add(obj);
        obj.setVisible(true);
       
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        // chamar tela de Produtos
        CadastroProdutos obj = new CadastroProdutos();
        jdpprincipal.add(obj);
        obj.setVisible(true);
        
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void fecharBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharBemVindoActionPerformed
        // fechar bem vindo
        jInternalFrameBemvindo.dispose();
    }//GEN-LAST:event_fecharBemVindoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void SairSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairSistemaActionPerformed
       conecta.desconecta();
        System.exit(0);
    }//GEN-LAST:event_SairSistemaActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // chamar tela bemvindo
        TelaPrincipal tela = new TelaPrincipal ();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         CadastroUsuario2 obj = new CadastroUsuario2();
        jdpprincipal.add(obj);
        obj.setVisible(true);     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CadastroProdutos2 obj = new CadastroProdutos2();
        jdpprincipal.add(obj);
        obj.setVisible(true);        // TODO add your handling code here:
          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // vizualizar usuarios
         CadastroUsuario obj = new CadastroUsuario();
        jdpprincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
         CadastroPrateleiras obj = new CadastroPrateleiras();
        jdpprincipal.add(obj);
        obj.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CadastroProdutos2 obj = new CadastroProdutos2();
        jdpprincipal.add(obj);
        obj.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CadastroPrateleiras2 obj = new CadastroPrateleiras2();
        jdpprincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        LancarProdutos obj = new LancarProdutos();
        jdpprincipal.add(obj);
        obj.setVisible(true);  
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       CadastroPrateleiras2 obj = new CadastroPrateleiras2();
        jdpprincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
    private javax.swing.JMenu MenuFerramenta;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JPanel PainelBemVindo;
    private javax.swing.JMenuItem SairSistema;
    private javax.swing.JMenuItem btnProdutos;
    private javax.swing.JButton fecharBemVindo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JInternalFrame jInternalFrameBemvindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    public static javax.swing.JDesktopPane jdpprincipal;
    // End of variables declaration//GEN-END:variables

    public JDesktopPane getJdpprincipal() {
        return jdpprincipal;
    }

    public void setJdpprincipal(JDesktopPane jdpprincipal) {
        this.jdpprincipal = jdpprincipal;
    }
}
