/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.exemplopoocomparator;

import java.util.Comparator;

/**
 *
 * @author 00000500
 */
class ComparaPorPreco implements Comparator<Carro>{
    @Override
    public int compare(Carro c1, Carro c2) {  
        if(c1 == null || c2 == null)  
            System.out.println("Nome em branco");  
        Double  preco1 = c1.getPreco();
        Double  preco2 = c2.getPreco(); 

        return  preco1.compareTo( preco2); 
    }
}
