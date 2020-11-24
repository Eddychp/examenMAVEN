package pe.edu.upeu.edchp;


import pe.edu.upeu.edchp.utils.leerteclado;
import pe.edu.upeu.edchp.utils.Menu;
public class App {

 public static void main(String[] args) {
        leerteclado teclado = new leerteclado();
        Menu menu = new Menu();

        menu.MenuOpt(teclado);


    }
  
}
