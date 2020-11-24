package pe.edu.upeu.edchp.utils;

import pe.edu.upeu.edchp.examen.resoluccionexamen;

public class Menu {
    public static void MenuOpt(leerteclado teclado) {
        int numberOption;
        resoluccionexamen examen = new resoluccionexamen();

        System.out.println(
                "Selecciones la opcion que mas desee :\n[1] Ejercicio 1 EDCHP\n[2] Ejercicio 2 EDCHP\n[3] Ejercicio 3 EDCHP\n[4] Ejercicio 4 EDCHP\n[0] finalizar\n");
        System.out.print("\n==> ");
        numberOption = teclado.lector(3);

        switch (numberOption) {
            case 1:
                examen.ejercicio1();
                repeatCicle(teclado);
                break;
            case 2:
                examen.ejercicio2();
                repeatCicle(teclado);
                break;
            case 3:
                examen.ejercicio3();
                repeatCicle(teclado);
                break;
            case 4:
                int n, e;
                System.out.println("Dame el valor numerico de la base: ");
                n = teclado.lector(0);
                System.out.println("Dame un valor numerico del exponente: ");
                e = teclado.lector(0);

                System.out.println(examen.ejercicio4(n, e));
                repeatCicle(teclado);
                break;
            case 0:
                System.out.println("!Hasta la proxima¡");
                break;
            default:
                System.out.println("lo siento no existe ese valor....");
                repeatCicle(teclado);

        }
    }

    public static void repeatCicle(leerteclado teclado) {
        int numberOption;
        System.out.print("\n\n¿Deseas volver al Menú?: \n[1] SI \n[2] NO \n\n==> ");
        numberOption = teclado.lector(3);

        if (numberOption == 1) {
            MenuOpt(null);
        } else if (numberOption == 2) {
            System.out.println("\nHasta la proxima");
        } else {
            System.out.println("\nlo sentimos no existen esas Opciones....");
            repeatCicle(null);
        }
    }
}