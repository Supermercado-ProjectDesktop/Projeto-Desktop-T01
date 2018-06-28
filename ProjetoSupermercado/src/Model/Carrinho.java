/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JOAO
 */
public class Carrinho {

    private List<Produto> itens = new ArrayList<Produto>();
    public double total = 0;

    public List<Produto> getItens() {
        return itens;
    }

    public void setItens(List<Produto> Produto) {
        this.itens = itens;
    }

    public double getTotal() {
        return total;
    }
    
    // tô ligado que esse é o setter do netbeans e tal, mas isso aqui nem pode ter
    // porque senão dá pra modificar o valor diretamente e deixar ele errado
    // o correto é usar o método contaTotal pra ver o valor final da compra,
    // então deixa comentado o método setTotal ou pelo menos não usa em lugar nenhum
    public void setTotal(int total) {
        this.total = total;
    }

    public void contaTotal() {
        // esse método percorre o arraylist e conta o valor dele
        
        for (Produto prod : itens) {
            this.total += prod.getPrecoProduto();
        }
    }

    public void adicionaProduto(Produto p, int n) {
        //n = quantidade, ou seja, se tiver mais de 1 produto
        // o n roda mais de 1x, o que faz a função adicionar
        // a quantidade correta de produtos
        while (n > 0) { 
            itens.add(p);
        }
    }

}
