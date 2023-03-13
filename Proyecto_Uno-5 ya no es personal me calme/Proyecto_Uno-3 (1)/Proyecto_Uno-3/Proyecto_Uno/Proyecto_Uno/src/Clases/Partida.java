//----------------------//
package Clases;
//----------------------//
//--IMPORTACIONES--//
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

//----------------------//
//--DECLARACION DE LA CLASE PARTIDA--//
public class Partida {
    //----------------------//
    //--ATRIBUTOS--//
    private int numJugadores;
    private RecibirNum num;
    static private List<Jugador> jugadores;
    private Baraja baraja;
    private Carta mesa;
    private Jugador jugadorAux;
    //----------------------//
    //--METODOS--//
    public Partida(){
        numJugadores=1;
        num= new RecibirNum();
        mesa= new Carta(" ", " ");
        jugadores= new ArrayList<>();
        baraja = new Baraja();
    }
    //----------------------//
    public void setNumjugadores(){ //-> INGRESAR EL NUMERO DE JUGADORES
        System.out.println("Por favor ingrese el numero de jugadores: ");
        System.out.println("<Tenga en cuenta de que el rango entre 2 y 10>");
        System.out.println("<El programa no avanzara hasta que ingrese una opcion valida>");
        System.out.print("Num JUGADORES: ");
        do{
            numJugadores=num.getNum(numJugadores);
            if(numJugadores<2 || numJugadores>10){
                System.out.println("INGRESO OPCION INVALIDA!");
                System.out.println("<Tenga en cuenta de que el rango entre 2 y 10>");
                System.out.print("Num JUGADORES: ");
            }
        }while(numJugadores<2 || numJugadores>10);
        
    }
    //----------------------//
    public void ColocarCartaEnMesa(){
        boolean continuar=false;
        while(continuar==false){
            mesa = baraja.tomarCarta();
            if(mesa.getValor()=="Saltar" || mesa.getValor()=="Reversa" || mesa.getValor()=="Toma 2"
                    || mesa.getValor()=="Toma 4" || mesa.getValor()=="Cambio Color"){
                baraja.agregarCarta(mesa);
            }
            else{
                continuar=true;
            }
        }
    }
    //----------------------//
    public void DarCartasJugadores(){
        int i;
        String nombre[]={"Carlos","Juan,", "Richard", "Dubraska", "Rocco", "Julio", "Jesus", "Abrahan", "Daniel", "Luis"};
        for(i=0; i<numJugadores; i++){
            jugadores.add(new Jugador(nombre[i]));
        }
        
        for(i=0; i<numJugadores; i++){
           jugadorAux= jugadores.remove(i);
           jugadorAux.ManoInicial(baraja, 7);
           jugadores.add(i,jugadorAux);
        }
    }
    //----------------------//
    public void Comenzar(){
        int i = 0;
        boolean continuar=false;
        while(continuar==false){
            for(i=0; i<numJugadores; i++){
                jugadorAux= jugadores.remove(i);
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("TURNO DEL JUGADOR "+jugadorAux.nombre());
                
                mesa=jugadorAux.JugarCarta(mesa, baraja);
                if(jugadorAux.UNO()==1){
                    continuar=true;
                    jugadores.add(i,jugadorAux);
                    break;
                }
                jugadores.add(i,jugadorAux);
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                if(mesa.getValor()=="Saltar" || mesa.getValor()=="Reversa" || mesa.getValor()=="Toma 2" ||
                        mesa.getValor()=="Toma 4" || mesa.getValor()=="Cambio Color"){
                    CartaEspecial especial= new CartaEspecial(mesa.getValor(), mesa.getColor());
                    String aux=especial.getValor();
                    switch(aux){
                           case "Saltar": 
                                        i=especial.Saltar(i); break;
                            case "Reversa":
                                          jugadores=especial.Reversa(jugadores);
                                          i=especial.Saltar(i); break;
                            case "Toma 2":
                                           jugadores=especial.Toma(baraja, jugadores, i, 2);
                                           i=especial.Saltar(i); break;
                            case "Toma 4":
                                           jugadores=especial.Toma(baraja, jugadores, i, 4);
                                           especial.Cambio();
                                           mesa=especial;
                                           i=especial.Saltar(i); break;
                            case "Cambio Color":
                                            especial.Cambio();
                                            mesa=especial; break;
                                                
                        }
                            
                }
                
            }
            
        }
        JOptionPane.showMessageDialog(null, "EL GANADOR ES EL JUGADOR"+i);
    }
    //----------------------//
    public void Iniciar(){ //-> INICIAR LA PARTIDA
        setNumjugadores();
        ColocarCartaEnMesa();
        DarCartasJugadores();
        Comenzar();
        
    }
    //----------------------//
}
