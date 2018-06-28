/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;

import Configuration.ConfigurationsMysql;
import DataBase.DataBase;
import DataBase.DataBaseGeneric;
import Model.Usuario;
import Model.Interface.ImplementUsuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author luiz-
 */
public class UsuarioDAO extends DataBaseGeneric implements ImplementUsuario {

    private List<Usuario> list;

    public UsuarioDAO() {
        super(new ConfigurationsMysql(), "usuario");
    }

    @Override
    public void insert(Usuario usuario) {
        Map<Object, Object> mapObj = new HashMap<>();
        mapObj.put("codUsuario", usuario.getCodUsuario());
        mapObj.put("cpf", usuario.getCpf());
        mapObj.put("nome", usuario.getNome());
        mapObj.put("sobrenome", usuario.getSobrenome());
        mapObj.put("tipoUsuario", usuario.getTipoUsuario());
        mapObj.put("senha", usuario.getSenha());
        this.genericInsert(mapObj);
        
    }

    @Override
    public void deleteUsuario(String codUsuario) {
        Map<Object, Object> mapConditions = new HashMap<>();
        mapConditions.put("codUsuario", codUsuario);
        this.genericDelete(mapConditions);
    }

    @Override
    public void updateUsuario(Usuario usuario) {
        Map<Object, Object> mapObj = new HashMap<>();
        Map<Object, Object> mapConditions = new HashMap<>();
        mapObj.put("cpf", usuario.getCpf());
        mapObj.put("nome", usuario.getNome());
        mapObj.put("sobrenome", usuario.getSobrenome());
        mapObj.put("tipoUsuario", usuario.getTipoUsuario());
        mapObj.put("senha", usuario.getSenha());
        mapConditions.put("codUsuario", usuario.getCodUsuario());

        this.genericUpdate(mapObj, mapConditions);
    }


    @Override
    public List<Usuario> getUsuarioByName(String nome) {
        this.list = new ArrayList<>();
        try {
            ResultSet rs = this.getLike("nome", nome);
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setCodUsuario(rs.getString(1));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setTipoUsuario(rs.getString("TipoUsuario"));
                usuario.setSenha(rs.getString("senha"));
                list.add(usuario);
            }
            return list;
        } catch (SQLException ex) {
            System.out.println("Houve um erro ao obter um nome: " + ex.getMessage());
        }
        return null;
    }

    @Override
    public Usuario getOneUsuario(int id) {
        ResultSet rs = this.getOne(id);
        Usuario usuario = new Usuario();
        try {
            usuario.setCodUsuario(rs.getString(1));
            usuario.setCpf(rs.getString("cpf"));
            usuario.setNome(rs.getString("nome"));
            usuario.setSobrenome(rs.getString("sobrenome"));
            usuario.setTipoUsuario(rs.getString("TipoUsuario"));
            usuario.setSenha(rs.getString("senha"));
            return usuario;
        } catch (SQLException ex) {
            System.out.println("Erro ao retornar um usuario pelo codigo: " + ex.getMessage());
        }
        return null;
    }

    @Override
    public int getUsuario(String cpf, String senha) {
        ResultSet rs = this.getLike("cpf", cpf);
        int quantidade = 0;
        try {
            while (rs.next()) {
                quantidade++;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao retornar um usuario pelo codigo: " + ex.getMessage());
        }
        return quantidade;
    }

    @Override
    public List<Usuario> getAllUsuario() {
         list = new ArrayList<>();
        ResultSet rs = this.getAll();
        try {
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setCodUsuario(rs.getString(1));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setTipoUsuario(rs.getString("tipoUsuario"));
                usuario.setSenha(rs.getString("senha"));
                list.add(usuario);
            }
            return list;
        } catch (SQLException ex) {
            System.out.println("Erro ao retornar um usuario pelo nome: " + ex.getMessage());
        }
        return null;
    }
    }



