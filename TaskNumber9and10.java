import java.util.*;

class Graph {
		private int V;                      // Number of vertices
		private List<List<Node>> adj;       // Adjacency list representation of the graph

			Graph(int V) {
				this.V = V;
				adj = new ArrayList<>();
			for (int i = 0; i < V; i++) {
				
				adj.add(new ArrayList<>());
        }
    }

		void addEdge(int u, int v, int weight) {
        // Check if the vertex indices are valid
			if (u < 0 || u >= V || v < 0 || v >= V) {
				throw new IllegalArgumentException("Invalid vertex");
        }

        // Add an edge between vertices u and v with the given weight
				adj.get(u).add(new Node(v, weight));
				adj.get(v).add(new Node(u, weight));
    }

		void shortestPath(int src) {
        // Check if the source vertex is valid
			if (src < 0 || src >= V) {
				throw new IllegalArgumentException("Invalid source vertex");
        }

				PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(n -> n.weight));
				int[] dist = new int[V];
				Arrays.fill(dist, Integer.MAX_VALUE);
				boolean[] visited = new boolean[V];

        // Add the source vertex to the priority queue with a distance of 0
				pq.add(new Node(src, 0));
				dist[src] = 0;

			while (!pq.isEmpty()) {
				Node node = pq.poll();
				int u = node.vertex;

            // Check if the vertex has already been visited
            if (visited[u]) {
                continue;
      }

            // Mark the vertex as visited
            	visited[u] = true;

            // Explore neighbors of the current vertex
            for (Node neighbor : adj.get(u)) {
            	int v = neighbor.vertex;
            	int weight = neighbor.weight;

                // Relaxation: Update the distance if a shorter path is found
            if (!visited[v] && dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                dist[v] = dist[u] + weight;
                    // Add the neighbor to the priority queue with the updated distance
                pq.add(new Node(v, dist[v]));
           }
        }
    }

				System.out.println("Shortest Paths from Source (Vertex " + src + "):");
			for (int i = 0; i < V; i++) {
            // Print the shortest path from the source to each vertex
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.println(src + " >>> " + i + " with no path");
            } else {
                System.out.println(src + " >>> " + i + " with " + dist[i] + " path");
            }
        }
    }

	static class Node { // it represents a vertex and its weight in the graph.
				int vertex;
				int weight;

				Node(int vertex, int weight) {
				this.vertex = vertex;
				this.weight = weight;
        }
    }
}