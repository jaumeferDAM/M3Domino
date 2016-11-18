package domino;

import domino.control.GestioDominoText;
import domino.vista.InterficieText;
import domino.model.Joc;
import domino.model.Jugador;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.SwingUtilities;

public class Domino {

    static Joc joc = new Joc(4, 28, 7);
    static int comptPassar = joc.getTorn();
    static InterficieText it = new InterficieText();

    public static void main(String[] args) {
    GestioDominoText gdt = new GestioDominoText();
    
    gdt.jugarjoc();

    }
}

https://github.com/davidblancolopez/domino-1-activitat-2/tree/master/src/domino