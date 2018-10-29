package uebung.kapitel4;

public class GgtRekursiv {

    public static void main(String[] args) {

        System.out.println("Der GGT ist "  + ggt(168, 256));

    }

    static int ggt(int x, int y){
        if(x > y){
            x -= y;
        }else{
            y -= x;
        }

        if(x != y){
            return ggt(x, y);
        }

        return x;
    }

}
