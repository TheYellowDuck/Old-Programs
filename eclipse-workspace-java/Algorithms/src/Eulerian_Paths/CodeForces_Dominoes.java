package Eulerian_Paths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CodeForces_Dominoes {
	
	static class Pair {
		int first, second;
		Pair(int first, int second) {
			this.first = first;
			this.second = second;
		}
	}
	
	public static TreeMap<Integer, ArrayList<Pair>>[] graph; // for multiple edges between nodes
	public static ArrayList<Integer> Path = new ArrayList<>(), PathD = new ArrayList<>(), PathV = new ArrayList<>();

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in;
		int M = Integer.parseInt(br.readLine()), repcount = 0;
		graph = (TreeMap<Integer, ArrayList<Pair>>[]) new TreeMap[7];
		ArrayList<Integer>[] repeat = (ArrayList<Integer>[]) new ArrayList[7];
		int[] valid = new int[7];
		for (int i = 1; i <= M; i ++) {
			in = br.readLine().split(" ");
			int n1 = Integer.parseInt(in[0]), n2 = Integer.parseInt(in[1]);
			valid[n1] ++;
			valid[n2] ++;             
			
			if (n1 == n2) {
				if (repeat[n1] == null) repeat[n1] = new ArrayList<>();
				repeat[n1].add(i);
				repcount ++;
				continue;
			}
			
			if (graph[n1] == null) {
				graph[n1] = new TreeMap<>();
			}
			if (graph[n2] == null) {
				graph[n2] = new TreeMap<>();
			}
			
			graph[n1].putIfAbsent(n2, new ArrayList<>());
			graph[n2].putIfAbsent(n1, new ArrayList<>());
			graph[n1].get(n2).add(new Pair(i, 0));
			graph[n2].get(n1).add(new Pair(i, 1));                            // if undirected
		}
		
		int start = valid(valid);
		
		if (start != -1) {
			findCycle(start, -1, 0);
			if (Path.size() - 1 == M - repcount) {
				for (int i = 0; i < Path.size() - 1; i ++) {
					if (repeat[PathV.get(i)] != null) {
						for (int j : repeat[PathV.get(i)]) {
							System.out.println(j + " +");
						}
					}
					System.out.print(Path.get(i) + " ");
					System.out.println(PathD.get(i) == 0 ? "-" : "+");
				}
				if (repeat[PathV.get(PathV.size() - 1)] != null) {
					for (int j : repeat[PathV.get(PathV.size() - 1)]) {
						System.out.println(j + " +");
					}
				}
			}
			else
				System.out.println("No solution");
		}
		else
			System.out.println("No solution");
	}
	
	static int valid(int[] A) {
		int count = 0, v = 0;
		for (int i = 0; i < A.length; i ++) {
			if (count == 0 && v == 0 && A[i] != 0) {
				v = i;
			}
			if (A[i] % 2 != 0) {
				count ++;
				v = i;
			}
		}
		if (count == 0 || count == 2)
			return v;
		return -1;
	}
	
	static void findCycle(Integer cur, int index, int dir) {
		if (graph[cur] != null) {
		while (graph[cur].size() > 0) {
			Entry<Integer, ArrayList<Pair>> to = graph[cur].firstEntry();
			Integer tokey = to.getKey(); int toindex = to.getValue().get(0).first, todir = to.getValue().get(0).second;
			if (to.getValue().size() - 1 == 0) {
				graph[cur].remove(tokey);
				graph[tokey].remove(cur);  // if undirected
			}
			else {
				to.getValue().remove(0);
				for (Pair i : graph[tokey].get(cur)) {
					if (i.first == toindex) {
						graph[tokey].get(cur).remove(i);
						break;
					}
				}
				graph[cur].put(tokey, to.getValue());
			}
			findCycle(to.getKey(), toindex, todir);
		}
		}
		Path.add(index);
		PathD.add(dir);
		PathV.add(cur);
	}

}
