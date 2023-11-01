package org.midominio.behavioral.templatemethod2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

//Concrete class
public class PDFDataMiner extends DataMiner{
    @Override
    File openFile(String path) {
        //Usar librería pdf
        File file = new File(path); //simulacion con archivo txt
        return file;
    }

    @Override
    String extractData(File file) {
        StringBuilder rawData = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String out = in.readLine();
            while(out != null){
                rawData.append(out).append("\n");
                out = in.readLine();
            }
            in.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        System.out.println("Data extraída");
        return rawData.toString();
    }

    @Override
    Map parseData(String rawData) {
        Map<String, String> dataJson = new HashMap();
        if(rawData != null){
            //logica para separar data
            dataJson.put("info", rawData);
        }
        System.out.println("Data parseada a formato json");
        return dataJson;
    }

    @Override
    void closeFile(File file) {
        System.out.println("Archivo: "+ file.getName() + " cerrado");
    }
}
