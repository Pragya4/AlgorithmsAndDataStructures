import java.util.*;
class GP42_Graph_BFS{
//linkedlist of integer as each linkedlist is saperate
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
	//graph.adjList[dest].add(src);
}
static void print(Graph graph){
	for(int i=0;i<graph.v;i++){
		System.out.print((i+1)+":");
		for(int j=0;j<graph.adjList[i].size();j++){
			System.out.print((graph.adjList[i].get(j)+1)+"-->");
				}	
		System.out.println();		
		}
}
static void BFS(Graph graph,int v,int root){
System.out.println("BFS TRAVERSAL");
Queue<Integer> queue=new LinkedList<Integer>();
boolean[] visited=new boolean[v];
if(graph.adjList.length!=0){
		visited[root]=true;
		}
queue.add(root);
System.out.print(root+" ");
while(!queue.isEmpty()){
LinkedList<Integer> cur=graph.adjList[queue.poll()];
int i=0;
while(i<cur.size() && visited[cur.get(i)]!=true){
	System.out.print(cur.get(i)+" ");
	visited[cur.get(i)]=true;
	queue.add(cur.get(i));
	i++;
}

}
}
public static void main(String args[]){
	Graph graphobj=new Graph(5);
	insert(graphobj,0,1);
	insert(graphobj,0,2);
	insert(graphobj,1,2);
	insert(graphobj,2,0);
	insert(graphobj,2,3);
	
	print(graphobj);
	BFS(graphobj,5,2);
}
}
