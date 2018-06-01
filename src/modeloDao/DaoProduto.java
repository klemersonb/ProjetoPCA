/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import controle.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansProduto;




    
public class DaoProduto {
    ConexaoBD conex = new ConexaoBD();
    BeansProduto mod = new BeansProduto();
    
    public void Salvar (BeansProduto mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into produtos (prod_desc,prod_qnt,prod_barras,prod_prat,prod_rua,prod_coluna,prod_linha) values(?,?,?,?,?,?,?)");
            pst.setString(1,mod.getProdDesc());
            pst.setInt(2,mod.getProdQnt());
            pst.setString(3,mod.getProdBarras());
             pst.setString(4,mod.getProdPrat());
              pst.setString(5,mod.getProdRua());
               pst.setString(6,mod.getProdColuna());
                pst.setString(7,mod.getProdLinha());
             
            
            pst.execute();
            JOptionPane.showMessageDialog(null,"Produto cadastrado com Sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao cadastrar Produto!/nErro:"+ex);
            }
            conex.desconecta();
            
    }
    public void Alterar (BeansProduto mod){
    conex.conexao();
    try{
            PreparedStatement pst = conex.con.prepareStatement("update produtos set prod_desc=?, prod_qnt=? where prod_cod=?");
            pst.setString(1, mod.getProdDesc());
            pst.setInt(2, mod.getProdQnt());
            pst.setInt(3, mod.getProdCod());
          
            pst.execute();
            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração do usuario!/nErro:"+ex);
        }
    conex.desconecta();
    
    }
    public BeansProduto buscaProduto (BeansProduto mod){
        conex.conexao();
        conex.executaSql("select *from produtos where prod_desc like'%"+mod.getUsuPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setProdCod(conex.rs.getInt("prod_cod"));
            mod.setProdDesc(conex.rs.getString("prod_desc"));
            mod.setProdQnt(conex.rs.getInt("prod_qnt"));
            mod.setProdBarras(conex.rs.getString("prod_barras"));
            mod.setProdPrat(conex.rs.getString("prod_prat"));
            mod.setProdRua(conex.rs.getString("prod_rua"));
            mod.setProdColuna(conex.rs.getString("prod_coluna"));
            mod.setProdLinha(conex.rs.getString("prod_linha"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Produto não Cadastrado!");
        }
        conex.desconecta();
        return mod;

    }
     public void Excluir (BeansProduto mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from produtos where prod_cod=?");
            pst.setInt(1, mod.getProdCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Produto excluido com sucesso!");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir Produto!");
        }
        conex.desconecta();
            
        }
    
    
}