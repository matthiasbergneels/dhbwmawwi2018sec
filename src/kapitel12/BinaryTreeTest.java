package kapitel12;

public class BinaryTreeTest {

    public static void main(String[] args) {

        BinaryTree<String> names = new BinaryTree<String>();

        names.add("Michael");
        names.add("Gabi");
        names.add("Franz");
        names.add("Zeus");
        names.add("Franz");

        System.out.println("Anzahl Namen: " + names.size());
        names.print();


        BinaryTree numbers = new BinaryTree();

        numbers.add(50);
        numbers.add(80);
        numbers.add(90);
        numbers.add(30);
        numbers.add(40);
        numbers.add(25);

        System.out.println("Anzahl Zahlen: " + numbers.size());
        numbers.print();
    }
}
