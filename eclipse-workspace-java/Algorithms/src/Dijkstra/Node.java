package Dijkstra;

import java.util.HashMap;
import java.util.LinkedList;

public class Node {
	
	int index, cost = Integer.MAX_VALUE;
	boolean visited = false;
	HashMap<Node, Integer> neighbours = new HashMap<>();
	LinkedList<Node> path = new LinkedList<>();
	
	public Node (int index) {
		this.index = index;
	}
	
	public void add(Node n, int weight) {
		neighbours.put(n, weight);
	}

}
