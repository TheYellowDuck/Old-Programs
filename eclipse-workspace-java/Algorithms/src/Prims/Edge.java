package Prims;

public class Edge {
	
	Node N1, N2;
	int weight = 0;
	
	Edge (Node N1, Node N2, int weight) {
		this.N1 = N1;
		this.N2 = N2;
		this.weight = weight;
	}
	
	Node getConnected(Node N) {
		return N == N1 ? N2 : N1;
	}

}
