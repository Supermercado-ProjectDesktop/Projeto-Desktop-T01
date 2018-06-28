/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;

import Configuration.ConfigurationsMysql;
import DataBase.DataBase;
import DataBase.DataBaseGeneric;
import Model.Compra;
import Model.Interface.ImplementCompra;
import Model.Interface.ImplementProduto;
import Model.Produto;
import Model.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luiz-
 */
public class CompraDAO extends DataBaseGeneric implements ImplementCompra {

    private final DataBase db = new DataBase(new ConfigurationsMysql());

    @Override
    public void insert(Compra compra) {
        try {
            this.db.execute("INSERT INTO "
                    + "compra (valor)"
                    + "VALUES(?)", compra.getValorCompra());
        } catch (Exception e) {
            System.out.println("Erro de conexao com o banco.");
        }

    }
    @Override
    public void deleteAll() {
        try {
            this.db.execute("DELETE * FROM compra");
        } catch (Exception e) {
            System.out.println("Erro de conexao com o banco.");
        }

    }

    @Override
    public List<Compra> getAllCompra() {
        ResultSet rs = this.db.query("SELECT * FROM compra");
        ArrayList lista = new ArrayList<Compra>();
        try {
            while (rs.next()){
                Compra novaCompra = new Compra();
                novaCompra.idCompra = rs.findColumn("idCompra");
                novaCompra.valorCompra = rs.findColumn("valor");
                
                lista.add(novaCompra);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CompraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
