package eva3_practica20_escribir;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.System.Logger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Eva3_Practica20_Escribir {

   
    public static void main(String[] args) {
       Path ruta = Paths.get("c:/archivos/ExperimentoX.txt");
       OutputStream abrirArch;
       OutputStreamWriter escribirArch;
       BufferedWriter escribirTexto;
       
       try{
           abrirArch = Files.newOutputStream(ruta);
           escribirArch = new OutputStreamWriter(abrirArch);
           escribirTexto = new BufferedWriter(escribirArch);
           escribirTexto.write("XXXXXXXXXXXXX");
           escribirTexto.newLine();
           escribirTexto.flush();
           escribirTexto.close();
       }catch(IOException ex){
          ex.printStackTrace();
           
       }
    }
    
}
