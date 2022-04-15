package Main;

//Importing necessary packages
import java.util.ArrayList;
import java.util.List;
import Entity.Node;
import Entity.CSpace;

public class Function {

    //Defining lists of nodes that will be used throughout the program
    public List<Node> toCheck = new ArrayList<>();
    public List<Node> checked = new ArrayList<>();
    public List<Node> path = new ArrayList<>();

    //This function takes in a Node and a List of Nodes, then outputs true
    //if the list does NOT contain the inputted Node
    public boolean check(Node checking, ArrayList<Node> list){
        return(!list.contains(checking));
    }

    //This function initializes the end Node
    public void initEnd(Node node){
        node.value = 0;
    }

    //This function goes through each neighboring Node given in the inputted
    //Node's "neighbors" attribute, and outputs the neighbor with the smallest
    //value attribute
    public Node findMinNeighbor(Node node){
        Node minNode = node;
        int minVal = node.value;
        for(int i = 0; i < node.neighbors.size(); i++){
            if(node.neighbors.get(i).value < minVal){
                minVal = node.neighbors.get(i).value;
                minNode = node.neighbors.get(i);
            }
        }
        return(minNode);
    }

    //This function takes in a start Node and an ending Node, then outputs
    //a list of Node names that indicate the shortest path from the start Node
    //to the end Node
    public void pathFinder(Node start, Node end){
        initEnd(end);
        toCheck.add(end);

        //This while loop goes through and gives values to each Node, representing
        //the "distance" between the end Node and any given Node
        while(check(start, (ArrayList<Node>) checked)){
            for(int i = 0; i < toCheck.size(); i++){
                for(int j = 0; j < toCheck.get(i).neighbors.size(); j++){
                    if(check(toCheck.get(i).neighbors.get(j), (ArrayList<Node>) checked)){
                        toCheck.get(i).neighbors.get(j).value = toCheck.get(i).value + 1;
                        checked.add(toCheck.get(i).neighbors.get(j));
                    }
                }
                checked.add(toCheck.get(i));
                toCheck.remove(toCheck.get(i));
            }
        }

        path.add(start);
        Node tempNode = start;

        //This while loop goes from the start Node to the end Node in order
        //of descending cost, adding each Node to a List of Nodes
        while(check(end, (ArrayList<Node>) path)) {
            tempNode = findMinNeighbor(tempNode);
            path.add(tempNode);
        }

        //This for loop prints out each name of each Node in path
        for (Node node : path) {
            System.out.print(node.name + " ");
        }
    }

    public static void main(String[] args){
        System.out.println(CSpace.M31);
        //Node.displayNode(CSpace.M31);
        //pathFinder(CSpace.A6, CSpace.M31);
    }

}