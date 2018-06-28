/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Interface;

import Model.Usuario;
import java.util.List;

/**
 *
 * @author luiz-
 */
public interface ImplementUsuario {
    public void insert(Usuario usuario);
    
    public void deleteUsuario(String codUsuario);
    
    public void updateUsuario(Usuario usuario);
    
    public int getUsuario(String cpf, String senha);
    
    public List<Usuario> getAllUsuario();
    
    public List<Usuario> getUsuarioByName(String nome);
    
    public Usuario getOneUsuario(int id);
}
