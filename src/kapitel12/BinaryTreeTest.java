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

    }
}
