/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio4.cdp;

/**
 *
 * @author Ricardo
 */
public class Faixa2ImpostoStrategy implements ImpostoStrategy {
    // Essa faixa ela pega entre 1.710,79 até 2.563,91
    @Override
    public void ensureCorrectImposto(double valor, int dependentes) {
        double valorInicial = valor - (dependentes * ConstanteImposto.VALOR_DEPENDENTE);
        double valorFinal = valorInicial * 0.075;
        System.out.println("Imposto de renda a pagar " + valorFinal);
    }
    
}
