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
public interface ImpostoStrategy {
    public double ensureCorrectImposto(double valor, int dependentes);
}
