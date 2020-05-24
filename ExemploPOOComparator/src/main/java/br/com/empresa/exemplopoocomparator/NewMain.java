/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.exemplopoocomparator;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author marce
 */
public class NewMain {

    /**
     * @param args the command line arguments
     * Referencias https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html#syntax
     *             https://stackoverflow.com/questions/39529615/java-tab-in-system-out
     * dicas para formatação
     * 
     * %d	representa números inteiros
     * %f	representa números floats
     * %2f	representa números doubles
     * %b	representa valores booleanos
     * %c	representa valores char
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro car;
        car= new Carro();

        ArrayList<Carro> carros;
        carros= new ArrayList();

        car.setNome("Corsa");
        car.setMarca("Chevrolett");
        car.setPreco(15.000);
        car.setPortas(4);
        carros.add(car);

        car= new Carro();
        car.setNome("Chevete");
        car.setMarca("Chevrolett");
        car.setPreco(5.000);
        car.setPortas(2);
        carros.add(car);

        car= new Carro();
        car.setNome("Megane");
        car.setMarca("Pegoutt");
        car.setPreco(30.000);
        car.setPortas(4);
        carros.add(car);

        car= new Carro();
        car.setNome("Uno");
        car.setMarca("Fiat");
        car.setPreco(12.000);
        car.setPortas(4);
        carros.add(car);

        car= new Carro();
        car.setNome("Ecosport");
        car.setMarca("Fiat");
        car.setPreco(35.000);
        car.setPortas(5);
        carros.add(car);

        car= new Carro();
        car.setNome("Gol");
        car.setMarca("Volksvagen");
        car.setPreco(36.000);
        car.setPortas(2);
        carros.add(car);

        car= new Carro();
        car.setNome("Montana");
        car.setMarca("Volksvagen");
        car.setPreco(28.000);
        car.setPortas(2);
        carros.add(car);

        car= new Carro();
        car.setNome("Fiesta");
        car.setMarca("Fiat");
        car.setPreco(15.000);
        car.setPortas(2);
        carros.add(car);

        car= new Carro();
        car.setNome("Kadett");
        car.setMarca("Volksvagen");
        car.setPreco(8.000);
        car.setPortas(2);
        carros.add(car);

        car= new Carro();
        car.setNome("Fusca");
        car.setMarca("Volksvagen");
        car.setPreco(4.000);
        car.setPortas(2);
        carros.add(car);

        System.out.println("----------------------------");
        System.out.println("Original");
        
        for (int i = 0; i < carros.size(); i++) {
            System.out.print(carros.get(i).getNome()); 
            System.out.print("  \t");
            System.out.print(carros.get(i).getMarca()); 
            System.out.print("  \t");
            System.out.print(carros.get(i).getPreco());
            System.out.print("  \t");
            System.out.println(carros.get(i).getPortas());
        }
        
        ComparaPorNome cpn ;
        cpn=new ComparaPorNome();
        Collections.sort(carros,cpn);
        System.out.println("----------------------------");
        System.out.println("por Nome");
        car.print(carros);
        
        ComparaPorPreco cpp ;
        cpp=new ComparaPorPreco();
        Collections.sort(carros,cpp);
        System.out.println("----------------------------");
        System.out.println("por Preco");
        
        car.print(carros);
        
        //System.out.printf("%-12s%-12s\n","Column 1","Column 2");
        //System.out.printf("%-12.5f%.20f", 12.23429837482,9.10212023134);
        //neste exemplo o -12 indica a quantidade totoal de simbolos (numeros e pontos)
        //o 5 indica quantos digitos depois do separador 

    }
}