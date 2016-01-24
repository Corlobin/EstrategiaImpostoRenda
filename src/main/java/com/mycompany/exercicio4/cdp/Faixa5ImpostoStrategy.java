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
public class Faixa5ImpostoStrategy implements ImpostoStrategy {

     // Essa faixa ela pega acima de 4.271,59
    @Override
    public void ensureCorrectImposto(double valor, int dependentes) {
        double valorInicial = valor - (dependentes * ConstanteImposto.VALOR_DEPENDENTE);
        double valorFinal = valorInicial * 0.275;
        System.out.println("Imposto de renda a pagar " + valorFinal);
    }
    
}
