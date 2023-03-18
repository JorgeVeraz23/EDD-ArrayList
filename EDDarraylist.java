/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eddarraylist;

/**
 *
 * @author USER
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class EDDarraylist {

    public static void main(String[] args) {
        ArrayList <String> cadenas;//Creando un objeto o instancia de tipo ArrayList
        cadenas = new ArrayList<String>();
        //ArralyList <String> cadenas = new ArrayList<String>();
        String frase, respuesta = null;
        do{
           frase = JOptionPane.showInputDialog(null,"Ingresa la Frase"); 
           //Agregando la frase a la lista
           cadenas.add(frase);
           respuesta = JOptionPane.showInputDialog(null, "Deseas ingresar otra frase? (SI/NO)");
           //convirtiendo la respuesta a mayuscula
           respuesta = respuesta.toUpperCase();
        }while(!respuesta.equals("NO"));
        //Mostrando el contenido de cadenas
        //frases originales
        for(int i = 0; i<cadenas.size();i++){
            System.out.println(cadenas.get(i));
        }
        //Utilizando el metodo set
        cadenas.set(1, "Jorge Vera");
        System.out.println("frases modificadas");
        for(int i = 0;i<cadenas.size();i++){
            System.out.println(cadenas.get(i));
        }
        
        cadenas.remove(0);
        System.out.println("frases que nos quedan");
        for(int i = 0;i<cadenas.size();i++){
            System.out.println(cadenas.get(i));
        }
        
    }
}
