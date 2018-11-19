package kapitel6;

public class Bauernhof {

    public static void main(String[] args) {

    /*
        Tier meinTier = new Tier(15.0f, 23.0f, "Karl");

        meinTier.atmen();
        meinTier.bewegen();
        meinTier.fressen();
    */



        Hund meinBello = new Hund(30.0f, 15.0f, "Bello", "Pitbull");
        Hund deinWuffi = new Hund(99.0f, 70.0f, "Wuffi", "Deutsche Dogge");

        meinBello.bellen();
        meinBello.fressen();
        meinBello.bewegen();
        meinBello.atmen();


        //System.out.println(meinTier);
        System.out.println(meinBello);
        System.out.println(deinWuffi);


        Tier[] tierBoxen = new Tier[5];

        // Narrowing Cast
        tierBoxen[0] = meinBello;
        tierBoxen[1] = deinWuffi;

        tierBoxen[0].fressen();
        tierBoxen[0].bewegen();
        tierBoxen[0].atmen();
        // tierBoxen[0].bellen();

        tierBoxen[1].fressen();
        tierBoxen[1].bewegen();
        tierBoxen[1].atmen();


        Hund meinHund = (Hund) tierBoxen[0];
        meinHund.bellen();

    }
}
