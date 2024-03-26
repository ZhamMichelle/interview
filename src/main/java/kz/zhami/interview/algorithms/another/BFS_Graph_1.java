package kz.zhami.interview.algorithms.another;

import java.util.*;

public class BFS_Graph_1 {
    public static void main(String[] args) {

    }

    public static <T> Optional<Node_1<T>> search(T value, Node_1<T> start) {
        Queue<Node_1<T>> queue = new ArrayDeque<>();
        queue.add(start);

        Node_1<T> currentNode;
        Set<Node_1<T>> alreadyVisited = new HashSet<>();

        while (!queue.isEmpty()) {
            currentNode = queue.remove();
            System.out.println("Visited node with value: " + currentNode.getValue());

            if (currentNode.getValue().equals(value)) {
                return Optional.of(currentNode);
            } else {
                alreadyVisited.add(currentNode);
                queue.addAll(currentNode.getNeighbors());
                queue.removeAll(alreadyVisited);
            }
        }

        return Optional.empty();
    }
}

class Node_1<T> {
    private T value;
    private Set<Node_1<T>> neighbors;

    public Node_1(T value) {
        this.value = value;
        this.neighbors = new HashSet<>();
    }

    public void connect(Node_1<T> node) {
        if (this == node) throw new IllegalArgumentException("Can't connect node to itself");
        this.neighbors.add(node);
        node.neighbors.add(this);
    }

    public T getValue() {
        return value;
    }

    public Set<Node_1<T>> getNeighbors() {
        return neighbors;
    }
}