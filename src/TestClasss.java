import java.util.Random;

public class TestClasss {
    public static void main(String[] args) {
        BacktrackingAVL tree = new BacktrackingAVL();
        for (int i = 0; i<10; i++){
            Random rand = new Random();
            tree.insert(rand.nextInt(100));
        }

        System.out.println("________original_tree_____________");
        tree.printTree();

        for (int i = 0; i<10; i++){
            System.out.println("________after " + i+1 + " backtrack___");
            tree.Backtrack();
            tree.printTree();
        }



    }
}
