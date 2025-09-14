package Tarjans_Lowlink;

import java.util.ArrayList;

public class Node {
	
	int index, time = -1;
	ArrayList<Node> neighbours = new ArrayList<>();
	Node back = this;
	
	public Node (int index) {
		this.index = index;
	}
	
	public void add(Node n) {
		neighbours.add(n);
	}

}
