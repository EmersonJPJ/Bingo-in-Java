/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sc202.bingo.controller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EMERSON
 */
public class Carton {
  //Se utilizan constantemente dos ciclos while para poder recorrer la matriz 
  //Se hace uso del ArrayList para poder moldear los datos y validarlos, usando el add y el contains
  //Declaracion del arreglo carton de tipo CELDA
  Celda[][] carton = new Celda[5][5]; 
  boolean repetido;
  
  //Se genera el carton y se llena de valores
  public void generarCarton(){
   int columna =0;
   int celd = 0;
   while (columna < 5){
    while (celd < 5){
        Celda c = new Celda();
        carton[columna][celd] = c;
        celd++;
    }
   celd = 0;
   columna++;
   }
      
   columna =0;
   celd = 0;
   //Validacion para que no se repitan los numeros que se almacenan
   //Utilizacion de los rangos establecidos en las indicaciones para cada columna, almacenados con valores random para las 4 columnas
   while (celd < 5){
    List<Integer> lista = new ArrayList(); 
    while (columna < 5){
     if(celd == 0){
       int guardarN = (int)(Math.random() * 10) +1;
       if(!lista.contains(guardarN)){
        lista.add(guardarN);
        carton[columna][celd].numero = guardarN;
        columna++;
       }  
     }
     else if(celd == 1){
       int guardarN = (int)(Math.random() * 10) +11;
       if(!lista.contains(guardarN)){
        lista.add(guardarN);
        carton[columna][celd].numero = guardarN;
        columna++;
       }  
     }
     else if(celd == 2){
       int guardarN = (int)(Math.random() * 10) +21;
       if(!lista.contains(guardarN)){
        lista.add(guardarN);
        carton[columna][celd].numero = guardarN;
        columna++;
       }  
     }
     else if(celd == 3){
       int guardarN = (int)(Math.random() * 10) +31;
       if(!lista.contains(guardarN)){
        lista.add(guardarN);
        carton[columna][celd].numero = guardarN;
        columna++;
       }  
     }
     else if(celd == 4){
       int guardarN = (int)(Math.random() * 10) +41;
       if(!lista.contains(guardarN)){
        lista.add(guardarN);
        carton[columna][celd].numero = guardarN;
        columna++;
       }  
     }
    } 
    columna =0;
    celd++;
   }
   
   //print de la matriz carton
   String imprimir="";
   celd=0;
   columna=0;
   while (columna < 5){
    while (celd < 5){      
    imprimir=imprimir+carton[columna][celd].numero+",";
    celd++;
    }
    columna++;
    celd=0;
    imprimir=imprimir+ "\n";
   }      
   System.out.println(imprimir);
 }
  
  //Creacion del metodo imprimir carton para que a la hora de jugar se puedan mostrar los valores de los 10 cartones que se compran 
  public void ImprimirCarton(){
   int columna =0;
   int celd = 0;
   String imprimir="";
   celd=0;
   columna=0;
   while (columna < 5){
    while (celd < 5){      
    imprimir=imprimir+carton[columna][celd].numero+" - "+carton[columna][celd].seleccionado+" - "+carton[columna][celd].turno +" , ";
    celd++;
    }
    columna++;
    celd=0;
    imprimir=imprimir+ "\n";
   }      
   System.out.println(imprimir);
  }
  
  //Creacion del metodo de tipo boolean para marcar cuando un valor haya coincidido y sea almacenado aqui 
  public boolean RevisarFicha(int numero, int turno){
   int columna =0;
   int celd = 0;
   boolean res = false;
   while (columna < 5){
    while (celd < 5){      
        if(carton[columna][celd].numero == numero){
           carton[columna][celd].seleccionado = true;
           carton[columna][celd].turno = turno;
           columna = 6;
           celd = 6;
           res = true;
        }
        celd++;
    }
    columna++;
    celd=0;
   }
   return res;  
  }
  
  //Creacion del metodo de tipo boolean, 4 esquinas. En la cual se validan los valores de las esquinas de la matriz y en caso de coincidir darle la victoria al carton 
  public boolean CuatroEsquinas(){
      if(carton[0][0].seleccionado && carton[0][4].seleccionado && carton[4][0].seleccionado && carton[4][4].seleccionado ){
          return true;
      }
      else{
          return false;
          
      }
  }
  //Creacion del metodo de tipo boolean, Diagonal. En la cual se validan los valores de las dos diagonales de la matriz y en caso de coincidir darle la victoria al carton 
  public boolean Diagonal(){
      if(carton[0][0].seleccionado && carton[1][1].seleccionado && carton[2][2].seleccionado && carton[3][3].seleccionado && carton[4][4].seleccionado || carton[0][4].seleccionado && carton[1][3].seleccionado && carton[2][2].seleccionado && carton[3][1].seleccionado && carton[4][0].seleccionado){
          return true;
      }
      else{
          return false;
          
      }
  }
}