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
public class Faixa1ImpostoStrategy implements ImpostoStrategy {
    /*
        Até 1.710,78
    */
    @Override
    public void ensureCorrectImposto(double valor, int dependentes) {
        System.out.println("Isento!");
    }
   
}