package Entity;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public String name;
    public int value;
    public List<Node> neighbors;

    public Node(){
    }

    public Node(String name){
        this.name = name;
        this.value = -1;
    }

    public void setNeighbors(List<Node> neighborList){
        node.neighbors = neighborList;
    }

    public void displayNode(Node node){
        System.out.println(node.name);
        System.out.println(node.value);
        for(int i = 0; i < node.neighbors.size(); i++){
            System.out.print(node.neighbors.get(i) + " ");
        }
    }
}
