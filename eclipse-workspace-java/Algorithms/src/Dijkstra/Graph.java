package Dijkstra;

import java.util.HashMap;

public class Graph {
	
	int nodecount, edgecount;
	HashMap<Integer, Node> nodes;
	
	Graph(int nodecount, int edgecount) {
		this.nodecount = nodecount;
		this.edgecount = edgecount;
		nodes = new HashMap<>(nodecount);
	}
	
	public void add(int i, Node n) {
		nodes.put(i, n);
	}

}
