//----------------------//
package Clases;
//----------------------//
//--IMPORTACIONES--//
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//----------------------//
//--DECLARACION DE LA CLASE JUGADOR--//
public class Jugador {
     //----------------------//
    //--ATRIBUTOS--//

    // Atributo de tipo lista que almacenará las cartas del jugador.
    private List<Carta> cartas;

    // Atributo de tipo cadena que almacena el nombre del jugador.
    private String Nombre;

    //----------------------//
    //--METODOS--//

    // Constructor de la clase Jugador que recibe un parámetro de tipo cadena para el nombre del jugador.
    public Jugador(String nombre){
        // Crea una nueva lista vacía para almacenar las cartas del jugador.
        cartas = new ArrayList<>();
        // Asigna el nombre del jugador al atributo Nombre.
        Nombre=nombre;
    }

    //----------------------//

    // Método que devuelve el nombre del jugador.
    public String nombre(){
        return Nombre;
    }

    //----------------------//

    // Método que asigna cartas iniciales al jugador.
    public void ManoInicial(Baraja baraja, int agregar){
        int i;
        for(i=0; i<agregar; i++){
            // Agrega una carta aleatoria a la mano del jugador obteniendo una carta de la baraja utilizando el método tomarCarta().
            cartas.add(baraja.tomarCarta());
        }
    }

    //----------------------//

    // Método que muestra la mano actual del jugador.
    public void MostrarMano(){
        int i;
        for(i=0; i<cartas.size(); i++){
            // Imprime el índice de la carta en la lista, seguido del símbolo de tubería, la carta en sí y otro símbolo de tubería.
            System.out.print(" | "+(i+1)+"."+cartas.get(i)+" | ");
        }
        // Imprime un espacio en blanco en una nueva línea.
        System.out.println(" ");
    }
    //----------------------//
   public Carta JugarCarta(Carta mesa, Baraja baraja){
    // Se inicializan variables importantes para la ejecución del método.
    int num = 0, contador= 0;
    RecibirNum aux= new RecibirNum();
    Carta cartaAux=new Carta(" ", " ");
    boolean continuar=false;
    // El siguiente bloque de código se ejecuta hasta que el jugador haya jugado una carta válida o haya pasado su turno.
    while(continuar==false){
        // Se muestra la carta que está en la mesa y la mano actual del jugador.
        while(num==0 || num>cartas.size()){
            System.out.println("CARTA EN MESA: "+mesa.toString());
            MostrarMano();
            System.out.print("Carta a jugar (ingrese la posicion de la carta) (intenta jugar cualquier carta sin pensar para tomar una carta o continuar turno): ");
            num=aux.getNum(num);
            if(num==0 || num>cartas.size()){
                System.out.println("Solo juega cartas disponibles");
            }
        }
        // Se disminuye en 1 el número de la carta elegida para jugar.
        num--;
        // Se toma la carta seleccionada de la mano del jugador.
        cartaAux=cartas.get(num);
        // Se verifica si la carta puede ser jugada y se actualiza la carta en la mesa y se rompe el ciclo.
       if(cartaAux.getColor()==mesa.getColor()){
    // Si la carta elegida tiene el mismo color que la carta en la mesa, la carta se puede jugar
    mesa=cartaAux;
    continuar=true;
    break;
}
else if(cartaAux.getColor()!=mesa.getColor() && cartaAux.getValor()==mesa.getValor()){
    // Si la carta elegida no tiene el mismo color que la carta en la mesa, pero tiene el mismo número/valor, la carta se puede jugar
    mesa=cartaAux;
    continuar=true;
    break;
}
else if(cartaAux.getColor()!=mesa.getColor() && cartaAux.getValor()!=mesa.getValor() && cartaAux.getColor()=="Comodin" ){
    // Si la carta elegida no tiene el mismo color o valor que la carta en la mesa, pero es un comodín, la carta se puede jugar
    mesa=cartaAux;
    continuar=true;
    break; 
}

        // Si no se puede jugar la carta, se le da al jugador la opción de seguir tomando cartas de la baraja hasta que tenga una carta que pueda jugar.
        else if(continuar!=true){
            // Si el contador es 0, se toma una carta de la baraja y se agrega a la mano del jugador.
            if(contador==0){
                cartas.add(baraja.tomarCarta());
            }
            contador++;
        }
        // Si el jugador ya tomó 2 cartas, se rompe el ciclo.
        if(contador==2){
            break;
        }
    }
    // Si el jugador jugó una carta válida, se elimina de su mano.
    if(continuar==true){
        cartas.remove(num);
    }
    return mesa;
}

    //----------------------//
   public int UNO(){
    // Verificar si el jugador tiene solo una carta en su mano
    if(cartas.size()==1){
        // Devolver 1 si el jugador tiene una sola carta, lo que significa que debe decir "UNO"
        return 1;
    }
    else{
        // Devolver 2 si el jugador tiene más de una carta en su mano, lo que significa que no tiene que decir "UNO"
        return 2;
    }
}

}
