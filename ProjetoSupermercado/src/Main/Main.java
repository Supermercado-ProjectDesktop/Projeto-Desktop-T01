/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import View.CadastroProduto;
import View.JFMenu_principal;
import View.JFloguim1;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
/** 
 *
 * @Joao
 */
   
public class Main extends JFrame {
     public static void main(String args[]) {
    Main me = new Main();
        me.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       
        me.add(new JFMenu_principal());
        me.setVisible(true);
        me.setSize(900,800);
    }
    }
       
    
    

