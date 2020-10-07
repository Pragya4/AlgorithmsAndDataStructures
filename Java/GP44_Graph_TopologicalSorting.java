import java.util.*;
class GP44_Graph_TopologicalSorting{
static class Graph{
	LinkedList<Integer>[] adjList;
	int v;
	Graph(int v){
		this.v=v;
		adjList=new LinkedList[v];
		for(int i=0;i<v;i++){
			adjList[i]=new LinkedList<Integer>();				
			}			
		}
}
static void insert(Graph graph,int src,int dest){

	graph.adjList[src].add(dest);
}
static Stack<Integer> stack=new Stack<Integer>();
static void recursiveTopologicalSort(Graph graph,int root,boolean[] visited){
	System.out.println("root "+root);
	visited[root]=true;
	LinkedList<Integer> cur=graph.adjList[root];
	int i=0;
	if(i<cur.size()){
		if(visited[cur.get(i)]==false){
			visited[cur.get(i)]=true;
			recursiveTopologicalSort(graph,cur.get(i),visited);		
		}
	}
stack.push(root);
}
static ArrayList<Integer> TopologicalSort(Graph graph,int v){
	boolean[] visited=new boolean[v];
	Arrays.fill(visited,false);
	for(int i=0;i<v;i++){
		if(visited[i]==false){
			System.out.println("false is "+i);
			recursiveTopologicalSort(graph,i,visited);				
				}			
			}
	ArrayList<Integer> result=new ArrayList<Integer>();
	while(!stack.isEmpty()){
		result.add(stack.pop());			
		}
	return result;
	}
public static void main(String args[]){
	Graph graph=new Graph(6);
        insert(graph,5, 2);
        insert(graph,5, 0);
        insert(graph,4, 0);
        insert(graph,4, 1);
        insert(graph,2, 3);
        insert(graph,3, 1);
	ArrayList<Integer> res=TopologicalSort(graph,6);
	for(int i=0;i<res.size();i++){
			System.out.print(res.get(i)+" ");			
			}
	}
}
