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
    
    public void delete(int codProduto);
    
    public List<Produto> getAllProduto();
    
    public List<Produto> getProdutoByName(String nomeProduto);
    
    public Produto getOneProduto(int id);
}
