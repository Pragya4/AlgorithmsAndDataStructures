/*import java.util.*;
class GP43_Graph_DFS{
static class Graph{
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
static void DFS_unreachableFromRoot(Graph graph,int v,int root,boolean[] visited){
	//boolean[]visited=new boolean[v];
	
	Stack<Integer> stack=new Stack<Integer>();
	stack.push(root);
	while(!stack.isEmpty()){
		LinkedList<Integer> cur=graph.adjList[stack.peek()];
		int i=0;
		int elem=stack.pop();
		if(visited[elem]!=true){
			visited[elem]=true;
			System.out.print(elem+" ");
		}
		while(i<cur.size()){
			if(visited[cur.get(i)]!=true){
				stack.push(cur.get(i));
				//visited[cur.get(i)]=true;			
				}
			i++;				
			}			
		}
	
}
static void DFS(Graph graph,int v,int root){
	boolean[] visited=new boolean[v];
	Arrays.fill(visited,false);
	if(graph.adjList.length!=0){
			visited[root]=true;			
			}
	Stack<Integer> stack=new Stack<Integer>();
	stack.push(root);
	while(!stack.isEmpty()){
		LinkedList<Integer> cur=graph.adjList[stack.peek()];
		int i=0;
		int elem=stack.pop();
		if(visited[elem]!=true){
			visited[elem]=true;
			System.out.print(elem+" ");
		}
		while(i<cur.size()){
			if(visited[cur.get(i)]!=true){
				stack.push(cur.get(i));
				//visited[cur.get(i)]=true;			
				}
			i++;				
			}			
		}
	for(int i=0;i<v;i++){
		if(visited[i]==false){
			DFS_unreachableFromRoot(graph,v,i,visited);		
			}
			}
	}
public static void main(String args[]){
	Graph graph=new Graph(7);
	insert(graph,0,3);
	insert(graph,0,2);
	insert(graph,1,0);
	insert(graph,1,2);
	insert(graph,2,0);
	insert(graph,2,3);
	insert(graph,2,4);
	insert(graph,4,3);
	insert(graph,5,4);
	insert(graph,5,6);
	DFS(graph,7,0);
}
}*/
import java.util.*;
class GP43_Graph_DFS{
static class Graph{
	LinkedList<Integer>[] adjList;
	int v;
	Graph(int v){
		this.v=v;
		adjList=new LinkedList[v];
		for(int i=0;i<v;i++)
			adjList[i]=new LinkedList<Integer>();			
		}
}
static void insert(Graph graph,int src,int dest){
	graph.adjList[src].add(dest);
	}
static void print(Graph graph,int v){
	for(int i=0;i<v;i++){
		System.out.print((i+1)+":");
		LinkedList<Integer> ll=graph.adjList[i];
		for(int j=0;j<ll.size();j++)
			System.out.print((ll.get(j)+1)+"->");		
	System.out.println();		
	}
	
}
static void dfsutil(Graph graph,int root,boolean[] visited){
	//int v=graph.v;
	if(visited[root]==false){
		System.out.print((root+1)+" ");
		visited[root]=true;
		}
	LinkedList<Integer> adjList=graph.adjList[root];
	for(int i=0;i<adjList.size();i++){
		if(visited[adjList.get(i)]!=true)
			dfsutil(graph,adjList.get(i),visited);			
		}

	}
static void DFS(Graph graph,int root,int v){
	boolean[] visited=new boolean[v];
	Arrays.fill(visited,false);	
	dfsutil(graph,root,visited);
	
}
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	//int v=s.nextInt();
	Graph graph=new Graph(7);
	insert(graph,0,3);
	insert(graph,0,2);
	insert(graph,1,0);
	insert(graph,1,2);
	insert(graph,2,0);
	insert(graph,2,3);
	insert(graph,2,4);
	insert(graph,4,3);
	insert(graph,5,4);
	insert(graph,5,6);
	print(graph,7);
	DFS(graph,0,7);
	
	
}
}
