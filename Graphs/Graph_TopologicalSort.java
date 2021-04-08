import java.util.*;
import java.io.*;
public class Graph_TopologicalSort{
    int v;
    LinkedList<Integer>[] adjList;
    public Graph_TopologicalSort(int v){
        this.v=v;
        adjList=new LinkedList[this.v];
        for(int i=0;i<v;i++){
            adjList[i]=new LinkedList();
        }
    }

    public void topologicalSortUtil(int startNode,boolean[] visited,Stack<Integer> stack){
        if(visited[startNode]){
           return;
        }
        visited[startNode]=true;
        for(Integer childNode: adjList[startNode]){
            topologicalSortUtil(childNode,visited,stack);
        }
        stack.push(startNode);
    }

    public void topologicalSort(int v, int startNode){
        boolean[] visited=new boolean[v];
        Stack<Integer> topologicalStack=new Stack();
        topologicalSortUtil(startNode,visited,topologicalStack);
        for(int i=0;i<v;i++){
            if(!visited[i]){
                topologicalSortUtil(i,visited,topologicalStack);
            }
        }
        while(!topologicalStack.isEmpty()){
            System.out.println(topologicalStack.pop());
        }

    }
    public void addEdge(int u,int v){
        adjList[u].add(v);
    }
    public static void main(String args[]){
        Graph_TopologicalSort graph=new Graph_TopologicalSort(6);
        graph.addEdge(5,2);
        graph.addEdge(5,0);
        graph.addEdge(4,0);
        graph.addEdge(4,1);
        graph.addEdge(2,3);
        graph.addEdge(3,1);
        graph.topologicalSort(6,0);
    
    }
}