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
import modeloBeans.BeansUsuario;




public class DaoUsuario {
    ConexaoBD conex = new ConexaoBD();
    BeansUsuario mod = new BeansUsuario();
    
    public void Salvar (BeansUsuario mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into usuarios (usu_nome,usu_senha,usu_usu) values(?,?,?)");
            pst.setString(1,mod.getUsuNome());
            pst.setString(2,mod.getUsuSenha());
            pst.setString(3,mod.getUsuUsu());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Usuario cadastrrado com Sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao cadastrar Usuario!/nErro:"+ex);
            }
            conex.desconecta();
    }
    
    
    public BeansUsuario buscaUsuario (BeansUsuario mod){
        conex.conexao();
        conex.executaSql("select *from usuarios where usu_nome like'%"+mod.getUsuPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setUsuCod(conex.rs.getInt("usu_cod"));
            mod.setUsuNome(conex.rs.getString("usu_nome"));
            mod.setUsuUsu(conex.rs.getString("usu_usu"));
            mod.setUsuSenha(conex.rs.getString("usu_senha"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuario não Cadastrado!");
        }
        conex.desconecta();
        return mod;

    }
    
    public void Alterar (BeansUsuario mod){
    conex.conexao();
    try{
            PreparedStatement pst = conex.con.prepareStatement("update usuarios set usu_nome=?, usu_senha=? where usu_cod=?");
            pst.setString(1, mod.getUsuNome());
            pst.setString(2, mod.getUsuSenha());
            pst.setInt(3, mod.getUsuCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario alterado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração do usuario!/nErro:"+ex);
        }
    conex.desconecta();
    
    }
    public void Excluir (BeansUsuario mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from usuarios where usu_cod=?");
            pst.setInt(1, mod.getUsuCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario excluido com sucesso!");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir usuario!");
        }
        conex.desconecta();
            
        }
    }

