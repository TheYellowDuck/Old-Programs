package Tarjans_Lowlink;

import java.util.HashMap;
import java.util.HashSet;

public class Graph {
	
	int nodecount, edgecount;
	HashMap<Integer, Node> nodes;
	HashSet<Node> incall = new HashSet<>();
	
	Graph(int nodecount, int edgecount) {
		this.nodecount = nodecount;
		this.edgecount = edgecount;
		nodes = new HashMap<>(nodecount);
	}
	
	public void add(int i, Node n) {
		nodes.put(i, n);
	}

}
