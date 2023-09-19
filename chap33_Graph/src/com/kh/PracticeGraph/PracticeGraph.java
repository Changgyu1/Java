package com.kh.PracticeGraph;

import com.kh.GraphMain.Graph;

public class PracticeGraph {

	public static void main(String[] args) {
		int ver = 13;
		Graph graph = new Graph(ver);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 5);
		graph.addEdge(2, 6);
		graph.addEdge(6, 7);
		graph.addEdge(6, 8);
		graph.addEdge(8, 9);
		graph.addEdge(8, 10);
		graph.addEdge(9, 7);
		graph.addEdge(7, 5);
		graph.addEdge(5, 4);
		graph.addEdge(4, 3);
		graph.addEdge(3, 11);
		graph.addEdge(11, 12);
		
		System.out.print("DPS Å½»ö °á°ú : ");
		graph.DFS(0);
		System.out.println();
		System.out.println("0,1,2,3,4,5,6,7,8,9");
	}

}
