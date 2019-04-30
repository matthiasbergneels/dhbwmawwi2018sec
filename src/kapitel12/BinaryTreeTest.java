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
        System.out.println("In-Order:");
        names.print();

        System.out.println("Pre-Order:");
        names.printPreorder();


        BinaryTree numbers = new BinaryTree();

        numbers.add(50);
        numbers.add(80);
        numbers.add(90);
        numbers.add(30);
        numbers.add(40);
        numbers.add(25);

        System.out.println("Anzahl Zahlen: " + numbers.size());
        System.out.println("In-Order:");
        numbers.print();

        System.out.println("Pre-Order:");
        numbers.printPreorder();


        BinaryTree<String> names2 = names.copyTree(new BinaryTree<String>());
        System.out.println("Anzahl Namen2: " + names2.size());
        System.out.println("In-Order:");
        names2.print();

        System.out.println("Pre-Order:");
        names2.printPreorder();
    }
}
