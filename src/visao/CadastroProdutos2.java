/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;
import modeloBeans.BeansProduto;
import modeloDao.DaoProduto;


/**
 *
 * @author User
 */
public class CadastroProdutos2 extends javax.swing.JInternalFrame {
    BeansProduto mod = new BeansProduto();
    DaoProduto dao = new DaoProduto();
    int flag = 0;
    
    public CadastroProdutos2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtalg = new javax.swing.JLabel();
        jtBarras = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtQnt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtDesc = new javax.swing.JTextField();
        jtCod = new javax.swing.JTextField();
        jtPesquisar = new javax.swing.JTextField();
        jbPesquisar = new javax.swing.JButton();
        jtPrateleira = new javax.swing.JTextField();
        jtRua = new javax.swing.JTextField();
        jtColuna = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtLinha = new javax.swing.JTextField();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbAdicionar = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Produtos");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Código");

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel6.setText("Dados Principais");

        jtalg.setText("Quantidade");

        jtBarras.setEnabled(false);
        jtBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBarrasActionPerformed(evt);
            }
        });

        jLabel4.setText("Descrição");

        jtQnt.setEnabled(false);

        jLabel2.setText("Cod. Barras");

        jtDesc.setEnabled(false);
        jtDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDescActionPerformed(evt);
            }
        });

        jtCod.setEnabled(false);

        jbPesquisar.setText("Pesquisar");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jtPrateleira.setEnabled(false);

        jtRua.setEnabled(false);

        jtColuna.setEnabled(false);
        jtColuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtColunaActionPerformed(evt);
            }
        });

        jLabel3.setText("Prateleira");

        jLabel5.setText("Bloco");

        jLabel7.setText("Coluna");

        jLabel8.setText("Linha");

        jtLinha.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jtalg)
                                    .addComponent(jLabel5))
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbPesquisar)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtQnt)
                                .addComponent(jtBarras)
                                .addComponent(jtCod)
                                .addComponent(jtPrateleira)
                                .addComponent(jtRua)
                                .addComponent(jtColuna, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtLinha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(93, 98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtalg)
                    .addComponent(jtQnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPrateleira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtColuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtLinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jbPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jbSalvar.setText("Salvar");
        jbSalvar.setEnabled(false);
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbAdicionar.setText("Adicionar");
        jbAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionarActionPerformed(evt);
            }
        });

        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAdicionar)
                    .addComponent(jbAlterar)
                    .addComponent(jbExcluir)
                    .addComponent(jbCancelar)
                    .addComponent(jbSalvar)
                    .addComponent(jbFechar))
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
flag=2;     
novo();
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jtDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDescActionPerformed

    private void jtBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtBarrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtBarrasActionPerformed

    private void jbAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionarActionPerformed
   flag = 1;
        novo();
   
    }//GEN-LAST:event_jbAdicionarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
      jtDesc.setText("");
      jtQnt.setText("");
      jtCod.setText("");
      jtBarras.setText("");
        
      jbCancelar.setEnabled(false);
      jbSalvar.setEnabled(false);
      jtDesc.setEnabled(false);
      jtCod.setEnabled(false);
      jtBarras.setEnabled(false);
      jtQnt.setEnabled(false);
      jbAdicionar.setEnabled(true);
      jbExcluir.setEnabled(true);
      jbAlterar.setEnabled(true);
     
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
 if (jtDesc.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "preencha o Nome para continuar");
        jtDesc.requestFocus(); 
    } else if(jtQnt.getText().isEmpty()){
         JOptionPane.showMessageDialog(null, "preencha o Usuário para continuar");
         jtQnt.requestFocus();
     } else if (jtBarras.getText().isEmpty()) {
         JOptionPane.showMessageDialog(null, "preencha o Confirmar Senha para continuar");
     jtBarras.requestFocus();
         
    } else 
       if(flag==1) {
           
           mod.setProdDesc(jtDesc.getText());
            
           mod.setProdQnt(Integer.parseInt(jtQnt.getText()));
           mod.setProdBarras(jtBarras.getText());
           mod.setProdPrat(jtPrateleira.getText());
           mod.setProdRua(jtRua.getText());
           mod.setProdColuna(jtColuna.getText());
           mod.setProdLinha(jtLinha.getText());
           dao.Salvar(mod);
           jtDesc.setText("");
           jtQnt.setText("");
           jtBarras.setText("");
           jtPrateleira.setText("");
           jtRua.setText("");
           jtColuna.setText("");
           jtLinha.setText("");
           
           
       
         
       }else{
          mod.setProdCod(Integer.parseInt(jtCod.getText()));
           mod.setProdDesc(jtDesc.getText());
           mod.setProdBarras(jtBarras.getText());
           mod.setProdPrat(jtPrateleira.getText());
           mod.setProdRua(jtRua.getText());
           mod.setProdColuna(jtColuna.getText());
           mod.setProdLinha(jtLinha.getText());
           dao.Alterar(mod);
          
     }
        
        
      jtCod.setText("");
      jtDesc.setText("");
      jtQnt.setText("");
     jtBarras.setText("");
        
      jbCancelar.setEnabled(false);
      jbSalvar.setEnabled(false);
      jtDesc.setEnabled(false);
      jtCod.setEnabled(false);
      jtBarras.setEnabled(false);
      jtQnt.setEnabled(false);
      jbAdicionar.setEnabled(true);
      jbExcluir.setEnabled(true);
      jbAlterar.setEnabled(true);
    
        
        
        
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
     mod.setUsuPesquisa(jtPesquisar.getText());
        BeansProduto model = dao.buscaProduto(mod);
        
        jtCod.setText(String.valueOf(model.getProdCod()));
        jtDesc.setText(model.getProdDesc());
        jtQnt.setText(String.valueOf(model.getProdQnt()));
        jtBarras.setText(model.getProdBarras());
        jtPrateleira.setText(model.getProdPrat());
        jtRua.setText(model.getProdRua());
        jtColuna.setText(model.getProdColuna());
        jtLinha.setText(model.getProdLinha());
        
 
        
        jbExcluir.setEnabled(true);
        jbAlterar.setEnabled(true);
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
       int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja realmente excluir?");
        if(resposta == JOptionPane.YES_OPTION){
            mod.setProdCod(Integer.parseInt(jtCod.getText()));
            dao.Excluir(mod);
      jtDesc.setText("");
      jtQnt.setText("");
      jtCod.setText("");
      jtBarras.setText("");
      jtPrateleira.setText("");
      jtRua.setText("");
      jtColuna.setText("");
      jtLinha.setText("");
      
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jtColunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtColunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtColunaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbAdicionar;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JTextField jtBarras;
    private javax.swing.JTextField jtCod;
    private javax.swing.JTextField jtColuna;
    private javax.swing.JTextField jtDesc;
    private javax.swing.JTextField jtLinha;
    private javax.swing.JTextField jtPesquisar;
    private javax.swing.JTextField jtPrateleira;
    private javax.swing.JTextField jtQnt;
    private javax.swing.JTextField jtRua;
    private javax.swing.JLabel jtalg;
    // End of variables declaration//GEN-END:variables

    public void novo(){
      jbCancelar.setEnabled(true);
      jbSalvar.setEnabled(true);
      jtDesc.setEnabled(true);
      
      jtBarras.setEnabled(true);
      jtQnt.setEnabled(true);
      jtPrateleira.setEnabled(true);
      jtRua.setEnabled(true);
      jtColuna.setEnabled(true);
      jtLinha.setEnabled(true);
      
      jbAdicionar.setEnabled(false);
      jbExcluir.setEnabled(false);
      jbAlterar.setEnabled(false);
       }
    
    public void salvar(){
      jtDesc.setText("");
      jtQnt.setText("");
      jtCod.setText("");
      jtBarras.setText("");
        
      jbCancelar.setEnabled(false);
      jbSalvar.setEnabled(false);
      jtDesc.setEnabled(false);
      jtCod.setEnabled(false);
      jtBarras.setEnabled(false);
      jtQnt.setEnabled(false);
      jbAdicionar.setEnabled(true);
      jbExcluir.setEnabled(true);
      jbAlterar.setEnabled(true);
    }
    
   
        
     


}
