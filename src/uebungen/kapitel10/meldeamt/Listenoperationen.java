package uebungen.kapitel10.meldeamt;

import java.io.*;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Listenoperationen {

    private static final String FILENAME = "EinwohnerListe.txt";
    private static final String FILENAME_SERIALIZE = "EinwohnerListe.dat";
    private static TreeSet<Einwohner> liste = new TreeSet<Einwohner>();

    private static Einwohner ermittleObjekt(String name, String vorname){
        Einwohner e = null;

        Iterator<Einwohner> i = liste.iterator();
        while(i.hasNext()){
            e = i.next();
            if((name.equals(e.getName()) &&
                    vorname.equals(e.getVorname()))){
                return e;
            }
        }

        return null;
    }

    public static boolean hinzufuegen(String name, String vorname, String gebName, String email, String anrede, String familienstand){
        Einwohner e = new Einwohner(name, vorname, gebName, email, anrede, familienstand);
        boolean erg = liste.add(e);
        return erg;
    }

    public static boolean anzeigen(String name, String vorname){

        Einwohner e = ermittleObjekt(name, vorname);

        if(e == null){
            return false;
        }else{
            System.out.println(e);
            return true;
        }
    }

    public static boolean suchen(String name, String vorname){

        Einwohner e = ermittleObjekt(name, vorname);

        if(e == null){
            return false;
        }else{
            return true;
        }
    }

    public static boolean loeschen(String name, String vorname){
        Einwohner e = ermittleObjekt(name, vorname);

        if(e == null){
            return false;
        }else{
            liste.remove(e);
            return true;
        }
    }

    public static void listeAusgeben(){
        if(liste.size() > 0){

            Einwohner e = null;

            System.out.println("Einwohner:");

            Iterator<Einwohner> i = liste.iterator();
            while(i.hasNext()){
                System.out.println(i.next());

            }
        }else{
            System.out.println("Die Liste ist leer!");
        }
    }

    public static void persistSetToFile()  {

        File einwohnerFile = new File(FILENAME);

        if(!einwohnerFile.exists()){
            try {
                einwohnerFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (FileWriter einwohnerFileWriter = new FileWriter(einwohnerFile, false)) {

            for(Einwohner einwohner : liste){
                String einwohnerAsText = einwohner.getName() + ";";
                einwohnerAsText = einwohnerAsText + einwohner.getVorname() + ";";
                einwohnerAsText = einwohnerAsText + einwohner.getGebName() + ";";
                einwohnerAsText = einwohnerAsText + einwohner.getAnrede() + ";";
                einwohnerAsText = einwohnerAsText + einwohner.getEmail() + ";";
                einwohnerAsText = einwohnerAsText + einwohner.getFamilienstand() + ";";
                einwohnerAsText = einwohnerAsText + einwohner.hashCode() + "\n";

                einwohnerFileWriter.write(einwohnerAsText);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void persistSewrializedSetToFile()  {

        File einwohnerFile = new File(FILENAME_SERIALIZE);

        if(!einwohnerFile.exists()){
            try {
                einwohnerFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (FileOutputStream einwohnerOutputStream = new FileOutputStream(einwohnerFile);
            ObjectOutputStream einwohnerSetObjectOutputStream = new ObjectOutputStream(einwohnerOutputStream)) {

            einwohnerSetObjectOutputStream.writeObject(liste);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void readSetFromFile(){
        File einwohnerFile = new File(FILENAME);

        if(einwohnerFile.exists()){

            try(FileReader einwohnerFileReader = new FileReader(einwohnerFile);
                BufferedReader bufferedEinwohnerReader = new BufferedReader(einwohnerFileReader)){

                String line;
                while((line = bufferedEinwohnerReader.readLine()) != null){
                    String[] einwohnerParts = line.split(";");
                    Einwohner einwohner = new Einwohner(einwohnerParts[0],
                                                        einwohnerParts[1],
                                                        einwohnerParts[2],
                                                        einwohnerParts[4],
                                                        einwohnerParts[3],
                                                        einwohnerParts[5]);

                    if(einwohner.hashCode() == Integer.parseInt(einwohnerParts[6])){
                        liste.add(einwohner);
                    }
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    public static void readSerializedSetFromFile(){
        File einwohnerFile = new File(FILENAME_SERIALIZE);

        if(einwohnerFile.exists()){
            try(FileInputStream einwohnerInputStream = new FileInputStream(einwohnerFile);
                    ObjectInputStream einwohnerSetStream = new ObjectInputStream(einwohnerInputStream)){

                liste = (TreeSet<Einwohner>)einwohnerSetStream.readObject();


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }

    }
}