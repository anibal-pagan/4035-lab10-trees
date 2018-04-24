package testerClasses;

import labUtils.Utils;
import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;

public class TreeTester4 {

	public static void main(String[] args) throws CloneNotSupportedException{ 
		LinkedBinaryTree<Integer> t = Utils.buildExampleTreeAsLinkedBinaryTree(); 
		LinkedBinaryTree<Integer> t2 = t.clone();

		// display content as a tree
		Utils.displayTree("The structure of the tree is: ", t);
		Utils.displayTree("Clone of the tree: " , t2);
		
		// display elements as a list
		Utils.displayTreeElements("The elements of the tree are: ", t);
		
	}

}
