/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino.control;

import domino.vista.InterficieText;
import domino.Domino;
import domino.model.Fitxa;
import domino.model.Joc;
import domino.model.Jugador;
import domino.model.Torn;
import java.util.List;

/**
 *
 * @author Jaume
 */
public class GestioDominoText  {

    public Joc joc;
    InterficieText interficieText;
    Jugador jugador;
    int comptPassar;
    Torn torn;
    String[] setJugadors = new String[4];
    public List<Fitxa> fichesJugador;

    public List<Fitxa> getFichesJugador() {
        return fichesJugador;
    }

    public void setFichesJugador(List<Fitxa> fichesJugador) {
        this.fichesJugador = fichesJugador;
    }

    public GestioDominoText() {
//        Domino.cargarJuego();
        this.joc = new Joc(4, 28, 7);
        this.interficieText = new InterficieText();
        this.torn = new Torn(joc);

    }

    public void jugarjoc() {
        setnomJugadors();
        joc.iniciar(setJugadors);
        
        torn.inicial();
        
        joc.actualitzarEstat();
        
        SeleccionarOpcioMenu();
    }

    public void SeleccionarOpcioMenu() {
        String accio = interficieText.mostrarMenu();

        switch (accio) {

            case "1":
                jugada1();
                break;
            case "Passar":
                passar();
                break;
            //case "":

        }
    }

    public boolean jugada1() {
    Fitxa f;
        int seleccio;
        boolean extrem, correcte;

        //Fitxa.
        //Agafem la posició amb un int.
       
        seleccio = interficieText.demanarFitxa("Quina ficha vols jugar? (1-7)",joc.jugadors[joc.getTorn()].getFitxes());
        
        //Agafem la fitxa que correspon fent servir el int anterior.
        f = joc.jugadors[joc.getTorn()].getFitxes().get(seleccio);
        
        //Agafem l'extrem on es vol posar la ficha amb un boolean,
        //si es vol a l'esquerra serà true sino sera false.
//        extrem = interficieText.demanarCostat();

        //Cridem al metode que col·loca la fitxa.
        correcte = torn.colocarUnaFitxa(f, true);

        return correcte;
    }

    private void passar() {
        joc.setComptPassar(comptPassar++);
    }

    public void setnomJugadors() {
        setJugadors = interficieText.setJugadors();
    }
}
