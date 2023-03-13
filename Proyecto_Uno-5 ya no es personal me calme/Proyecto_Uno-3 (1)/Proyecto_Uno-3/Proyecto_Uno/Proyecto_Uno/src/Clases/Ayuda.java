//----------------------//
package Clases;
//----------------------//
//--IMPORTACIONES--//
import javax.swing.JOptionPane;
//----------------------//
//--DECLARACION DE LA CLASE AYUDA--//
public class Ayuda {
    //----------------------//
    //--METODOS--//
    public void Imprimir(){ //-> IMPRIMIR REGLAS
        JOptionPane.showMessageDialog(null, "REGLAS DE UNO:\n" +
                                        "1. El objetivo del juego es ser el primer jugador en quedarse sin cartas en la mano.\n" +
                                        "2. Cada jugador comienza con una mano de siete cartas.\n" +
                                        "3. El jugador que tenga una carta del mismo color o del mismo n\\u00famero que la carta en la cima del mazo empieza el juego.\n" +
                                        "4. El siguiente jugador debe jugar una carta del mismo color o del mismo n\\u00famero que la carta previa, o una carta comod\\u00edn.\n" +
                                        "5. Si un jugador no puede jugar una carta v\\u00e1lida, debe robar una carta del mazo. Si la carta robada se puede jugar, se puede hacer inmediatamente; de lo contrario, el turno pasa al siguiente jugador.\n" +
                                        "6. Las cartas comod\\u00edn permiten cambiar el color de la carta en juego y el siguiente jugador a jugar. El jugador que juega una carta comod\\u00edn debe especificar qu\\u00e9 color se debe jugar a continuaci\\u00f3n.\n" +
                                        "7. Las cartas de reversa cambian el orden de juego.\n" +
                                        "8. Las cartas de salto omiten el turno del siguiente jugador.\n" +
                                        "9. Las cartas de +2 obligan al siguiente jugador a robar dos cartas del mazo y saltarse su turno.\n" +
                                        "10. Las cartas de +4 comod\\u00edn obligan al siguiente jugador a robar cuatro cartas del mazo y saltarse su turno. El jugador que juega la carta tambi\\u00e9n puede especificar qu\\u00e9 color se debe jugar a continuaci\\u00f3n.\n" +
                                        "11. Si un jugador juega su \\u00faltima carta, el juego termina y ese jugador es el ganador.\n" +
                                        "Que te diviertas jugando al Uno! \n" +
                                        "CONTINUA PARA VOLVER AL MENU\n" );
    }
    //----------------------//
}
