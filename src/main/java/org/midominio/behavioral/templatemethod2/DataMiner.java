package org.midominio.behavioral.templatemethod2;

import java.io.File;
import java.util.Map;

//Abstract class
public abstract class DataMiner {
    public final void mine(String path){
        File file = openFile(path);
        String rawData = extractData(file);
        Map<String, String > data = parseData(rawData);
        String analysis = analyzeData(data);
        sendReport(analysis);
        closeFile(file);
    }
    abstract File openFile(String path);
    abstract String extractData(File file);
    abstract Map parseData(String rawData);

    public String analyzeData(Map<String, String> data) {
        String info;
        if(!data.isEmpty()){
            info = data.get("info");
            return info;
        }
        return null;
    }
    public void sendReport(String analysis){
        System.out.println("Enviando reporte con la data: ");
        System.out.println(analysis);
    }
    abstract void closeFile(File file);

}
