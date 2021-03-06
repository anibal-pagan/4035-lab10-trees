package treeClasses;

import treeInterfaces.Position;

public class LinkedBinaryTree2<E extends Comparable<E>> extends LinkedBinaryTree<E> {
	
	public void insert(E e) { 
		if (isEmpty())
			addRoot(e); 
		else
			recInsert(root(), e); 
	}

	//Now in decreasing order
	private void recInsert(Position<E> r, E e) {
		int c = e.compareTo(r.getElement()); 
		if (c < 0) 
			if (!hasRight(r))
				addRight(r, e); 
			else 
				recInsert(right(r), e); 
		else 
			if (!hasLeft(r))
				addLeft(r, e); 
			else 
				recInsert(left(r), e); 
	}

}