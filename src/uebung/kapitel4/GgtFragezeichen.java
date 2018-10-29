package uebung.kapitel4;

public class GgtFragezeichen {

    public static void main(String[] args) {
        int x = 168;
        int y = 256;

        while (y != x){
            int test = (x > y) ? (x = x - y) : (y-=x);
        }

        System.out.println("Der GGT ist " + x);

    }

}
