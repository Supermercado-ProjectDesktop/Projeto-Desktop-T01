/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Interface.ImplementUsuario;
import Model.Table.TabelModelUsuario;
import Model.Usuario;
import ModelDAO.UsuarioDAO;
import View.CadastroUsuario;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author JOAO
 */
public class UsuarioController {
    private final CadastroUsuario panel;
    private final ImplementUsuario implementUsuario;
    private List<Usuario> list;
    
    public UsuarioController(CadastroUsuario panel) {
        this.panel = panel;
        implementUsuario = new UsuarioDAO();
        list = implementUsuario.getAllUsuario();
    }
    
    public void reset(){
        panel.getTxtCodUsuario().setText("");
        panel.getTxtCpf().setText("");
        panel.getTxtNome().setText("");
        panel.getTxtSobrenome().setText("");
        panel.getTxtTipoUsuario().setText("");
        panel.getTxtSenha().setText("");
        
        panel.getTabelUsuario().clearSelection();
        }
    public void setTabel(){
        list = implementUsuario.getAllUsuario();
        panel.getTabelUsuario().setModel(new TabelModelUsuario(list));
    }
public  void getDataField(){
        int row = panel.getTabelUsuario().getSelectedRow();
        if (row != -1){
            panel.getTxtCodUsuario().setText(list.get(row).getCodUsuario());
            panel.getTxtCpf().setText(list.get(row).getCpf());
            panel.getTxtNome().setText(list.get(row).getNome());
            panel.getTxtSobrenome().setText(list.get(row).getSobrenome());
            panel.getTxtTipoUsuario().setText(list.get(row).getTipoUsuario());
            panel.getTxtSenha().setText(list.get(row).getSenha());
        }
    }
    public void insert(){
        Usuario user = new Usuario();
        if (panel.getTxtNome().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(panel, "Sem dados para cadastrar.",null, JOptionPane.ERROR_MESSAGE);
            return;
        }
        user.setCodUsuario(panel.getTxtCodUsuario().getText());
        user.setCpf(panel.getTxtCpf().getText());
        user.setNome(panel.getTxtNome().getText());
        user.setSobrenome(panel.getTxtSobrenome().getText());
        user.setTipoUsuario(panel.getTxtTipoUsuario().getText());
        user.setSenha(panel.getTxtSenha().getText());
        
        implementUsuario.insert(user);
    }

    public void update(){
        Usuario user = new Usuario();
        user.setCodUsuario(panel.getTxtCodUsuario().getText());
        user.setCpf(panel.getTxtCpf().getText());
        user.setNome(panel.getTxtNome().getText());
        user.setSobrenome(panel.getTxtSobrenome().getText());
        user.setTipoUsuario(panel.getTxtTipoUsuario().getText());
        user.setSenha(panel.getTxtSenha().getText());
        
        
        implementUsuario.updateUsuario(user);
    }
    
    public void delete(){
        if (panel.getTxtCodUsuario().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(panel, "Sem dados para excluir.",null, JOptionPane.ERROR_MESSAGE);
            return;
        }
        int row = Integer.parseInt(panel.getTxtCodUsuario().getText());
        implementUsuario.deleteUsuario("");
    }  
        public void getData(){
        if (panel.getTxtNome().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(panel, "Digite um nome para buscar.", null, JOptionPane.WARNING_MESSAGE);
            return;
        }
        String name = panel.getTxtNome().getText();
        implementUsuario.getUsuarioByName(name);
        this.filterTable(name);
    }
    
    public void filterTable(String nome){
        list = implementUsuario.getUsuarioByName(nome);
        panel.getTabelUsuario().setModel(new TabelModelUsuario(list));
    }
   

}
