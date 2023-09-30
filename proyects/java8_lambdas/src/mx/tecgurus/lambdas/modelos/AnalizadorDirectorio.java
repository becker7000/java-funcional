package mx.tecgurus.lambdas.modelos;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AnalizadorDirectorio {

    private String directorio;

    public AnalizadorDirectorio(String directorio) {
        this.directorio = directorio;
    }

    public List<String> obtenerRutasDeArchivos(){

        // Creamos un objeto File
        File carpeta = new File(directorio);
        List<String> rutasDeArchivos = new ArrayList<>();

        // Validamos si es un directorio
        if(carpeta.isDirectory()){

            // Obtenemos la lista de archivos
            File[] archivos = carpeta.listFiles();

            // Guardamos cada una de las rutas en la lista
            for(File file : archivos){
                rutasDeArchivos.add(file.getAbsolutePath());

            }
        }else {
            System.out.println("\n\t Error, directorio no válido");
        }

        return rutasDeArchivos;
    }

}
