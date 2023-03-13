//----------------------//
package Clases;
//----------------------//
//--IMPORTACIONES--//

//----------------------//
//--DECLARACION DE LA CLASE INTERFAZ--//
public class Interfaz {
    //----------------------//
    //--ATRIBUTOS--//
    private int opc;
    private RecibirNum num;
    //----------------------//
    //--METODOS--//
    public Interfaz(){ //->CONSTRUCTOR
        opc=1;
        num= new RecibirNum();
    }
    //----------------------//
    public void ImprimirMenu(){ //->IMPRIMIR MENU
         
        while (opc != 4) {  
            System.out.println("=== MENU ===");
            System.out.println("1. JUGAR");  //OPCION PARA INICIAR PARTIDA
            System.out.println("2. AYUDA");  //OPCION PARA VER LAS REGLAS
            System.out.println("3. ACERCA DE"); //OPCION PARA VER INFORMACION
            System.out.println("4. SALIR");     //OPCION´PARA SALIR
            System.out.print("Opc: ");
            opc=num.getNum(opc);
            switch(opc){
                case 1 : Opc1();
                case 2 : Opc2();
                case 3 : Opc3();
                case 4 : Opc4();
                default : OpcDefault();
            }
         }
    }
    //----------------------//
    public void Opc1(){ //-> INICIAR PARTIDA (OPC 1)
       Partida partida= new Partida();
       partida.Iniciar();
    }
    //----------------------//
    public void Opc2(){ //-> IMPRIMIR REGLAS (OPC 2)
        Ayuda ayuda= new Ayuda();
        ayuda.Imprimir();
    }
    //----------------------//
    public void Opc3(){ //-> IMPRIMIR DATOS DEL JUEGO (OPC 3)
        AcercaDe acerca= new AcercaDe();
        acerca.Imprimir();
    }
    //----------------------//
    public void Opc4(){ //-> SALIR (OPC 4)
        System.out.println("Adios :)");
    }
    //----------------------//
    public void OpcDefault(){ //-> AL INGRESAR OPCION INVALIDA
        System.out.println("Su opcion ingresada es invalida");
        System.out.println("Vuelva a intentarlo");
    }
}
//----------------------//
