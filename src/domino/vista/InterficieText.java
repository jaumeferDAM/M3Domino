/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino.vista;

import domino.model.Fitxa;
import domino.model.Jugador;
import domino.model.Torn;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jaume
 */
public class InterficieText {

    Scanner lector = new Scanner(System.in);

    public void mostrarFitxesJugador(List<Fitxa> fitxes) {

        for (int i = 0; i < fitxes.size(); i++) {
            System.out.println(fitxes.get(i).getValors()[0] + ":" + fitxes.get(i).getValors()[1] + " ");
        }
    }

    public String mostrarMenu() {

        System.out.println("\nSeleccionar opció: "
                + "\n1 Jugar Fitxa."
                + "\n2 2"
                + "\n3 3"
                + "\n4 4"
                + "\n5 Passar");

        return lector.nextLine();
    }
    
   
    
    public void mostrarFitxesJugades(Deque<Fitxa> fitxesJugades) {
     for(Fitxa fitxa : fitxesJugades) {
        System.out.println(fitxa.getValors()[0] + " " + fitxa.getValors()[0]);
     }
    }

    public int demanarFitxa(String missatge, List<Fitxa> fitxa) {
        System.out.println(missatge);
        int pos = lector.nextInt();
        return pos;
    }

    public boolean comprovaFitxa(int seleccio, int totalfitxesjugador) {
      boolean comprovar = true;
      
      if(seleccio > 0 && seleccio <= totalfitxesjugador) {
          comprovar = false;
      }
      return comprovar;
    }



    public void mostrarMissatge(String missatge) {
        System.out.println(missatge);
    }
 public String[] setJugadors() {
       
        System.out.println("\n Introdueix el nom del jugador: ");
        for(int i =0;i<jugadors.length;i++) {
            System.out.println(i + ": ");
            jugadors[i] = lector.nextLine();
        }
        
        return jugadors;
    }
}
