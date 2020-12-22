package pe.edu.upeu.edchp.examen;


import pe.edu.upeu.edchp.utils.leerteclado;
import java.util.Scanner;
public class resoluccionexamen {

        public static leerteclado teclado = new leerteclado();

    public void ejercicio1() {
        int CantAutomoviles, costo = 0, categoria, categoria1 = 0, categoria2 = 0, categoria3 = 0,total=0;
        double impuesto = 0, impuestoAPagar = 0;
       System.out.println(
                "Menu :\n[1]pollo a la brasa:\n[2]pollo al horno\n[3]Mixto de pollo");
  
        System.out.println("cunatos fue su eleccion: ");
        CantAutomoviles = teclado.lector(0);

        for (int i = 1; i <= CantAutomoviles; i++) {
            System.out.println("opcion: " + i);
            System.out.println("Ingrese el numero del menu: ");
            categoria = teclado.lector(0);
            System.out.println("Ingrese el valor dado: ");
            costo = teclado.lector(0);
            if (categoria == 1) {
                impuesto = costo + 0;
                categoria1 = (int) (categoria1 + impuesto);
            }
            if (categoria == 2) {
                impuesto = costo + 0;
                categoria2 = (int) (categoria2 + impuesto);
            }
            if (categoria == 3) {
                impuesto = costo + 0;
                categoria3 = (int) (categoria3 + impuesto);
            }
            if (total==0){
                total=categoria1+categoria2+categoria3;
            }
                 System.out.println(
                "----------------voleta de veta-------------");
            String nom= null;
            Scanner nombre=new Scanner(System.in);
            System.out.println("Ingresa tu nombre");
            nom=nombre.nextLine();

        }
              
       
        System.out.println("pollo a la bzasa : " + categoria1);
        System.out.println("pollo al horno : " + categoria2);
        System.out.println("pollo mixto : " + categoria3);
        System.out.println("total a pagr es : " + total);
    }
}