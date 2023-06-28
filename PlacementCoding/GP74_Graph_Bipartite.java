import java.util.*;
class GP74_Graph_Bipartite{
static boolean isbipartite(int[][] graph,int n,int src){
	int[] visited=new int[n];
	Arrays.fill(visited,-1);
	visited[src]=1;
	Queue<Integer> queue=new LinkedList<Integer>();
	queue.add(src);

	while(!queue.isEmpty()){
		src=queue.poll();
		if(graph[src][src]==1)
			return false;
		for(int i=0;i<n;i++){
			if(graph[src][i]==1 && visited[i]==-1){
				visited[i]=1-visited[src];
				queue.add(i);				
				}
			if(graph[src][i]==1 && visited[i]==visited[src])
				return false;		
			}		
		}
return true;	
	
}
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[][] graph=new int[n][n];
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			graph[i][j]=s.nextInt();			
			}		
		}
System.out.println(isbipartite(graph,n,0));
}
}
