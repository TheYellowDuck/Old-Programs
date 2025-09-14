package BST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		BST bst = new BST (array);
		bst.root.printInOrder();
		System.out.println();
		bst.root.printGraph();
	}

}
