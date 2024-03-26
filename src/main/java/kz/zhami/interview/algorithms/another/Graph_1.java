package kz.zhami.interview.algorithms.another;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph_1 {
    private LinkedList<Integer>[] list;
    private boolean[] visited;

    Graph_1(int verties) {
        list = new LinkedList[verties];
        for (int i = 0; i < verties; i++) {
            list[i] = new LinkedList<>();
        }
        visited = new boolean[verties];
    }

    void addEdge(int src, int dest) {
        list[src].add(dest);
    }

    void DFS(int vertex) {
        visited[vertex] = true;
        System.out.println("Visited: " + vertex);
        Iterator<Integer> iterator = list[vertex].iterator();
        while (iterator.hasNext()) {
            var temp = iterator.next();
            if (!visited[temp]) {
                DFS(temp);
            }
        }
    }

    public static void main(String[] args) {
        Graph_1 graph1 = new Graph_1(4);

        graph1.addEdge(0,1);
        graph1.addEdge(0,2);
        graph1.addEdge(1,2);
        graph1.addEdge(2,3);

        graph1.DFS(0);
    }
}
