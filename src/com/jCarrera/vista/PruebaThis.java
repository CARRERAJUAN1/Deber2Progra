/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jCarrera.vista;

import com.jCarrera.modelo.HoraSimple;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.text.DecimalFormat;

/**
 *
 * @author PC
 */
public class PruebaThis {
    public static void main(String[] args) {
        HoraSimple hora=new HoraSimple(12, 30, 19);
        
        JOptionPane.showMessageDialog(null, hora.crearCadena(),
                "Demostraciòn de la referencia \"this\"",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
