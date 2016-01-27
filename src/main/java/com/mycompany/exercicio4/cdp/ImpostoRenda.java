/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio4.cdp;

import java.util.HashMap;

/**
 *
 * @author Ricardo
 */
public class ImpostoRenda {
    public ImpostoStrategy impostoStrategy;
    public double impostoCalculado;
    public ImpostoRenda() {
        impostoStrategy = new Faixa1ImpostoStrategy();
    }
    public void calculaImposto(double valor, int dependentes){
        if(valor <= 1710.78)
            this.impostoStrategy = new Faixa2ImpostoStrategy();
        else if(valor >= 1710.78 && valor <= 2563.91) 
            this.impostoStrategy = new Faixa3ImpostoStrategy();
        else if(valor >= 2563.92 && valor <= 3418.59)
            this.impostoStrategy = new Faixa4ImpostoStrategy();            
        else if(valor > 4271.59)
            this.impostoStrategy = new Faixa5ImpostoStrategy();
        
        this.impostoCalculado = impostoStrategy.ensureCorrectImposto(valor, dependentes);
        
    }

    public double getImpostoCalculado() {
        return impostoCalculado;
    }
    
    
}

