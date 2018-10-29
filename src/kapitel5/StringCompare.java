package kapitel5;

public class StringCompare {

    public static void main(String[] args) {

        String hallo = "hallo";

        String hallo2 = new String("hallo");

        //hallo2 = hallo2.toLowerCase();

        if(hallo == hallo2){
            System.out.println(hallo + " ist gleich (==) " + hallo2);
        } else {
            System.out.println(hallo + " ist NICHT gleich (==) " + hallo2);
        }

        if(hallo.equals(hallo2)){
            System.out.println(hallo + " ist gleich (equals) " + hallo2);
        }else{
            System.out.println(hallo + " ist NICHT gleich (==) " + hallo2);
        }


    }
}
