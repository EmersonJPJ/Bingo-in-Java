/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sc202.bingo.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author EMERSON
 */
public class Menu {
    public void Ejecutar()
    {
      Scanner lectura=new Scanner(System.in);
      int opcion;
      //Creacion de los 10 cartones
      Carton carton=new Carton();
      Carton carton2=new Carton();
      Carton carton3=new Carton();
      Carton carton4=new Carton();
      Carton carton5=new Carton();
      Carton carton6=new Carton();
      Carton carton7=new Carton();
      Carton carton8=new Carton();
      Carton carton9=new Carton();
      Carton carton10=new Carton();
   
      do
      {
          System.out.println
        (
         //menu para ingresar al bingo
         "1.Comprar Cartones\n" +
         "2.Jugar\n"+
         "3.Salir"        
         
        );
         opcion=lectura.nextInt();
         
         switch(opcion)
         {
             case 1:
                 //Se crean los 10 cartones y se muestra su carton con sus numeros para poder jugar
                 System.out.println("Carton1");
                 carton.generarCarton();                
                 carton.ImprimirCarton();
                 System.out.println("Carton2");
                 carton2.generarCarton();                
                 carton2.ImprimirCarton();
                 System.out.println("Carton3");
                 carton3.generarCarton();                
                 carton3.ImprimirCarton();
                 System.out.println("Carton4");
                 carton4.generarCarton();                
                 carton4.ImprimirCarton();
                 System.out.println("Carton5");
                 carton5.generarCarton();                
                 carton5.ImprimirCarton();
                 System.out.println("Carton6");
                 carton6.generarCarton();                
                 carton6.ImprimirCarton();
                 System.out.println("Carton7");
                 carton7.generarCarton();                
                 carton7.ImprimirCarton();
                 System.out.println("Carton8");
                 carton8.generarCarton();                
                 carton8.ImprimirCarton();
                 System.out.println("Carton9");
                 carton9.generarCarton();                
                 carton9.ImprimirCarton();
                 System.out.println("Carton10");
                 carton10.generarCarton();                
                 carton10.ImprimirCarton();
                 break;
                 
             case 2:
                 int turno=1;
                 boolean esquinas=true;
                 boolean jugaresquinas = false;
                 boolean jugardiagonal = false;
                 boolean jugarlosdos = false;
                 int juego;
                 
                 //Se escoje la modalidad de juego, si con 4 esquinas, diagonales o con ambos modos
                 //ACLARACION, AL SER TANTOS CARTONES Y SER RANGOS DE NUMEROS TAN CORTOS ES POSIBLE QUE HAYA MAS DE 1 GANADOR POR RONDA
                 
                 
                 System.out.println("Seleccione el modo de juego del bingo: \n1-4 Esquinas\n2-Diagonales\n3-ambos");
                 juego=lectura.nextInt();
                 if(juego==1)
                 {
                   jugaresquinas=true; 
                 }
                 else if(juego==2)
                 {
                   jugardiagonal=true; 
                 }
                 else
                 {
                   jugarlosdos=true;
                 }
                 //Se crea la validacion de datos para que no salgan numeros repetidos
                 List<Integer> lista = new ArrayList();
                 while(esquinas==true){
                    int numero = (int)(Math.random() * 50) +1;
                    if(!lista.contains(numero)){
                        lista.add(numero);
                        System.out.println(numero);
                        
                        //Se van marcando los numeros que vayan saliendo y dependiendo del modo que se haya seleccionado saldra un ganador
                        //convirtiendo el valor de esquinas en false y saliendo del bucle para declarar al ganador
                        //Esto se realiza desde la linea 115 hasta la 297, para asi abarcar los 10 cartones
                        
                        boolean res1 = carton.RevisarFicha(numero, turno);
                        if(res1){
                           System.out.println("Carton1");
                           carton.ImprimirCarton();
                           if(carton.CuatroEsquinas() && jugaresquinas){
                               System.out.println("Carton1 Gano 4 esquinas");
                               esquinas = false;
                           }
                           else if(carton.Diagonal()&& jugardiagonal){
                               System.out.println("Carton1 Gano diagonales");
                               esquinas = false;
                           }
                           else if(carton.CuatroEsquinas() || carton.Diagonal()&& jugarlosdos){
                               System.out.println("Carton1 Gano 4 esquinas y/o diagonales");
                               esquinas = false;
                           }

                        }

                        boolean res2 = carton2.RevisarFicha(numero, turno);
                        if(res2){
                           System.out.println("Carton2");
                           carton.ImprimirCarton();
                           if(carton.CuatroEsquinas() && jugaresquinas){
                               System.out.println("Carton2 Gano 4 esquinas");
                               esquinas = false;
                           }
                           else if(carton.Diagonal()&& jugardiagonal){
                               System.out.println("Carton2 Gano diagonales");
                               esquinas = false;
                           }
                           else if(carton.CuatroEsquinas() || carton.Diagonal()&& jugarlosdos){
                               System.out.println("Carton2 Gano 4 esquinas y/o diagonales");
                               esquinas = false;
                           }

                        }

                        boolean res3 = carton3.RevisarFicha(numero, turno);
                        if(res3){
                           System.out.println("Carton3");
                           carton.ImprimirCarton();
                           if(carton.CuatroEsquinas() && jugaresquinas){
                               System.out.println("Carton3 Gano 4 esquinas");
                               esquinas = false;
                           }
                           else if(carton.Diagonal()&& jugardiagonal){
                               System.out.println("Carton3 Gano diagonales");
                               esquinas = false;
                           }
                           else if(carton.CuatroEsquinas() || carton.Diagonal()&& jugarlosdos){
                               System.out.println("Carton3 Gano 4 esquinas y/o diagonales");
                               esquinas = false;
                           }

                        }
                        boolean res4 = carton4.RevisarFicha(numero, turno);
                        if(res4){
                           System.out.println("Carton4");
                           carton.ImprimirCarton();
                           if(carton.CuatroEsquinas() && jugaresquinas){
                               System.out.println("Carton4 Gano 4 esquinas");
                               esquinas = false;
                           }
                           else if(carton.Diagonal()&& jugardiagonal){
                               System.out.println("Carton4 Gano diagonales");
                               esquinas = false;
                           }
                           else if(carton.CuatroEsquinas() || carton.Diagonal()&& jugarlosdos){
                               System.out.println("Carton4 Gano 4 esquinas y/o diagonales");
                               esquinas = false;
                           }

                        }
                        boolean res5 = carton5.RevisarFicha(numero, turno);
                        if(res5){
                           System.out.println("Carton5");
                           carton.ImprimirCarton();
                           if(carton.CuatroEsquinas() && jugaresquinas){
                               System.out.println("Carton5 Gano 4 esquinas");
                               esquinas = false;
                           }
                           else if(carton.Diagonal()&& jugardiagonal){
                               System.out.println("Carton5 Gano diagonales");
                               esquinas = false;
                           }
                           else if(carton.CuatroEsquinas() || carton.Diagonal()&& jugarlosdos){
                               System.out.println("Carton5 Gano 4 esquinas y/o diagonales");
                               esquinas = false;
                           }

                        }
                        boolean res6 = carton6.RevisarFicha(numero, turno);
                        if(res6){
                           System.out.println("Carton6");
                           carton.ImprimirCarton();
                           if(carton.CuatroEsquinas() && jugaresquinas){
                               System.out.println("Carton6 Gano 4 esquinas");
                               esquinas = false;
                           }
                           else if(carton.Diagonal()&& jugardiagonal){
                               System.out.println("Carton6 Gano diagonales");
                               esquinas = false;
                           }
                           else if(carton.CuatroEsquinas() || carton.Diagonal()&& jugarlosdos){
                               System.out.println("Carton6 Gano 4 esquinas y/o diagonales");
                               esquinas = false;
                           }

                        }
                        boolean res7 = carton7.RevisarFicha(numero, turno);
                        if(res7){
                           System.out.println("Carton7");
                           carton.ImprimirCarton();
                           if(carton.CuatroEsquinas() && jugaresquinas){
                               System.out.println("Carton7 Gano 4 esquinas");
                               esquinas = false;
                           }
                           else if(carton.Diagonal()&& jugardiagonal){
                               System.out.println("Carton7 Gano diagonales");
                               esquinas = false;
                           }
                           else if(carton.CuatroEsquinas() || carton.Diagonal()&& jugarlosdos){
                               System.out.println("Carton7 Gano 4 esquinas y/o diagonales");
                               esquinas = false;
                           }

                        }
                        boolean res8 = carton8.RevisarFicha(numero, turno);
                        if(res8){
                           System.out.println("Carton8");
                           carton.ImprimirCarton();
                           if(carton.CuatroEsquinas() && jugaresquinas){
                               System.out.println("Carton8 Gano 4 esquinas");
                               esquinas = false;
                           }
                           else if(carton.Diagonal()&& jugardiagonal){
                               System.out.println("Carton8 Gano diagonales");
                               esquinas = false;
                           }
                           else if(carton.CuatroEsquinas() || carton.Diagonal()&& jugarlosdos){
                               System.out.println("Carton8 Gano 4 esquinas y/o diagonales");
                               esquinas = false;
                           }

                        }
                        boolean res9 = carton9.RevisarFicha(numero, turno);
                        if(res9){
                           System.out.println("Carton9");
                           carton.ImprimirCarton();
                           if(carton.CuatroEsquinas() && jugaresquinas){
                               System.out.println("Carton9 Gano 4 esquinas");
                               esquinas = false;
                           }
                           else if(carton.Diagonal()&& jugardiagonal){
                               System.out.println("Carton9 Gano diagonales");
                               esquinas = false;
                           }
                           else if(carton.CuatroEsquinas() || carton.Diagonal()&& jugarlosdos){
                               System.out.println("Carton9 Gano 4 esquinas y/o diagonales");
                               esquinas = false;
                           }

                        }
                        boolean res10 = carton10.RevisarFicha(numero, turno);
                        if(res10){
                           System.out.println("Carton10");
                           carton.ImprimirCarton();
                           if(carton.CuatroEsquinas() && jugaresquinas){
                               System.out.println("Carton10 Gano 4 esquinas");
                               esquinas = false;
                           }
                           else if(carton.Diagonal()&& jugardiagonal){
                               System.out.println("Carton10 Gano diagonales");
                               esquinas = false;
                           }
                           else if(carton.CuatroEsquinas() || carton.Diagonal()&& jugarlosdos){
                               System.out.println("Carton10 Gano 4 esquinas y/o diagonales");
                               esquinas = false;
                           }

                        }
                        
                        turno++;
                    }

                 }
                 turno--;
                 //Ademas de imprimir al ganador se imprime en el turno que haya ganado y sale del bucle
                 System.out.println("Gano en el turno: "+turno);
                 break;

         }
      //Sale del menu del juego
      }while (3  != opcion);
    }
}
