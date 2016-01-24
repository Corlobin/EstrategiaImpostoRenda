/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio4.application;

import com.mycompany.exercicio4.cdp.ImpostoRenda;

/**
 *
 * @author Ricardo
 */
public class Application {
    public static void main(String args[]) {
        ImpostoRenda imposto = new ImpostoRenda();
        imposto.calculaImposto(2000, 0);
        
    }
}
