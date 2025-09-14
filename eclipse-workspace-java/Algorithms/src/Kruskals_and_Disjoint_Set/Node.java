package Kruskals_and_Disjoint_Set;

import java.util.ArrayList;

public class Node {
	
	int id, rank = 0;
	Node root = this;
	ArrayList<Edge> connected = new ArrayList<Edge>();
	
	Node (int id) {
		this.id = id;
	}
	
	void add (Edge E) {
		connected.add(E);
	}

}
