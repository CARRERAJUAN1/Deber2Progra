/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jCarrera.vista;

import com.jCarrera.modelo.Tiempo1;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class PruebaTiempo1 {
    public static void main(String[] args) {
        Tiempo1 tiempo=new Tiempo1(); //llamar al constructor de tiempo1
        //anexar versión String de tiempo a salida String
        String salida ="La hora universal inicial es:"+
                tiempo.aStringUniversal()+"\nLa hora estándar inicial es:"+
                tiempo.aStringEstandar();
       //cambiar tiempo anexar hora actualizada a salida
       tiempo.establecerHora(13, 27, 6);
       salida +="\n\nLa hora universal después de establecerHora es: "+
               tiempo.aStringUniversal()+
               "\nLa hora estandar después de establecerHora es:"+ tiempo.aStringEstandar();
       //establecer tiempo con valores invalidos; anexar tiempo actualizado a salida 
       tiempo.establecerHora(99, 99, 99);
       salida += "\n\nDespues de intentar ajustar inválidos: "+
               "\nHora universal: "+ tiempo.aStringUniversal()+
               "\nHora estándar: "+ tiempo.aStringEstandar();
        JOptionPane.showMessageDialog(null,salida,"Prueba de la clase Tiempo", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
