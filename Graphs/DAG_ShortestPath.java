import java.util.*;
import java.io.*;
class Graph{
    public class Edge{
        int destV;
        int weight;
        Edge(int destV,int weight){
            this.destV=destV;
            this.weight=weight;
        }
    }
    List<LinkedList<Edge>> adjList;
    int v;
    Graph(int v){
        this.v=v;
        adjList=new ArrayList();
        for(int i=0;i<v;i++){
            adjList.add(new LinkedList<Edge>());
        }
    }

    public void addEdge(int u, int v, int w){
        adjList.get(u).add(new Edge(v,w));
    }

    public void topologicalSortUtil(int v, boolean[] visited,Stack<Integer> res){
        if(visited[v]){
            return;
        }
        visited[v]=true;
        for(Graph.Edge i:adjList.get(v)){
            topologicalSortUtil(i.destV,visited,res);
        }
        res.add(v);
    }
    
    public Stack<Integer> topologicalSort(int start,int v){
        boolean[] visited=new boolean[v];
        Stack<Integer> res=new Stack();
        topologicalSortUtil(start,visited,res);
        
        
        return res;
        }
    }

public class DAG_ShortestPath{
    public List<Integer> shortestPath(int start, int end, Graph graph, List<Integer> topologyList){
        int[] weight=new int[topologyList.size()];
        for(int i=0;i<topologyList.size();i++){
            weight[i]=Integer.MAX_VALUE;
        }
        weight[start]=0;
        for(int i=0;i<topologyList.size();i++){
            System.out.println("relaxing for "+topologyList.get(i));
            for(Graph.Edge adjEdge:graph.adjList.get(topologyList.get(i))){
                
                System.out.println(adjEdge.destV+" -- "+weight[adjEdge.destV]+" or "+weight[topologyList.get(i)]+"+"+adjEdge.weight);
                weight[adjEdge.destV]=Math.min(weight[adjEdge.destV],weight[topologyList.get(i)]+adjEdge.weight);
            }
        }
        System.out.println("topologicalSort and weight");
        for(int i=0;i<weight.length;i++){
            System.out.println(topologyList.get(i)+"->"+weight[i]);
        }
        return new ArrayList();
    }
    public static void main(String args[]){
        Graph graph=new Graph(8);
        graph.addEdge(0,1,3);
        graph.addEdge(0,2,6);
        graph.addEdge(1,4,11);
        graph.addEdge(1,3,4);
        graph.addEdge(1,2,4);
        graph.addEdge(2,3,8);
        graph.addEdge(2,6,11);
        graph.addEdge(3,4,-4);
        graph.addEdge(3,5,5);
        graph.addEdge(3,6,2);
        graph.addEdge(4,7,9);
        graph.addEdge(5,7,1);
        graph.addEdge(6,7,2);
        int k=0;
        for(LinkedList<Graph.Edge> ll:graph.adjList){
            System.out.println("For "+k+"  ");
            for(Graph.Edge edge:ll){
                System.out.print(" "+edge.destV+" wt "+edge.weight+"|");
            }
            System.out.println();
            k++;
        }
        

        List<Integer> topologyList=new ArrayList();

        System.out.println("topological sort");

        Stack<Integer> topologicalSort=graph.topologicalSort(0,8);
        for(int i=0;i<8;i++){
            topologyList.add(topologicalSort.pop());

        }
        for(int i=0;i<8;i++){
            System.out.print(topologyList.get(i)+" ");
        }
        System.out.println();
        DAG_ShortestPath obj=new DAG_ShortestPath();
        obj.shortestPath(0,7,graph,topologyList);
    }
}