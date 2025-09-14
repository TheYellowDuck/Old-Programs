package Prims;

import java.util.ArrayList;

public class Node {
	
	int id, weight = Integer.MAX_VALUE;
	boolean visited = false;
	ArrayList<Edge> connected = new ArrayList<Edge>();
	
	Node (int id) {
		this.id = id;
	}
	
	void add (Edge E) {
		connected.add(E);
	}

}
