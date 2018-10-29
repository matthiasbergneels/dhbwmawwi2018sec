package kapitel3;

public class ArrayExample {

    public static void main(String[] args){

        int[] numberList = {5, 7, 8, 1002, 672, 878};

        System.out.println(numberList[3]);


        String[] myTextBlocks = new String[10];

        myTextBlocks[0] = "Hello";
        myTextBlocks[1] = "Good Morning";
        myTextBlocks[2] = "Good Evening";
        //myTextBlocks[15] = "Shit";

        // Ausgabe in Zählerschleife
        for(int i = 0; i < myTextBlocks.length; i++){
            System.out.println("Index " + i + ": " + myTextBlocks[i]);
        }


        // For-Each
        for(String text : myTextBlocks){
            System.out.println(text);
        }

        // while
        int count = 0;
        while(count < myTextBlocks.length){
            System.out.println("Index " + count + ": " + myTextBlocks[count]);
            count++;
        }


        System.out.println(myTextBlocks[1]);


        int[][] twoDimensionList = new int[5][];

        twoDimensionList[0] = new int[10];
        twoDimensionList[1] = new int[5];
        twoDimensionList[2] = new int[3];
        twoDimensionList[3] = new int[10];
        twoDimensionList[4] = new int[50];


        twoDimensionList[1][2] = 7;

        System.out.println(twoDimensionList.length);
        System.out.println(twoDimensionList[0].length);
        System.out.println(twoDimensionList[2].length);



    }
}
