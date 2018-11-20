/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jCarrera.vista;

import com.jCarrera.modelo.Tiempo1;

/**
 *
 * @author PC
 */
public class Aplicacion {
    public static void main(String[] args) {
        Tiempo1 horas=new Tiempo1();
        horas.aStringEstandar();
                horas.aStringUniversal();
                horas.establecerHora(12, 22, 10);
                        
    }
}
