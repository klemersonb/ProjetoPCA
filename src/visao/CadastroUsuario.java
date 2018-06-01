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
import modeloBeans.BeansUsuario;
import modeloBeans.ModeloTabela;
import modeloDao.DaoUsuario;

/**
 *
 * @author User
 */
public class CadastroUsuario extends javax.swing.JInternalFrame {

   BeansUsuario mod = new BeansUsuario();
   DaoUsuario dao = new DaoUsuario();
   JDesktopPane  jdpprincipal;
   ConexaoBD conex = new ConexaoBD();
   int flag=0;
    
    public CadastroUsuario() {
        initComponents();
        preencherTabela("select *from usuarios usu_nome");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtUsuario = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnFecharProdutos = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jbPesquisar = new javax.swing.JButton();
        jtPesquisar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuarios");
        setPreferredSize(new java.awt.Dimension(883, 718));

        jtUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtUsuario);

        btnFecharProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_close_58007.png"))); // NOI18N
        btnFecharProdutos.setText("Fechar");
        btnFecharProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharProdutosActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_pencil_58018 (1).png"))); // NOI18N
        jButton3.setText("Editar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_plus_58019.png"))); // NOI18N
        jButton2.setText("  Novo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jbPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_magnify_58016.png"))); // NOI18N
        jbPesquisar.setText("Pesquisar");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jtPesquisar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtPesquisar.setForeground(new java.awt.Color(153, 153, 153));
        jtPesquisar.setText("Digite o texto a procurar");
        jtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPesquisarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Usuarios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(551, 551, 551)
                .addComponent(btnFecharProdutos)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFecharProdutos))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(504, 504, 504))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1365, 678);
    }// </editor-fold>//GEN-END:initComponents

    private void jtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPesquisarActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
       mod.setUsuPesquisa(jtPesquisar.getText());
        BeansUsuario model = dao.buscaUsuario(mod);
        
     
        
        
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void btnFecharProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharProdutosActionPerformed
        // fechar Produtos
        this.dispose();
    }//GEN-LAST:event_btnFecharProdutosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

CadastroUsuario2 vizu= new CadastroUsuario2();
TelaPrincipal.jdpprincipal.add(vizu);
vizu.toFront();
vizu.setVisible(true);

        
  
       
       // TelaLogin.tela.setJdpprincipal(jdpprincipal);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CadastroUsuario2 vizu= new CadastroUsuario2();
TelaPrincipal.jdpprincipal.add(vizu);
vizu.toFront();
vizu.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    public  void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String []{"ID","Nome Usuario"};
        conex.conexao();
        conex.executaSql(Sql);
        try {
            conex.rs.first(); 
            do{
 dados.add(new Object[]{conex.rs.getInt("usu_cod"),conex.rs.getString("usu_nome")});
            }while(conex.rs.next()); 
            
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane,"Erro ao preencher ArrayList"+ex);
                }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
       
        jtUsuario.setModel(modelo);
        jtUsuario.getColumnModel().getColumn(0).setPreferredWidth(160);
        jtUsuario.getColumnModel().getColumn(0).setResizable(false);
        jtUsuario.getColumnModel().getColumn(1).setPreferredWidth(1180);
        jtUsuario.getColumnModel().getColumn(1).setResizable(false);
     
        jtUsuario.getTableHeader().setReorderingAllowed(false);
        jtUsuario.setAutoResizeMode(jtUsuario.AUTO_RESIZE_OFF);
        jtUsuario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconecta();
        
        
    }
      
     
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFecharProdutos;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JTextField jtPesquisar;
    private javax.swing.JTable jtUsuario;
    // End of variables declaration//GEN-END:variables
}