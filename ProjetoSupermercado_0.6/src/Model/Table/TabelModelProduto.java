/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Table;
import Model.Produto;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author JOAO
 */
public class TabelModelProduto extends AbstractTableModel {
    private static final long serialVersionUID = 1L;
    List<Produto> list ;

    public TabelModelProduto(List<Produto> list) {
        this.list = list;
    }
       
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 : return list.get(rowIndex).getCodProduto();
            case 1 : return list.get(rowIndex).getNomeProduto();
            case 2 : return list.get(rowIndex).getTipoProduto();
            case 3 : return list.get(rowIndex).getMarcaProduto();
            case 4 : return list.get(rowIndex).getEmbalagemProduto();
            case 5 : return list.get(rowIndex).getConteudoProduto();
            case 6 : return list.get(rowIndex).getComplementoProduto();
            case 7 : return list.get(rowIndex).getPrecoProduto();
            case 8 : return list.get(rowIndex).getQtdProduto();
                 default:return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0  : return "Codigo do Produto";
            case 1  : return "Nome";
            case 2  : return "Tipo";
            case 3  : return "Marca";
            case 4  : return "Embalagem";
            case 5  : return "Conteudo";
            case 6  : return "Complemento";
            case 7  : return "Preco";
            case 8  : return "Quantidade";
           
            default : return null;
        }
    }
}

