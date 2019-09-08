import java.util.Scanner;
import javax.swing.*;

/**
 * Programa para simular un ascensor
 * 
 * @author Sandra Martin, Israel Severiche, Jose Alvarez
 * @version 20190908
 */

public class Ascensor{
    public static void main(String[] args){
        int pmax, pmin, pact, pnext, hacer;
        String alt;
        
        pact = 0 ; 
        pnext = 0;
        alt = JOptionPane.showInputDialog(null,"¿Cuantos pisos tiene el edificio?");
        pmax = Integer.parseInt(alt);

        alt = JOptionPane.showInputDialog(null, "¿Cuantos sotanos tiene el edificio?");
        pmin = (Integer.parseInt(alt)*-1)+1;

        alt = JOptionPane.showInputDialog(null, "¿En que piso se encuentra?");
        pact = Integer.parseInt(alt);

        hacer = JOptionPane.showOptionDialog(null, "¿Hacia que piso vas?", "Arriba o Abajo?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
            new String[]{"Arriba", "Abajo"}, "Subo");
            
        switch(hacer){
            case 0:
            pnext = pact + 1;
            break;
            
            case 1:
            pnext = pact - 1;
            break;
        }
        
        if (pnext < pmin || pnext > pmax)
            JOptionPane.showMessageDialog(null,"No existe ese piso ");
            
        if (pnext == 0 && pact == 1)
            JOptionPane.showMessageDialog(null,"El próximo piso es "+ -1);
            
        if (pnext == 0 && pact == -1)
            JOptionPane.showMessageDialog(null,"El próximo piso es "+ 1);
            
        if (pnext > pmin && pnext < pmax && pnext != 0)
            JOptionPane.showMessageDialog(null,"El próximo piso es "+ pnext);
    }
}