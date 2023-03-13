//----------------------//
package Clases;
//----------------------//
//--IMPORTACIONES--//
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//---------------------------//
//--DECLARACION DE LA CLASE BARAJA--//

public class Baraja {
    // Atributos
    private final List<Carta> cartas;

    // Constructor
    public Baraja() {
        // Se definen los valores y colores de las cartas para la creación de la baraja.
        String[] valores = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "Saltar", "Reversa", "Toma 2", "Toma 4", "Cambio Color"};
        String[] colores = {"Rojo", "Azul", "Verde", "Amarillo"};

        // Se crea una lista vacía de cartas.
        cartas = new ArrayList<>();

        // Se recorren los colores y valores definidos para crear las cartas.
        for (String color : colores) {
            for (String valor : valores) {
                // Si el valor de la carta es "Cambio Color" o "Toma 4", entonces se crea
                // una carta comodín con ese valor y se añade a la baraja.
                if(valor.equals("Cambio Color") || valor.equals("Toma 4")){
                    cartas.add(new Carta(valor, "Comodin"));
                }
                // Si el valor de la carta es "0", entonces se crea una carta con ese valor y
                // el color correspondiente, y se añade a la baraja.
                else if(valor.equals("0")){
                    cartas.add(new Carta(valor, color));
                }
                // Para los demás valores, se crean dos cartas con ese valor y el color correspondiente,
                // y se añaden ambas a la baraja.
                else{
                    cartas.add(new Carta(valor, color));
                    cartas.add(new Carta(valor, color));
                }
            }
        }

        Collections.shuffle(cartas); // Se revuelve la baraja.
    }

    // Métodos
    public Carta tomarCarta() {
        // Retorna la carta en la posición 0 de la lista de cartas (es decir, la carta en la
        // parte superior de la baraja) y la remueve de la lista.
        return cartas.remove(0);
    }

    public void agregarCarta(Carta mesa) {
        // Añade la carta recibida como parámetro a la lista de cartas de la baraja.
        cartas.add(mesa);
    }

    public int cantidadCartas() {
        // Retorna la cantidad de cartas que quedan en la baraja.
        return cartas.size();
    }
}
