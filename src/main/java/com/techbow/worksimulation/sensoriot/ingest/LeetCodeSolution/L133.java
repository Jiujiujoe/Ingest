package com.techbow.worksimulation.sensoriot.ingest.LeetCodeSolution;

public class L133 {
    private Map<Integer, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        if (map.containsKey(node.val)) {
            return map.get(node.val);
        }

        Node newNode = new Node(node.val, new ArrayList<Node>());
        map.put(newNode.val, newNode);
        for (Node neighbors : node.neighbors) {
            newNode.neighbors.add(cloneGraph(neighbors));
        }
        return newNode;
    }
}
