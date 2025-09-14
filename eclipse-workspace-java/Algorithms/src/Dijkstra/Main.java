package Dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in = br.readLine().split(" ");
		int N = Integer.parseInt(in[0]), M = Integer.parseInt(in[1]);
		Graph graph = new Graph(N, M);
		while (M > 0) {
			in = br.readLine().split(" ");
			int n1 = Integer.parseInt(in[0]), n2 = Integer.parseInt(in[1]), w = Integer.parseInt(in[2]);
			if (graph.nodes.get(n1) == null)
				graph.add(n1, new Node(n1));
			if (graph.nodes.get(n2) == null)
				graph.add(n2, new Node(n2));
			graph.nodes.get(n1).add(graph.nodes.get(n2), w);
			graph.nodes.get(n2).add(graph.nodes.get(n1), w);
			M --;
		}
		Dijkstra(graph, graph.nodes.get(1));
		printGraph(graph);
	}
	
	public static Graph Dijkstra(Graph graph, Node root) {
		HashSet<Node> S = new HashSet<>();
		S.add(root);
		root.cost = 0;
		while (!S.isEmpty()) {
			Node N = LowestCostNode(S);
			S.remove(N);
			N.visited = true;
			for (Entry<Node, Integer> i : N.neighbours.entrySet()) {
				Node n = i.getKey();
				int w = i.getValue();
				if (!n.visited) {
					CalculateMinDistance(n, w, N);
					S.add(n);
				}
			}
		}
		return graph;
	}
	
	public static Node LowestCostNode(HashSet<Node> S) {
		Node N = null;
		int W = Integer.MAX_VALUE;
		for (Node n : S) {
			if (n.cost < W) {
				N = n;
				W = n.cost;
			}
		}
		return N;
	}
	
	public static void CalculateMinDistance(Node N, int W, Node root) {
		if (root.cost + W < N.cost) {
			N.cost = root.cost + W;
			N.path = new LinkedList<>(root.path);
			N.path.add(root);
		}
	}
	
	public static void printGraph(Graph graph) {
		for (Node N : graph.nodes.values()) {
			System.out.print(N.index + " " + N.cost);
			for (Node n : N.path) 
				System.out.print(" " + n.index);
			System.out.println();
		}
	}

}
