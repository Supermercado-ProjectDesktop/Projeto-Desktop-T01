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
        mapObj.put("tipoProduto", produto.getTipoProduto());
        mapObj.put("marcaProduto", produto.getMarcaProduto());
        mapObj.put("embalagemProduto", produto.getEmbalagemProduto());
        mapObj.put("conteudoProduto", produto.getConteudoProduto());
        mapObj.put("complementoProduto", produto.getComplementoProduto());
        mapObj.put("precoProduto", produto.getPrecoProduto());
        mapObj.put("qtdProduto", produto.getQtdProduto());


        this.genericInsert(mapObj);
    }

    @Override
    public void update(Produto produto){
        Map<Object, Object> mapObj = new HashMap<>();
        Map<Object, Object> mapConditions = new HashMap<>();
        mapObj.put("nomeProduto", produto.getNomeProduto());
        mapObj.put("tipoProduto", produto.getTipoProduto());
        mapObj.put("marcaProduto", produto.getMarcaProduto());
        mapObj.put("embalagemProduto", produto.getEmbalagemProduto());
        mapObj.put("conteudoProduto", produto.getConteudoProduto());
        mapObj.put("complementoProduto", produto.getComplementoProduto());
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
                produto.setTipoProduto(rs.getString("tipoProduto"));
                produto.setMarcaProduto(rs.getString("marcaProduto"));
                produto.setEmbalagemProduto(rs.getString("embalagemProduto"));
                produto.setConteudoProduto(rs.getString("conteudoProduto"));
                produto.setComplementoProduto(rs.getString("complementoProduto"));
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
                produto.setTipoProduto(rs.getString("tipoProduto"));
                produto.setMarcaProduto(rs.getString("marcaProduto"));
                produto.setEmbalagemProduto(rs.getString("embalagemProduto"));
                produto.setConteudoProduto(rs.getString("conteudoProduto"));
                produto.setComplementoProduto(rs.getString("complementoProduto"));
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
    public Produto getOneProduto(String nomeProduto){
        ResultSet rs = this.getOne(nomeProduto);
        Produto produto = new Produto();
        try {
            produto.setCodProduto(rs.getInt(1));
            produto.setNomeProduto(rs.getString("nomeProduto"));
            produto.setTipoProduto(rs.getString("tipoProduto"));
            produto.setMarcaProduto(rs.getString("marcaProduto"));
            produto.setEmbalagemProduto(rs.getString("embalagemProduto"));
            produto.setConteudoProduto(rs.getString("conteudoProduto"));
            produto.setComplementoProduto(rs.getString("complementoProduto"));
            produto.setPrecoProduto(rs.getDouble("precoProduto"));
            produto.setQtdProduto(rs.getInt("qtdProduto"));
           return produto;
        } catch (SQLException ex) {
            System.out.println("Erro ao retornar um produto pelo codigo: " + ex.getMessage());
        }
        return null;
    }
    
  /*  private final DataBase db = new DataBase(new ConfigurationsMysql());
            
    @Override
    public void insert(Produto produto) {
       
          this.db.execute("INSERT INTO produto (codProduto,nomeProduto,tipoProduto,marcaProduto,embalagemProduto,conteudoProduto,complementoProduto,precoProduto,qtdProduto)VALUES(?,?,?,?,?,?,?,?,?)",produto.getCodProduto(),produto.getNomeProduto(),produto.getTipoProduto(),produto.getMarcaProduto(),produto.getEmbalagemProduto(),produto.getConteudoProduto(),produto.getComplementoProduto(),produto.getPrecoProduto(),produto.getQtdProduto());
    }

    @Override
    public void update(Produto produto) {

         this.db.execute("UPDATE produto SET codProduto=?, tipoProduto=?,marcaProduto=?,embalagemProduto=?,conteudoProduto=?,complementoProduto=?,precoProduto=?,qtdProduto=? WHERE nomeProduto LIKE '%" + produto.getNomeProduto() + "%'",
                 produto.getCodProduto(),produto.getTipoProduto(),produto.getMarcaProduto(),
                 produto.getEmbalagemProduto(),produto.getConteudoProduto(),produto.getPrecoProduto(),
                 produto.getQtdProduto()
                 );                                                    
    }

    @Override
    public void delete(String Nome) {
        this.db.execute("DELETE FROM produto WHERE Nome LIKE '%"+ Nome + "%'");
    }

    @Override
    public List<Produto> getProduto(String NomeProduto) {
        list = new ArrayList<Produto>();
        try {
            ResultSet rs = this.db.query("SELECT * FROM produto WHERE name LIKE '%" + NomeProduto + "%'");
            while (rs.next()) { 
               
                Produto produto = new Produto();
                produto.setCodProduto(rs.getInt(1));
                produto.setNomeProduto(rs.getString(2));
                produto.setTipoProduto(rs.getString(3));
                produto.setMarcaProduto(rs.getString(4));
                produto.setEmbalagemProduto(rs.getString(5));
                produto.setConteudoProduto(rs.getString(6));
                produto.setComplementoProduto(rs.getString(7));
                produto.setPrecoProduto(rs.getDouble(8));
                produto.setQtdProduto(rs.getInt(9));
                
                list.add(produto);
            }
            return list;
        } catch (SQLException ex) {
            System.out.println("Houve um erro ao obter um produto: " + ex.getMessage());
        }
        return null;
    }

    @Override
    public List<Produto> getAllProduto() {
        list = new ArrayList<Produto>();
        ResultSet rs = this.db.query("SELECT * FROM produto ORDER BY NomeProduto");
        try {
            while(rs.next()){
               Produto produto = new Produto();
                produto.setCodProduto(rs.getInt(1));
                produto.setNomeProduto(rs.getString(2));
                produto.setTipoProduto(rs.getString(3));
                produto.setMarcaProduto(rs.getString(4));
                produto.setEmbalagemProduto(rs.getString(5));
                produto.setConteudoProduto(rs.getString(6));
                produto.setComplementoProduto(rs.getString(7));
                produto.setPrecoProduto(rs.getDouble(8));
                produto.setQtdProduto(rs.getInt(9));
                
                list.add(produto);
            }
            return list;
        } catch (SQLException ex) {
            System.out.println("Erro ao retornar um produto pelo nome: " + ex.getMessage());
        }
        return null;
    }*/
    
    
}
