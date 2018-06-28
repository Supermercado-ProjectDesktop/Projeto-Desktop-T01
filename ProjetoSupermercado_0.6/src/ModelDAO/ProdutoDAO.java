/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;
import Model.Interface.ImplementProduto;
import Configuration.ConfigurationsMysql;
import DataBase.DataBase;
import DataBase.DataBaseGeneric;
import Model.Produto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author JOAO
 */
public class ProdutoDAO extends DataBaseGeneric implements ImplementProduto{
    private List<Produto> list;
    public ProdutoDAO(){
        super(new ConfigurationsMysql(), "produto");
    }
            
    @Override
    public void insert(Produto produto){
        Map<Object, Object> mapObj = new HashMap<>();
       
        mapObj.put("nomeProduto", produto.getNomeProduto());
        mapObj.put("codProduto", produto.getCodProduto());
        mapObj.put("precoProduto", produto.getPrecoProduto());
        mapObj.put("qtdProduto", produto.getQtdProduto());


        this.genericInsert(mapObj);
    }

    @Override
    public void update(Produto produto){
        Map<Object, Object> mapObj = new HashMap<>();
        Map<Object, Object> mapConditions = new HashMap<>();
        mapObj.put("nomeProduto", produto.getNomeProduto());
        mapObj.put("precoProduto", produto.getPrecoProduto());
        mapObj.put("qtdProduto", produto.getQtdProduto());
        mapConditions.put("codProduto", produto.getCodProduto());
       
        
       this.genericUpdate(mapObj, mapConditions);
    }

    @Override
    public void delete(int CodProduto) {
        Map<Object, Object> mapConditions = new HashMap<>();
        mapConditions.put("codProduto", CodProduto);
        this.genericDelete(mapConditions);
    }

    @Override
    public List<Produto> getProdutoByName(String nomeProduto){
        this.list = new ArrayList<>();
        try {
            ResultSet rs = this.getLike("nomeProduto", nomeProduto);
            while (rs.next()) { 
                Produto produto = new Produto();
                produto.setCodProduto(rs.getInt(1));
                produto.setNomeProduto(rs.getString("nomeProduto"));
                produto.setPrecoProduto(rs.getDouble("precoProduto"));
                produto.setQtdProduto(rs.getInt("qtdProduto"));
                
                list.add(produto);
            }
            return list;
        } catch (SQLException ex){
            System.out.println("Houve um erro ao obter um produto: " + ex.getMessage());
        }
        return null;
    }

    @Override
    public List<Produto> getAllProduto(){
        list = new ArrayList<>();
        ResultSet rs = this.getAll();
        try {
            while(rs.next()){
                Produto produto = new Produto();
                produto.setCodProduto(rs.getInt(1));
                produto.setNomeProduto(rs.getString("nomeProduto"));
                produto.setPrecoProduto(rs.getDouble("precoProduto"));
                produto.setQtdProduto(rs.getInt("qtdProduto"));
                list.add(produto);
            }
            return list;
        } catch (SQLException ex) {
            System.out.println("Erro ao retornar um produto pelo nome: " + ex.getMessage());
        }
        return null;
    }
    
    @Override
    public Produto getOneProduto(int id){
        ResultSet rs = this.getOne(id);
        Produto produto = new Produto();
        try {
            produto.setCodProduto(rs.getInt(1));
            produto.setNomeProduto(rs.getString("nomeProduto"));
            produto.setPrecoProduto(rs.getDouble("precoProduto"));
            produto.setQtdProduto(rs.getInt("qtdProduto"));
           return produto;
        } catch (SQLException ex) {
            System.out.println("Erro ao retornar um produto pelo codigo: " + ex.getMessage());
        }
        return null;
    }
    
}
