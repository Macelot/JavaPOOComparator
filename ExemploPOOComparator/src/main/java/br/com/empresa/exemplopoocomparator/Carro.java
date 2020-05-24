/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.exemplopoocomparator;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author 00000500
 */
class Carro {
    String nome;
    String marca;
    Double preco;
    Integer portas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getPortas() {
        return portas;
    }

    public void setPortas(Integer portas) {
        this.portas = portas;
    }
    public void print(ArrayList<Carro> carros){
        DecimalFormat df;
        //df = new DecimalFormat(" R$ #,##0.000");//sempre 4 casas antes e 3 depois da vírgula. Usei 4 para deixar dois espaços já que temos carros com apenas 2 digitos antes do separador
        System.out.print((String.format("%-10s", "Nome")));//sempre teremos 10 espaços note que os espaços extra ficam no final, pois usamos o sinal de menos -
        System.out.printf("%15s","Marca");//sempre teremos 15 espaços, este é um formato mais padrão, os espaços extra ficam na frente
        System.out.printf("%7s","Preço");// ocuparemos 7 posições no total
        System.out.printf("%7s","Portas");
        System.out.println("");
        for (int i = 0; i < carros.size(); i++) {
            System.out.print((String.format("%-10s", carros.get(i).getNome())));//sempre teremos 10 espaços note que os espaços extra ficam no final, pois usamos o sinal de menos -
            System.out.printf("%15s",carros.get(i).getMarca());//sempre teremos 15 espaços, este é um formato mais padrão, os espaços extra ficam na frente
            //System.out.printf(df.format(carros.get(i).getPreco()));
            System.out.printf("%7.3f",carros.get(i).getPreco());// ocuparemos 7 posições no total
            System.out.printf("%7d",carros.get(i).getPortas());//sempre vasmo ter dois espços para o inteiro
            System.out.println("");
        }
    }
    
}
