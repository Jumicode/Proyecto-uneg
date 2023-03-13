
package Clases;

//Julio estuvo aqui
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import javax.swing.JOptionPane;

// La siguiente línea indica que esta clase pertenece al paquete por defecto de Java
// (es decir, no se especifica un paquete en particular).
// Si se quisiera organizar el código en un paquete específico, se debería especificar
// el nombre del paquete utilizando la sintaxis: "package nombre.del.paquete;"
// al inicio del archivo .java.
public class CartaEspecial extends Carta {

    // Declaración de una variable de instancia privada de tipo String,
    // que almacenará el tipo de efecto que tiene la carta especial.
    private String tipoDeEfecto;
    
    // Constructor de la clase CartaEspecial, que recibe como parámetros
    // el valor y el color de la carta especial (heredados de la clase Carta).
    // Este constructor invoca al constructor de la clase padre (Carta) mediante
    // la palabra clave "super", y luego asigna el valor del parámetro "valor"
    // a la variable de instancia "tipoDeEfecto".
    public CartaEspecial(String valor, String color) {
        super(valor, color);
        tipoDeEfecto = valor;
    }
    
    // Método "Saltar", que recibe como parámetro un número entero y devuelve
    // ese número incrementado en 1.
    public int Saltar(int num){
        return num++;
    }
    
    // Método "Reversa", que recibe como parámetro una lista de jugadores
    // y devuelve la misma lista con los elementos invertidos en orden.
    public List<Jugador> Reversa(List<Jugador> jugadores){
        Collections.reverse(jugadores);
        return jugadores;
    }
    
    // Método "Cambio", que no recibe ni devuelve parámetros.
    // Este método muestra un menú en la consola, pidiendo al usuario que
    // seleccione un color de la lista (azul, amarillo, verde o rojo).
    // Luego, actualiza el color de la carta especial con el valor seleccionado.
    public void Cambio(){
        Scanner entrada=new Scanner(System.in);
        int opc=0;
        System.out.println("\n\nSeleccione el color que se va a jugar: ");
        System.out.println("| 1.Azul | 2.Amarillo | 3.Verde | 4.Rojo |");
        opc=entrada.nextInt();
        switch(opc){
            case 1: setColor("Azul"); break;
            case 2: setColor("Amarillo"); break;
            case 3: setColor("Verde"); break;
            case 4: setColor("Rojo"); break;
        }
        System.out.println("El color en mesa ahora es: "+getColor());
    }
 
        public List<Jugador> Toma(Baraja baraja, List<Jugador> jugadores, int num, int agregar) {
        // Se obtiene la referencia del jugador correspondiente en la lista de jugadores,
        // utilizando el índice recibido como parámetro.
        Jugador aux = jugadores.get(num);
        // Se invoca al método "ManoInicial" de la clase Jugador, pasando como parámetros
        // la baraja y la cantidad de cartas que se le van a dar al jugador.
        aux.ManoInicial(baraja, agregar);
        // Se devuelve la lista de jugadores actualizada.
        return jugadores;
    }
    
}

    
    
