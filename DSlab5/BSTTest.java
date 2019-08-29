public class BSTTest
{
    public static void main(String[] args) {

		BinarySearchTree theTree = new BinarySearchTree();
                BinarySearchTree theTree2 = new BinarySearchTree();
                
                theTree.insert(15);
                theTree.insert(14);
                theTree.insert(13);
                theTree.insert(12);
                theTree.insert(11);
                theTree.insert(10);
                theTree.insert(9);
                theTree.insert(8);
                theTree.insert(7);
		theTree.insert(6);
		theTree.insert(5);
		theTree.insert(4);
		theTree.insert(3);
		theTree.insert(2);
		theTree.insert(1);

                theTree.inOrderTraversal(theTree.root);
		// Different ways to traverse binary trees

		// theTree.inOrderTraversal(theTree.root);

		// theTree.preorderTraverseTree(theTree.root);

		// theTree.postOrderTraverseTree(theTree.root);

		// Find the node with key 75

		System.out.println("\nNode with the key 1");
                long startTime =System.currentTimeMillis();
                for ( int k = 1; k <= 100000; k++ )
                {
                   theTree.search(1);
                }
                long endTime = System.currentTimeMillis();
                 long searchTime = endTime - startTime;
                System.out.println(  searchTime );
                
                System.out.println("\nNode with the key 15");
                startTime =System.currentTimeMillis();
                for ( int k = 1; k <= 100000; k++ )
                {
                   theTree.search(15);
                }
                endTime = System.currentTimeMillis();
                searchTime = endTime - startTime;
                System.out.println(  searchTime );
                
                System.out.println("\nRemove Key 5\n");
                theTree.remove(5);
                theTree.inOrderTraversal(theTree.root);
                
                System.out.println("\nRemove Key 15\n");
                theTree.remove(15);
                theTree.inOrderTraversal(theTree.root);
                
                System.out.println("\nRemove Key 1\n");
                theTree.remove(1);
                theTree.inOrderTraversal(theTree.root);
 
                System.out.println("\nInsert Key 2\n");
                theTree.insert(2);
                theTree.inOrderTraversal(theTree.root);
                
                System.out.println();
                theTree2.insert(15);
                theTree2.insert(13);
                theTree2.insert(11);
                theTree2.insert(9);
                theTree2.insert(7);
                theTree2.insert(5);
                theTree2.insert(3);
                theTree2.insert(1);
                theTree2.insert(14);
		theTree2.insert(10);
		theTree2.insert(6);
		theTree2.insert(2);
		theTree2.insert(12);
		theTree2.insert(4);
		theTree2.insert(8);
                theTree2.inOrderTraversal(theTree2.root);
                
                System.out.println("\nNode with the key 1");
                startTime =System.currentTimeMillis();
                for ( int k = 1; k <= 100000; k++ )
                {
                   theTree.search(1);
                }
                endTime = System.currentTimeMillis();
                searchTime = endTime - startTime;
                System.out.println(  searchTime );
                
                System.out.println("\nNode with the key 15");
                startTime =System.currentTimeMillis();
                for ( int k = 1; k <= 100000; k++ )
                {
                   theTree.search(15);
                }
                endTime = System.currentTimeMillis();
                searchTime = endTime - startTime;
                System.out.println(  searchTime );
                
                System.out.println("\nRemove Key 8\n");
                theTree.remove(8);
                theTree.inOrderTraversal(theTree.root);
                //System.out.println(theTree.search(25));

                //theTree.inOrderTraversal(theTree.root);

}
}