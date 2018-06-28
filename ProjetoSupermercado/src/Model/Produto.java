package Model;

import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Joao Pirolo
 */
public class Produto {
    private int codProduto;
    private String nomeProduto;
    private double precoProduto;
    private int QtdProduto;
    
    public Produto(){}
    public Produto(int codProduto, String nomeProduto, String tipoProduto, double precoProduto,int qtdProduto){
    this.codProduto = codProduto;
    this.nomeProduto = nomeProduto;
    this.precoProduto = precoProduto;
    this.QtdProduto = qtdProduto;
    }

    public int getQtdProduto() {
        return QtdProduto;
    }

    public void setQtdProduto(int QtdProduto) {
        this.QtdProduto = QtdProduto;
    }
    

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

   

   
   
}
