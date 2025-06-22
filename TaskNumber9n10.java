public class Main {
		public static void main(String[] args) {
			int V = 6;
				Graph g = new Graph(V);

				g.addEdge(0, 1, 24);
				g.addEdge(0, 2, 5);
				g.addEdge(0, 3, 10);
				g.addEdge(2, 3, 1);
				g.addEdge(2, 4, 30);
				g.addEdge(2, 5, 10);
				g.addEdge(3, 5, 8);
				g.addEdge(5, 4, 20);
        
				g.shortestPath(0);
		}
	}