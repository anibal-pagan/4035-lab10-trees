package labUtils;

import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;
import treeInterfaces.Tree;

public class Utils {
	public static <E> void displayTree(String msg, Tree<E> t) { 
		System.out.println("\n\n" + msg); 
		t.display(); 
	}

	public static <E> void displayTreeElements(String msg, Tree<E> t) {
		System.out.println("\n\n" + msg); 
		for (E element : t)
			System.out.println(element); 
		
	}
	
	public static LinkedTree<Integer> buildExampleTreeAsLinkedTree() { 
		LinkedTree<Integer> t = new LinkedTree<>(); 
		// ADD CODE AS SPECIFIED IN EXERCISE 1
		t.addRoot(4);
		Position<Integer> p = t.addChild(t.root(), 9);
		t.addChild(p, 7);
		t.addChild(p, 10);
		p = t.addChild(t.root(), 20);
		p = t.addChild(p, 15);
		t.addChild(p, 12);
		p = t.addChild(p, 17);
		t.addChild(p, 19);
		p = t.parent(t.parent(p));
		p = t.addChild(p, 21);
		p = t.addChild(p, 40);
		t.addChild(p, 30);
		t.addChild(p, 45);
		
		return t; 
	}
	
	public static LinkedBinaryTree<Integer> buildExampleTreeAsLinkedBinaryTree() { 
		LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>(); 
		// ADD CODE AS SPECIFIED IN EXERCISE 2
		t.addRoot(4);
		Position<Integer> p = t.addLeft(t.root(), 9);
		t.addLeft(p, 7);
		t.addRight(p, 10);
		p = t.addRight(t.root(), 20);
		p = t.addLeft(p, 15);
		t.addLeft(p, 12);
		p = t.addRight(p, 17);
		t.addLeft(p, 19);
		p = t.parent(t.parent(p));
		p = t.addRight(p, 21);
		p = t.addLeft(p, 40);
		t.addLeft(p, 30);
		t.addRight(p, 45);
		
		return t; 
	}


}
