import java.util.*;
class GP45_CycleInGraph{
static class  Graph{
	int v;
	LinkedList<Integer>[] adjList;
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
static boolean isCycleRecur(Graph graph,int i,boolean[] visited,boolean[] alreadyinstack){
		System.out.println("curnode "+i);
		if(alreadyinstack[i]==true){
			System.out.println("found in stack already");
			//element already in stack is again reachable by some other node means that cycle	
			return true;			
			}	
		if(visited[i]==true){
			//if not already present in stack but already explored to move on
			return false;				
			}
		visited[i]=true;
		alreadyinstack[i]=true;
		LinkedList<Integer> cur=graph.adjList[i];
		int i1=0;
		if(i1<cur.size()){
			if(isCycleRecur(graph,cur.get(i1),visited,alreadyinstack))
				return true;	
			}
		alreadyinstack[i]=false;
		return false;
		//after being done with the while loop, if no cycle found then obviously nothing in the functioncall stack so false everythng for the next node;		
		}
static boolean isCycle(Graph graph,int v){
	boolean[] visited=new boolean[v];
	boolean[] alreadyinstack=new boolean[v];
	Arrays.fill(visited,false);
	Arrays.fill(alreadyinstack,false);
	for(int i=0;i<v;i++){
	if(isCycleRecur(graph,i,visited,alreadyinstack)){
			System.out.println("insode if "+i);
			return true;
		}
	}
return false;
}
public static void main(String args[]){
	Graph graph=new Graph(4);
	insert(graph,0,1);
	insert(graph,0,2);
	insert(graph,1,2);
	insert(graph,2,0);
	insert(graph,2,3);
	System.out.println(isCycle(graph,4));
}
}
