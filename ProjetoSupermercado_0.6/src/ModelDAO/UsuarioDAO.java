/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;

import Configuration.ConfigurationsMysql;
import DataBase.DataBase;
import Model.Usuario;
import Model.Interface.ImplementUsuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author luiz-
 */
public class UsuarioDAO implements ImplementUsuario {

    private final DataBase db = new DataBase(new ConfigurationsMysql());

    @Override
    public void insert(Usuario usuario) {
        try {
            this.db.execute("INSERT INTO "
                + "usuario (nome_usuario, tipo, password)"
                + "VALUES(?,?,?)", usuario.getNome(),
                usuario.getTipo(), usuario.getPassword());
        } catch (Exception e) {
            System.out.println("Erro de conexao com o banco.");
        }
        
    }

    @Override
    public int getUsuario(String nome, String password) {
        ResultSet rs = this.db.query("SELECT * FROM usuario WHERE nome_usuario LIKE '%"
                + nome + "%' AND password LIKE '%" + password + "%'");

        int qtidade = 0;
        try {
            while (rs.next()) {
                qtidade++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return qtidade;
    }

    @Override
    public void deleteUsuario(String nome) {
        this.db.execute("DELETE FROM "
                + "usuario WHERE nome_usuario LIKE '%" + nome + "%'");
    }

    @Override
    public void updateUsuario(Usuario usuario) {
        this.db.execute("UPDATE usuario SET nome_usuario=?, "
                + "tipo=?,password=? WHERE nome_usuario LIKE '%" + usuario.getNome() + "%'",
                usuario.getNome(), usuario.getTipo(), usuario.getPassword());
    }

}
