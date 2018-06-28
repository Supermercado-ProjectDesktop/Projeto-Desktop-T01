/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Table;

import Model.Usuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author JOAO
 */
public class TabelModelUsuario extends AbstractTableModel {
    private static final long serialVersionUID = 1L;
    List<Usuario> list ;

    public TabelModelUsuario(List<Usuario> list) {
        this.list = list;
    }
       
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 : return list.get(rowIndex).getCodUsuario();
            case 1 : return list.get(rowIndex).getCpf();
            case 2 : return list.get(rowIndex).getNome();
            case 3 : return list.get(rowIndex).getSobrenome();
            case 4 : return list.get(rowIndex).getTipoUsuario();
            case 5 : return list.get(rowIndex).getSenha();
            
                 default:return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0  : return "codUsuario";
            case 1  : return "cpf";
            case 2  : return "nome";
            case 3  : return "sobrenome";
            case 4  : return "tipoUsuario";
            case 5  : return "senha";
            
            default : return null;
        }
    }
}


