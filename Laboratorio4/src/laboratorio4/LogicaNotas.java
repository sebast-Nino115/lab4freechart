
package laboratorio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class LogicaNotas {
        private File archivo;
    
    LogicaNotas(String path){
        this.archivo=new File(path);
    }
    //creo la lista 
    public List<Estructura> crearListado() throws FileNotFoundException{
         List<Estructura> listadoFinal = new ArrayList<>();
         //se introduce el archivo para leer
        try (Scanner scanner = new Scanner(this.archivo);) {
            // se hace una lectura fila por fila
            while (scanner.hasNextLine()) {
                List<String> record=getRecordFromLine(scanner.nextLine()); //
                Estructura dato=new Estructura();
                // extraer los datos de mi tabla en una lista 
                dato.Nombre=record.get(0);
                for (int i = 0; i < record.size(); i++) {
                    dato.Nota.add(record.get(i));
                }
                //agregar datos a la lista
                listadoFinal.add(dato);
            }
        }
        return listadoFinal;
    }
    //retornando 
      private List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<String>();
        // leer las columnas
        try (Scanner rowScanner = new Scanner(line)) {
            // limitadoras determinando las columnas
            rowScanner.useDelimiter(";");
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }
}
