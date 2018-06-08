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
    private String tipoProduto;
    private String marcaProduto;
    private String embalagemProduto;
    private String conteudoProduto;
    private String complementoProduto;
    private double precoProduto;
    private int QtdProduto;
    
    public Produto(){}
    public Produto(int codProduto, String nomeProduto, String tipoProduto, String marcaProduto, String embalagemProduto,String conteudoProduto, String complementoProduto, double precoProduto,int qtdProduto){
    this.codProduto = codProduto;
    this.nomeProduto = nomeProduto;
    this.tipoProduto = tipoProduto;
    this.marcaProduto = marcaProduto;
    this.embalagemProduto = embalagemProduto;
    this.conteudoProduto = conteudoProduto;
    this.complementoProduto = complementoProduto;
    this.precoProduto = precoProduto;
    this.QtdProduto = qtdProduto;
    }

    public int getQtdProduto() {
        return QtdProduto;
    }

    public void setQtdProduto(int QtdProduto) {
        this.QtdProduto = QtdProduto;
    }

    public String getComplementoProduto() {
        return complementoProduto;
    }

    public void setComplementoProduto(String complementoProduto) {
        this.complementoProduto = complementoProduto;
    }
    
    

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getEmbalagemProduto() {
        return embalagemProduto;
    }

    public void setEmbalagemProduto(String embalagemProduto) {
        this.embalagemProduto = embalagemProduto;
    }

    public String getConteudoProduto() {
        return conteudoProduto;
    }

    public void setConteudoProduto(String conteudoProduto) {
        this.conteudoProduto = conteudoProduto;
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

    public String getMarcaProduto() {
        return marcaProduto;
    }

    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

   
   
}
