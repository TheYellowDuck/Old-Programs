package Kruskals_and_Disjoint_Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
			Node N1 = graph.nodes.get(n1), N2 = graph.nodes.get(n2);
			Edge E = new Edge(N1, N2, w);
			graph.add(E);
			N1.add(E);
			N2.add(E);
			M --;
		}
		Kruskals(graph);
		printGraph(graph);
	}
	
	static void Kruskals (Graph graph) {
		graph.sortEdges();
		int c = 0;
		for (int i = 0; i < graph.edgecount; i ++) {
			Edge e = graph.edges.get(i);
			Node N1 = e.N1, N2 = e.N2;
			boolean b = false;
			if (c != graph.nodecount - 1)
				b = join(e);
			if (b) {
				c++; 
				graph.Weight += e.weight;
			}
			else {
				N1.connected.remove(e);
				N2.connected.remove(e);
				graph.edgecount --;
				graph.edges.remove(i);
				i --;
			}
		}
	}
	
	static Node findRoot (Node n) {
		if (n.root == n) return n;
		n.root = findRoot(n.root);
		return n.root;
	}
	
	static boolean join (Edge E) {
		Node R1 = findRoot(E.N1), R2 = findRoot(E.N2);
		if (R1 == R2) return false;
		if (R1.rank == R2.rank) {
			R2.root = R1;
			R1.rank ++;
		}
		else if (R1.rank > R2.rank) R2.root = R1;
		else R1.root = R2;
		return true;
	}
	
	static void printGraph (Graph graph) {
		System.out.println(graph.Weight);
		for (Edge E : graph.edges) 
			System.out.println(E.N1.id + " " + E.N2.id + " " + E.weight);
	}

}
