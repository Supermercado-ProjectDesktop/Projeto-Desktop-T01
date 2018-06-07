/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;
import Model.Interface.ImplementProduto;
import Configuration.ConfigurationsMysql;
import DataBase.DataBase;
import Model.Produto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author JOAO
 */
public class ProdutoDAO implements ImplementProduto{
    private List<Produto> list;
    
    private final DataBase db = new DataBase(new ConfigurationsMysql());
            
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
    public List<Produto> getProduto(String Nome) {
        list = new ArrayList<Produto>();
        try {
            ResultSet rs = this.db.query("SELECT * FROM produto WHERE name LIKE '%" + Nome + "%'");
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
        ResultSet rs = this.db.query("SELECT * FROM produto ORDER BY Nome");
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
    }
    
}
