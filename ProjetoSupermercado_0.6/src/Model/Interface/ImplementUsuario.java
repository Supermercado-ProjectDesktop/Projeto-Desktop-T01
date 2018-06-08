/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Interface;

import Model.Usuario;

/**
 *
 * @author luiz-
 */
public interface ImplementUsuario {
    public void insert(Usuario usuario);
    public int getUsuario(String nome, String password);
    public void deleteUsuario(String nome);
    public void updateUsuario(Usuario usuario);
}
