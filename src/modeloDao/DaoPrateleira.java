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
import modeloBeans.BeansPrateleira;
import modeloBeans.BeansProduto;



public class DaoPrateleira {
    ConexaoBD conex = new ConexaoBD();
    BeansProduto mod = new BeansProduto();
    
    public void Salvar (BeansPrateleira mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into prateleiras (prat_nome,prat_rua,prat_coluna,prat_linha) values(?,?,?,?)");
            pst.setString(1,mod.getPratNome());
            pst.setString(2,mod.getPratRua());
            pst.setString(3,mod.getPratColuna());
            pst.setString(4,mod.getPratLinha());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Prateleira cadastrada com Sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao cadastrar Prateleira!/nErro:"+ex);
            }
            conex.desconecta();
            
    }
    
}
