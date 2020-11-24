package pe.edu.upeu.edchp.examen;


import pe.edu.upeu.edchp.utils.leerteclado;
public class resoluccionexamen {

        public static leerteclado teclado = new leerteclado();

    public void ejercicio1() {
        int CantAutomoviles, costo = 0, categoria, categoria1 = 0, categoria2 = 0, categoria3 = 0;
        double impuesto = 0, impuestoAPagar = 0;

        System.out.println("Cuantos automoviles desea: ");
        CantAutomoviles = teclado.lector(0);

        for (int i = 1; i <= CantAutomoviles; i++) {
            System.out.println("Carro: " + i);
            System.out.println("Ingrese la categoria a la que pertenesca: ");
            categoria = teclado.lector(0);
            System.out.println("Ingrese el valor del carro: ");
            costo = teclado.lector(0);
            if (categoria == 1) {
                impuesto = costo * 0.1;
                categoria1 = (int) (categoria1 + impuesto);
            }
            if (categoria == 2) {
                impuesto = costo * 0.07;
                categoria2 = (int) (categoria2 + impuesto);
            }
            if (categoria == 3) {
                impuesto = costo * 0.05;
                categoria3 = (int) (categoria3 + impuesto);
            }

            impuestoAPagar = impuestoAPagar + impuesto;
            System.out.println("Valor del impuesto del carro es:" + i + " = " + impuesto);
            System.out.println(" 0");
        }
        System.out.println("Carros de categoria 1º : " + categoria1);
        System.out.println("Carros de categoria 2º : " + categoria2);
        System.out.println("Carros de categoria 3º : " + categoria3);
        System.out.println("el impuesto a pagar es : " + impuestoAPagar);
    }
 public void ejercicio2() {
        int nPartida, nLlegada, multiplicacion;

        System.out.println("Ingresa el numero de inicio: ");
       
        nPartida = teclado.lector(0);
        System.out.println("Ingresa el numero de final: ");
        nLlegada = teclado.lector(0);

        for (int i = nPartida; i < nLlegada; i++) {
            System.out.println("\nNumero " + i);
            for (int j = 0; j <= 12; j++) {
                multiplicacion = i * j;
                System.out.println(" " + i + " x " + j + " = " + multiplicacion);
            }
        }

    }
public void ejercicio3() {
        int i = 1, suma = 0, numero;
        System.out.println("Introduce el numero que prefiera: ");
        numero = teclado.lector(0);

        while (i < numero) {
            if (numero % i == 0) {
                suma = suma + i;
            }
            i++;
        }

        if (suma == numero) {
            System.out.println("es Perfecto");
        } else {
            System.out.println("No es perfecto");

        }
    }

    public int ejercicio4(int n, int e) {
        if (e <= 0) {
            return 1;
        } else {
            return n * ejercicio4(n, e - 1);
        }
    }
}