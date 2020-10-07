import java.util.*;
class Graph_Creation{
static class Graph{
	LinkedList<Integer>[] adjList;
	int Ver;
	Graph(int V){
		Ver=V;
		adjList=new LinkedList[Ver];
		for(int i=0;i<Ver;i++){	
			adjList[i]=new LinkedList<Integer>();			
			}		
		}

	}
	static void insert(Graph graph,int src,int dest){
		graph.adjList[src].addFirst(dest);
		graph.adjList[dest].addFirst(src);		
		}
	static void printG(Graph graph){
		for(int i=0;i<graph.Ver;i++){
			 for(int j=0;j<graph.adjList[i].size();j++){
                	System.out.print(" -> "+graph.adjList[i].get(j));
            }
			System.out.println();			
			}		
		}
public static void main(String args[]){
	Graph graph=new Graph(5);
	insert(graph,0,1);
	insert(graph,1,2);
	insert(graph,3,4);
	insert(graph,4,2);
	insert(graph,1,4);
	printG(graph);	
	}
}
