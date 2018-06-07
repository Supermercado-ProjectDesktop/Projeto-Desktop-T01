/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Interface;

import Model.Produto;
import java.util.List;

/**
 *
 * @author JOAO
 */
public interface ImplementProduto {
    public void insert(Produto produto);
    
    public void update(Produto produto);
    
    public void delete(String name);
    
    public List<Produto> getProduto(String name);
    
    public List<Produto> getAllProduto();
}
