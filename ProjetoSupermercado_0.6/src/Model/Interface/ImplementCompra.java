/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Interface;

import Model.Compra;
import java.util.List;

/**
 *
 * @author luiz-
 */
public interface ImplementCompra {
    public void insert(Compra compra);
    public List<Compra> getAllCompra();
    public void deleteAll();
}
