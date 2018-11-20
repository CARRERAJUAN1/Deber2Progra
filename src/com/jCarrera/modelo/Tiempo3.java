/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jCarrera.modelo;

import java.text.DecimalFormat;

/**
 *
 * @author PC
 */
public class Tiempo3 {
    private int hora; //0 - 23
    private int minuto; //0 -59
    private int segundo;//0 -59
    //el constructor de tiempo3 inicialza cada variable de instancia en 0;
    //asegura que el objeto tiempo3 inicie en un estado consistente

    public Tiempo3() {
        this(0,0,0);//invoca al constructor de Tiempo3 con tres argumentos
    }
    //Constructor de Tiempo3 se proporciona hora minuto y segundo con : valor predetrminado de 0

    public Tiempo3(int h) {
       this(h,0,0);//invoca al constructor de Tiempo3 con tres argumentos
    }

    public Tiempo3(int h, int m) {
        this(h,m,0);//invoca al constructor de Tiempo3 con tres argumentos
    }
        //Constructor de tiempo3 se proporciona hora ,minuto y segundo con valores predeterminados de 0
    public Tiempo3(int h, int m, int s){
        establecerHora(h, m, s);
    }    
      //Constructor de tiempo3 se proporciona otro objeto tiempo3
    public Tiempo3(Tiempo3 tiempo){
        //invocar al constructor de tiempo2 con tres argumentos
        this(tiempo.obtenerHora(), tiempo.obtenerMinuto(), tiempo.obtenerSegundo());
    }
   //Metodos establecer 
    //establecer un nuevo valor de hora usando hora universal realizar
    //complobaciones de validez en los datos; establecer valores inválidos en cero
   public void establecerHora(int h, int m, int s){
       establecerHora(h);
       establecerMinuto(m);
       establecerSegundo(s);
   } 
   //validar y establecer la hora
   public void establecerHora(int h){
      hora=((h >= 0 && h<24)?h:0); 
   }
   //validar y establecer minuto
   public void establecerMinuto(int m){
     minuto=((m >= 0 && m<60)?m:0); 
   }
   //validar y establecer segundo
   public void establecerSegundo(int s){
     segundo=((s >= 0 && s<60)?s:0); 
   }
   //metodo obtener
   //obtener el valor de hora
   public int obtenerHora(){
       return hora;
   }
   //obtener el valor del minuto
   public int obtenerMinuto(){
       return minuto;
   }
   //obtener el valor del segundo
   public int obtenerSegundo(){
       return segundo;
   }
   // convertir a String en formato de hora universal
   public String aStringUniversal(){
       DecimalFormat dosDigitos=new DecimalFormat("00");
   return dosDigitos.format(obtenerHora())+":"+
           dosDigitos.format(obtenerMinuto())+":"+ dosDigitos.format(obtenerSegundo());
   }
   //convertir a String en formato de hora estándar
   public String aStringEstandar(){
       DecimalFormat dosDigitos=new DecimalFormat("00");
       
       return ((obtenerHora() == 12 || obtenerHora() == 0)? 12:obtenerHora() % 12)+":"+
               dosDigitos.format(obtenerMinuto())+":"+ dosDigitos.format(obtenerSegundo())+
               (obtenerHora()<12 ?"AM":"PM");
   }
            }