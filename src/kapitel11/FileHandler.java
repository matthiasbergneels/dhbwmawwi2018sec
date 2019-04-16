package kapitel11;

import java.io.*;
import java.util.Map;
import java.util.Set;

public class FileHandler {
    public static void main(String[] args) {
        /*
        Map systemProperties = System.getProperties();

        Set systemPropertyKeys = systemProperties.keySet();

        for(Object key : systemPropertyKeys){
            System.out.println(key + ": " + systemProperties.get(key));
        }
        */


        File myFile = new File("MeineTextDatei.txt");

        if(!myFile.exists()){
            try {
                myFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        try (FileWriter myTextFileWriter = new FileWriter(myFile, false)) {

            myTextFileWriter.write("Text1 \n");
            myTextFileWriter.write("Text2 \n");
            myTextFileWriter.write("Text3 \n");
            myTextFileWriter.write("Text4 \n");

        } catch (IOException e) {
            e.printStackTrace();
        }


        try (FileReader myTextFileReader = new FileReader(myFile);
             BufferedReader myTextFileBufferedReader = new BufferedReader(myTextFileReader)){

            String line;
            while((line = myTextFileBufferedReader.readLine()) != null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
