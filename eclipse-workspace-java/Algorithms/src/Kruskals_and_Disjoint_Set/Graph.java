package Kruskals_and_Disjoint_Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Graph {
	
	int nodecount, edgecount;
	HashMap<Integer, Node> nodes;
	ArrayList<Edge> edges;
	sortEdge sortEdge = new sortEdge();
	int Weight = 0;
	
	Graph (int nodecount, int edgecount) {
		this.nodecount = nodecount;
		this.edgecount = edgecount;
		nodes = new HashMap<>(nodecount);
		edges = new ArrayList<>(edgecount);
	}
	
	public void add (int i, Node n) {
		nodes.put(i, n);
	}
	
	public void add (Edge e) {
		edges.add(e);
	}
	
	public void sortEdges () {
		Collections.sort(edges, sortEdge);
	}
	
	class sortEdge implements Comparator<Edge> {
	    public int compare(Edge a, Edge b)
	    {
	        return a.weight - b.weight;
	    }
	}

}
