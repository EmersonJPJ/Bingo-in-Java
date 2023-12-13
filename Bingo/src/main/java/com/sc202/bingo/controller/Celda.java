/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sc202.bingo.controller;

/**
 *
 * @author EMERSON
 */
public class Celda {
    //Declaracion y creaccion del constructor de los valores que va a tener el arreglo de nombre carton para poder validar
    boolean seleccionado;
    int turno;
    int numero;

    public Celda() {
        this.seleccionado = false;
        this.turno = 0;
        this.numero = 0;
    }
}
