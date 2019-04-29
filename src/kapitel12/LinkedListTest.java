package kapitel12;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();

        names.add("Gabi");
        names.add("Franz");
        names.add("Michael");
        names.add("Gabi");
        names.add("Zeus");

        System.out.println("Anzahl Name: " + names.size());

        names.remove("Gabi");
        names.remove("Franz");
        names.remove("Hugo");

        System.out.println("Anzahl Name: " + names.size());
    }
}
