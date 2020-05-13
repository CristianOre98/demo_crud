package demo_crud;

import java.sql.SQLException;
import java.util.Scanner;


public class Delete {
    
     Delete () throws SQLException{
        Scanner leer = new Scanner(System.in);
        ConexionCRUD utilerias = new ConexionCRUD();
        System.out.println("<< ELIMINAR REGISTRO >>");
        
        System.out.println("Ingrese el id del registro");
        String idEstudianteEliminar = leer.next();
        //reingreso de datos para actualizar
        String tabla ="tb_estudiante ";
        String campos = "*";
        String condicion = "id_estudiante = "+idEstudianteEliminar;
        utilerias.desplegarRegistros(tabla, campos, condicion);
    
    
}
