/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Interface.ImplementProduto;
import Model.Produto;
import Model.Table.TabelModelProduto;
import ModelDAO.ProdutoDAO;
import View.CadastroProduto;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author JOAO
 */
public class ProdutoController {
    private final CadastroProduto panel;
    private final ImplementProduto implementProduto;
    private List<Produto> list;
    
    public ProdutoController(CadastroProduto panel) {
        this.panel = panel;
        implementProduto = new ProdutoDAO();
        list = implementProduto.getAllProduto();
    }
    
    public void reset(){
        panel.getTxtCodProduto().setText("");
        panel.getTxtNomeProduto().setText("");
        panel.getTxtTipoProduto().setText("");
        panel.getTxtMarcaProduto().setText("");
        panel.getTxtEmbalagemProduto().setText("");
        panel.getTxtContProduto().setText("");
        panel.getTxtComplemento().setText("");
        panel.getTxtPrecoProduto().setText("");
        panel.getTxtQtdDisponivel().setText("");
        panel.getTabelProduto().clearSelection();
    }
     public void setTabel(){
        list = implementProduto.getAllProduto();
        panel.getTabelProduto().setModel(new TabelModelProduto(list));
    }
    
    public  void getDataField(){
        int row = panel.getTabelProduto().getSelectedRow();
        if (row != -1){
            panel.getTxtCodProduto().setText(String.valueOf(list.get(row).getCodProduto()));
            panel.getTxtNomeProduto().setText(list.get(row).getNomeProduto());
            panel.getTxtTipoProduto().setText(list.get(row).getTipoProduto());
            panel.getTxtMarcaProduto().setText(list.get(row).getMarcaProduto());
            panel.getTxtEmbalagemProduto().setText(list.get(row).getEmbalagemProduto());
            panel.getTxtContProduto().setText(list.get(row).getConteudoProduto());
            panel.getTxtComplemento().setText(list.get(row).getComplementoProduto());
            panel.getTxtPrecoProduto().setText(String.valueOf(list.get(row).getPrecoProduto()));
            panel.getTxtQtdDisponivel().setText(String.valueOf(list.get(row).getQtdProduto()));  
        }
    }
    
    public void insert(){
    Produto produto = new Produto();
       if (panel.getTxtNomeProduto().getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(panel, "Sem dados para cadastrar.",null, JOptionPane.ERROR_MESSAGE);
          return;
        }
       produto.setCodProduto(Integer.parseInt(panel.getTxtCodProduto().getText()));
       produto.setNomeProduto(panel.getTxtNomeProduto().getText());
       produto.setMarcaProduto(panel.getTxtMarcaProduto().getText());
       produto.setTipoProduto(panel.getTxtTipoProduto().getText());
       produto.setEmbalagemProduto(panel.getTxtEmbalagemProduto().getText());
       produto.setConteudoProduto(panel.getTxtContProduto().getText());
       produto.setComplementoProduto(panel.getTxtComplemento().getText());
       produto.setQtdProduto(Integer.parseInt(panel.getTxtQtdDisponivel().getText()));
       produto.setPrecoProduto(Double.parseDouble(panel.getTxtPrecoProduto().getText()));
       implementProduto.insert(produto);
}

    public void update(){
        Produto produto = new Produto();
        
        produto.setNomeProduto(panel.getTxtNomeProduto().getText());
        if (panel.getTxtNomeProduto().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(panel, "Sem dados para atualizar.",null, JOptionPane.ERROR_MESSAGE);    
        }
        produto.setCodProduto(Integer.parseInt(panel.getTxtCodProduto().getText()));
        produto.setTipoProduto(panel.getTxtTipoProduto().getText());
        produto.setMarcaProduto(panel.getTxtMarcaProduto().getText());
        produto.setEmbalagemProduto(panel.getTxtEmbalagemProduto().getText());
        produto.setConteudoProduto(panel.getTxtContProduto().getText());
        produto.setComplementoProduto(panel.getTxtComplemento().getText());
        produto.setPrecoProduto(Double.parseDouble(panel.getTxtPrecoProduto().getText()));
        produto.setQtdProduto(Integer.parseInt(panel.getTxtQtdDisponivel().getText()));
        implementProduto.update(produto);
    
}
    public void delete(){
       if (panel.getTxtNomeProduto().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(panel, "Sem dados para excluir.",null, JOptionPane.ERROR_MESSAGE);
            return;
        }
      implementProduto.delete(panel.getTxtNomeProduto().getText());
}
 
    public void getData(){
        if (panel.getTxtNomeProduto().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(panel, "Digite um nome de produto para buscar.", null, JOptionPane.WARNING_MESSAGE);
            return;
        }
        String Nome = panel.getTxtNomeProduto().getText();
        implementProduto.getProduto(Nome);
        this.filterTable(Nome);
    }
     public void filterTable(String Nome){
        list = implementProduto.getProduto(Nome);
        panel.getTabelProduto().setModel(new TabelModelProduto(list));
    }
}



