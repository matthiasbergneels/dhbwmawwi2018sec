package kapitel8;

public class RuntimeExceptionExamples {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        try{
            System.out.println("Vor dem Zugriff");
            System.out.println(numbers[5]);
            System.out.println("Nach dem Zugriff");

        }catch(ArrayIndexOutOfBoundsException indexOutOfBoundException){
            System.out.println("Ausnahme!! --> schreiend im Kreis laufen!");
            System.out.println(indexOutOfBoundException.getMessage());

            System.out.println("Bitte korrekten Index angeben!");
        }

        System.out.println("Niemand muss den Systemadministrator anrufen!");


        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }


        int a = 5;
        int b = 0;

        if(b != 0){
            int erg = a / b;
        }else{
            System.out.println("Nicht Chuck Norris!");
        }


    }
}
