package properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;

public class PruebaProperties {

    public static void main(String[] args) {
        Properties props = new Properties();
    //Establece las propiedades
        props.setProperty("ruta", "Chile");
        props.setProperty("anchura", "200");

        listarPropiedades(props);
        guardarPropiedades(props);
    }

    public static void listarPropiedades(Properties props) {
        Set<Object> claves = props.keySet(); //Obtiene los nombres de las propiedades

        //imprime los pares clave/valor
        claves.forEach(clave -> {

            System.out.println("props = " + clave + ": " + props.getProperty((String) clave));
        });
    }

    public static void guardarPropiedades(Properties props) {
        //guarda el contenido del objeto properties
        try {
            FileOutputStream salida = new FileOutputStream("props.properties");
            props.store(salida, "Propiedades de ejemplo");
            salida.close();
            listarPropiedades(props);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
