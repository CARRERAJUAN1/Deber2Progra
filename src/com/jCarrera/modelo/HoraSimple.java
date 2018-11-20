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
//la clase HoraSimple muestra el uso de la referencia "this
public class HoraSimple {
    private int hora;
    private int minuto;
    private int segundo;
    
    //el constructor utiliza nombres de parámetros idénticos a los nombres de la variable
    //de instancia; serequiere la referencia "this" para diferenciar entre los nombres
 
    public HoraSimple(int hora, int minuto, int segundo) {
        this.hora = hora; //establece hora del objeto "this"
        this.minuto = minuto; //establecer minuto del objeto "this"
        this.segundo = segundo;//establecer segundo del objeto"this"
    }
    
//usar "this" explicito e implicito para llamar al método aStrngEstandar

  public String crearCadena(){
  return "this.aStringEstandar():"+ this.aStringEstandar() +
 "\naStringEstandar(): "+ aStringEstandar();
}
  //devolver la representación String de HoraSimple
  public String aStringEstandar(){
      DecimalFormat dosDigitos = new DecimalFormat("00");
      //"this"no se requiere aquí, ya que el método no tiene 
      //variables locales con los mismos nombres que las variables de instancia
      return dosDigitos.format(this.hora)+":"+
              dosDigitos.format(this.minuto)+":"+
              dosDigitos.format(this.segundo);
  }

}
