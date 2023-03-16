package com.cydeo.session_13_Graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {//need representation for relationship
    // matrix
    //list -we will go with list and every element of another list(list vertex)
    //also empty constructor
    List<List<Vertex>> adjList= new ArrayList<>();

    public Graph(List<Edge> edges){
       // construct Adjacency List
        //create empty arraylist for each AdjList element
        for (int i = 0; i < edges.size(); i++) {
            adjList.add(i, new ArrayList<>());//created empty list
        }
        //Add vertices connected to current vertex
        for (Edge edge:edges){
            adjList.get(edge.from).add(new Vertex(edge.to, edge.weight));
        }


    }

    public static void printGraph(Graph graph){
        int fromVertex= 0;
        System.out.println("Printing  the relationships on the Graph");
        while(fromVertex<graph.adjList.size()){
            for(Vertex v : graph.adjList.get(fromVertex)){
                System.out.println("Vertex"+ fromVertex+ "==> " + v.value + "(" + v.weight +")\t" );
            }
            System.out.println();
            fromVertex++;
        }
    }

}
