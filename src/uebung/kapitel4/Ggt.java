package uebung.kapitel4;

public class Ggt {

    public static void main(String[] args) {

        int x = 256;
        int y = 256;

        while (y != x){
            if(x > y){
                x = x - y;
            }else{
                y = y - x;
            }


        }

        System.out.println("Der GGT ist " + x);

    }

}
