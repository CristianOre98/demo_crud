
package demo_crud;

import java.sql.SQLException;
import java.util.Scanner;

public class MenuPrincipal {
      public static void main(String[] args) throws SQLException {
        desplegarMenu();
    }
        public static void desplegarMenu() throws SQLException{
        Scanner opcionSeleccionada = new Scanner(System.in);
        String opcionMenu;
        //menu a deplegar
        System.out.println("************");
        System.out.println("|     REGISTRO DE ESTUDIANTE     |");
        System.out.println("************");
        System.out.println("| Opciones:                      |");
        System.out.println("|          1. Crear registro     |");
        System.out.println("|          2. Consultar registro |");
        System.out.println("|          3. Actualizar registro|");
        System.out.println("|          4. Eliminar registro  |");
        System.out.println("|          5. Salir              |");
        System.out.println("************");
        System.out.println("Seleccionar opción: ");
        opcionMenu = opcionSeleccionada.next();
}
