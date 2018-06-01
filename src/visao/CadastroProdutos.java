/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ConexaoBD;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.BeansProduto;
import modeloBeans.BeansUsuario;
import modeloBeans.ModeloTabela;
import modeloDao.DaoProduto;
import modeloDao.DaoUsuario;

/**
 *
 * @author User
 */
public class CadastroProdutos extends javax.swing.JInternalFrame {
 BeansProduto mod = new BeansProduto();
   DaoProduto dao = new DaoProduto();
   JDesktopPane  jdpprincipal;
   ConexaoBD conex = new ConexaoBD();
   int flag=0;

    
    public CadastroProdutos() {
        initComponents();
        preencherTabela("select *from produtos usu_nome");
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jbPesquisar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnFecharProdutos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProduto = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Produtos");
        setToolTipText("");

        jTextField1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("Digite o texto a procurar");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jbPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_magnify_58016.png"))); // NOI18N
        jbPesquisar.setText("Pesquisar");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_plus_58019.png"))); // NOI18N
        jButton2.setText("  Novo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_pencil_58018 (1).png"))); // NOI18N
        jButton3.setText("Editar");

        btnFecharProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_close_58007.png"))); // NOI18N
        btnFecharProdutos.setText("Fechar");
        btnFecharProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharProdutosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Produtos");

        jtProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jtProduto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                        .addComponent(btnFecharProdutos))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFecharProdutos)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1054, 588));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
       mod.setUsuPesquisa(jbPesquisar.getText());
        BeansProduto model = dao.buscaProduto(mod);
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void btnFecharProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharProdutosActionPerformed
      // fechar Produtos
        
    
    }//GEN-LAST:event_btnFecharProdutosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CadastroProdutos2 vizu = new CadastroProdutos2();
TelaPrincipal.jdpprincipal.add(vizu);
vizu.toFront();
vizu.setVisible(true);
       
    }//GEN-LAST:event_jButton2ActionPerformed

public  void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String []{"ID","Descrição produto"," codigo de barras","quantidade","prateleira","bloco","coluna","linha"};
        conex.conexao();
        conex.executaSql(Sql);
        try {
            conex.rs.first(); 
            do{
 dados.add(new Object[]{conex.rs.getInt("prod_cod"),conex.rs.getString("prod_desc"),conex.rs.getString("prod_barras"),conex.rs.getInt("prod_qnt"),conex.rs.getString("prod_prat"),conex.rs.getString("prod_rua"),conex.rs.getString("prod_coluna"),conex.rs.getString("prod_linha")});
            }while(conex.rs.next()); 
            
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane,"Erro ao preencher ArrayList"+ex);
                }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
       
        jtProduto.setModel(modelo);
        jtProduto.getColumnModel().getColumn(0).setPreferredWidth(50);
        jtProduto.getColumnModel().getColumn(0).setResizable(false);
        jtProduto.getColumnModel().getColumn(1).setPreferredWidth(350);
        jtProduto.getColumnModel().getColumn(1).setResizable(false);
        jtProduto.getColumnModel().getColumn(2).setPreferredWidth(100);
        jtProduto.getColumnModel().getColumn(2).setResizable(false);
        jtProduto.getColumnModel().getColumn(3).setPreferredWidth(100);
        jtProduto.getColumnModel().getColumn(3).setResizable(false);
        jtProduto.getColumnModel().getColumn(4).setPreferredWidth(100);
        jtProduto.getColumnModel().getColumn(4).setResizable(false);
        jtProduto.getColumnModel().getColumn(5).setPreferredWidth(100);
        jtProduto.getColumnModel().getColumn(5).setResizable(false);
        jtProduto.getColumnModel().getColumn(6).setPreferredWidth(100);
        jtProduto.getColumnModel().getColumn(6).setResizable(false);
        jtProduto.getColumnModel().getColumn(7).setPreferredWidth(100);
        jtProduto.getColumnModel().getColumn(7).setResizable(false);
     
        jtProduto.getTableHeader().setReorderingAllowed(false);
        
        jtProduto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconecta();
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFecharProdutos;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JTable jtProduto;
    // End of variables declaration//GEN-END:variables
}