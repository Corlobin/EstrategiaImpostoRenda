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
public class Faixa3ImpostoStrategy implements ImpostoStrategy {

    // Essa faixa ela pega entre 2.563,92 até 3.418,59
    @Override
    public double ensureCorrectImposto(double valor, int dependentes) {
        double valorInicial = valor - (dependentes * ConstanteImposto.VALOR_DEPENDENTE);
        double valorFinal = valorInicial * 0.15;
        System.out.println("Imposto de renda a pagar " + valorFinal);
        return valorFinal;
    }
    
    
}
