/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jCarrera.modelo;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author PC
 */
public class PruebaTiempo4 extends JApplet implements ActionListener{
private Tiempo3 tiempo;

private JLabel horaEtiqueta, minutoEtiqueta, segundoEtiqueta;
private JTextField horaCampo, minutoCampo, segundoCampo, pantallaCampo;
private JButton ticBoton;
//crear objeto Tiempo3 y configurar GUI
public void init(){
    tiempo=new Tiempo3();
    //objeto el panel de contenido del applet y cambiar esquema a FlowLayourt
    Container contenedor = getContentPane();
    contenedor.setLayout(new FlowLayout());
    //configurar horaEtiqueta y hora Campo
    horaEtiqueta = new JLabel ("Establecer hora");
    horaCampo=new JTextField(10);
    contenedor.add(horaEtiqueta);
    contenedor.add(horaCampo);
     //configurar minutoEtiqueta y minutoCampo
    minutoEtiqueta = new JLabel ("Establecer minuto");
    minutoCampo=new JTextField(10);
    contenedor.add(minutoEtiqueta);
    contenedor.add(minutoCampo);
     //configurar segundoEtiqueta y segundoCampo
    segundoEtiqueta = new JLabel ("Establecer segundo");
    segundoCampo=new JTextField(10);
    contenedor.add(segundoEtiqueta);
    contenedor.add(segundoCampo);
    //configurar pantalla
    pantallaCampo=new JTextField(30);
    pantallaCampo.setEditable(false);
    contenedor.add(pantallaCampo);
    //configurar ticBoton
    ticBoton =new JButton("Agregar 1 a Segundo");
    contenedor.add(ticBoton);
    //registrar los manejos de eventos; este applet es el actionListener.
    //el cual contiene el método actionPerformed que será llamado para manejar los eventos
    //de accion generados por hora Campo, minutoCampo,SegundoCampo y ticBoton
    horaCampo.addActionListener(this);
    minutoCampo.addActionListener(this);
    segundoCampo.addActionListener(this);
    ticBoton.addActionListener(this);
    
    mostrarHora();//actualizar texto en pantallaCampo y barra de estado
}
 //manejador de eventos para los eventos de botón y campo de texto
public void actionPerformed(ActionEvent evento){
    //procesar evento ticBoton
    if (evento.getSource() ==ticBoton) 
        tic();
     //procesar evento de horaCampo
     else if(evento.getSource()== horaCampo){
             tiempo.establecerHora(Integer.parseInt(evento.getActionCommand()));
             horaCampo.setText(" ");
             }
    //procesar evento de minutoCampo8
     else if(evento.getSource()== minutoCampo){
             tiempo.establecerHora(Integer.parseInt(evento.getActionCommand()));
             minutoCampo.setText(" ");
             }
     //procesar evento de segundoCampo
     else if(evento.getSource()== segundoCampo){
             tiempo.establecerHora(Integer.parseInt(evento.getActionCommand()));
             segundoCampo.setText(" ");
             }
        mostrarHora();
    }
public void mostrarHora(){
    pantallaCampo.setText("Hora: "+tiempo.obtenerHora()+"; Minuto:"+
            tiempo.obtenerMinuto()+"; Segundo:"+tiempo.obtenerSegundo());
    
    showStatus("La hora estàndar es: "+ tiempo.aStringEstandar()+
            "; la hora universal es: "+ tiempo.aStringUniversal());
}
//sumar uno al segundo y actualizar la hora/minuto si es necesario
public void tic(){
    tiempo.establecerSegundo((tiempo.obtenerSegundo()+1)%60);
    if (tiempo.obtenerSegundo()==0) {
        tiempo.establecerMinuto((tiempo.obtenerMinuto()+1)%60);
        if(tiempo.obtenerMinuto()==0)
            tiempo.establecerHora((tiempo.obtenerHora()+1)%24);
        
    }
}
    
    
}
