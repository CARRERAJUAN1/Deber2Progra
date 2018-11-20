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
public class Tiempo2 {
    private int hora; //0 - 23
    private int minuto; //0 -59
    private int segundo;//0 -59
    //el constructor de tiempo2 inicial cada variable de instancia en cero
    //asegura que el objeto tiempo2 empiece en un estado consiatente

    public Tiempo2() {
        this(0,0,0);//invoca al constructor de Tiempo2 con tres argumentos
    }
    //Constructor de Tiempo2 se proporciona hora minuto y segundo con : valor predetrminado de 0

    public Tiempo2(int h) {
       this(h,0,0);//invoca al constructor de tiempo 2 con tres argumentos
    }

    public Tiempo2(int h, int m) {
        this(h,m,0);
    }
        //Constructor de tiempo2 se proporciona hora ,minuto y segundo
    public Tiempo2(int h, int m, int s){
        establecerHora(h, m, s);//invoca a establecerHora para validar la hora
    }    
      //Constructor de tiempo2 se proporciona otro objeto tiempo2
    public Tiempo2(Tiempo2 tiempo){
        //invocar al constructor de tiempo2 con tres argumentos
        this(tiempo.hora, tiempo.minuto, tiempo.segundo);
    }
   //establecer un nuevo valor de tiempo, utilizando la hora universal realizar
    //complobaciones de validez en los datos establecer valores invalidos en cero
   public void establecerHora(int h, int m, int s){
       hora=((h >= 0 && h<24)?h:0);
       minuto=((m >= 0 && m<60)?m:0);
       hora=((s >= 0 && s<60)?s:0);
   } 
   // convertir a String en formato de hora universal
   public String aStringUniversal(){
       DecimalFormat dosDigitos=new DecimalFormat("00");
   return dosDigitos.format(hora)+":"+
           dosDigitos.format(minuto)+":"+ dosDigitos.format(segundo);
   }
   //convertir a String en formato de hora estándar
   public String aStringEstandar(){
       DecimalFormat dosDigitos=new DecimalFormat("00");
       
       return ((hora == 12 || hora == 0)? 12:hora % 12)+":"+
               dosDigitos.format(minuto)+":"+ dosDigitos.format(segundo)+
               (hora<12 ?"AM":"PM");
   }
            }