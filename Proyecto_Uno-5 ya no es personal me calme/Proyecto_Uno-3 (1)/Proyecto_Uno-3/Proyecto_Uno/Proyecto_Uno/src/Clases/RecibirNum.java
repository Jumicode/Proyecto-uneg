//----------------------//
package Clases;
//----------------------//
//--IMPORTACIONES--//
import java.util.Scanner;
//----------------------//
//--DECLARACION DE LA CLASE RECIBIRNUM--//
/**
 * La clase RecibirNum se utiliza para recibir un número ingresado por el usuario desde el teclado y devolverlo como un entero.
 */
public class RecibirNum {
    //----------------------//
    //--ATRIBUTOS--//
    
    /**
     * La instancia de la clase Scanner utilizada para leer la entrada del usuario.
     */
    private Scanner scanner;
    
    //----------------------//
    //--METODOS--//
    
    /**
     * El constructor de la clase RecibirNum inicializa la instancia de la clase Scanner para leer la entrada del usuario.
     */
    public RecibirNum(){ //-> CONSTRUCTOR
        scanner= new Scanner(System.in);
    }
    
    /**
     * El método getNum se utiliza para recibir un número ingresado por el usuario desde el teclado y devolverlo como un entero.
     *
     * @param num El número ingresado por el usuario.
     * @return El número ingresado por el usuario como un entero.
     */
    public int getNum(int num) { //-> PARA INGRESAR UN NUMERO Y RETORNARLO
        num = scanner.nextInt();  //AQUI RECIBE LA OPCION
        return num;
    }
}

