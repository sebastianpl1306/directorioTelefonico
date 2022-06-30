/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author sebas
 */
public class ConnectionDB {
    public Connection cadena_conexion(){
        //Permite almacenar la conección
        Connection cn = null;

        //Obtener los errores si llega a fallar la conexión
        try{
            //obtener el driver de JDBC de sql server
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            //Realizar el string de conexión a la base de datos
            cn = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=directorio;user=sa;password=12345;encrypt=true;trustServerCertificate=true");

            System.out.println("Se conecto Correctamente");
        }catch (Exception e){
            //Si se genera algun error lo capturamos y mostramos en pantalla
            System.out.println(e);
        }
        return cn;
    }
}
