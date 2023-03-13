//----------------------//
package Clases;
//----------------------//
//--DECLARACION DE LA CLASE CARTA--//
public class Carta {
    //----------------------//
    //--ATRIBUTOS--//
    private String valor;
    private String color;
    //----------------------//
    //--METODOS--//
    
    /**
     * Crea una nueva instancia de Carta con el valor y color dados.
     * @param valor El valor de la carta (por ejemplo, "2", "Reversa").
     * @param color El color de la carta (por ejemplo, "Rojo", "Azul").
     */
    public Carta(String valor, String color){ 
        this.valor=valor;
        this.color=color;
    }
    
    /**
     * Obtiene el valor de la carta.
     * @return El valor de la carta.
     */
    public String getValor(){ 
        return valor;
    }
    
    /**
     * Obtiene el color de la carta.
     * @return El color de la carta.
     */
    public String getColor(){ 
        return color;
    }

    /**
     * Establece el color de la carta.
     * @param color El nuevo color de la carta.
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * Retorna una cadena que describe la carta en términos de su valor y color.
     * @return La descripción de la carta.
     */
    @Override
    public String toString(){ 
        return color + " " + valor;
    }
    //----------------------//
}
