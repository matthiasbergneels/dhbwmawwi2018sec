package kapitel4;

public class LoopExamples {

    public static void main(String[] args) {

        byte counter = 0;

        while(counter < 10){
            if(counter % 5 == 0 && counter != 0){
                System.out.println("Böse Zahl!!! Abbrechen!");
                break;
            }
            System.out.println("Zähle kopfgesteuer... " + counter++);
            //counter++;
        }

        counter = 0;

        do{
            System.out.println("Zähle fußgesteuert... " + counter++);
        }while(counter < 10);



        for(int i = 5; i <= 500; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println("Zähle zählergesteuert... " + i);
        }

    }
}
