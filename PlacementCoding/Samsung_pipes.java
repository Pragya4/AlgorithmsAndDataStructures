/* IMPORTANT: Multiple classes and nested static classes are supported */
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
    class Node{
        int x;
        int y;
        Node next;
        Node(int x,int y){
            this.x=x;
            this.y=y;
        }
        int dist;
    }
    class Queue{
        Node front,rear;
        int size;
        Queue(){
            this.size=0;
        }
        void enqueue(Node x){
            if(this.size==0){
                this.rear=x;
                this.front=x;
            }
            else{
                this.rear.next=x;
                this.rear=this.rear.next;
            }
            size++;
        }
        Node dequeue(){
            if(isEmpty())
                return null;
            
                Node fr=this.front;
                this.front=this.front.next;
                size--;
            
            return fr;
        }
        boolean isEmpty(){
            if(this.size==0)
                return true;
            return false;
        }
    }
    
class Samsung_pipes {
    static int mat[][]=new int[1001][1001];
    static int[] x_dir={0,0,-1,1};
    static int[] y_dir={-1,1,0,0};
    static int n,m,length;
    static int x,y;
    static int countpipes=1;
    static boolean[][] visited=new boolean[1001][1001];

    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t!=0){
            t--;
            n=s.nextInt();
            m=s.nextInt();
            x=s.nextInt();
            y=s.nextInt();
            length=s.nextInt();
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    mat[i][j]=s.nextInt();
                    
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    visited[i][j]=false;
                }
            }
            int numberofpipes=1;
            System.out.println(t+" "+n+" "+m+" "+x+" "+y+" "+length);
            if(mat[x][y]!=0)
                numberofpipes=countpipes_dfs(x,y);
            System.out.println(numberofpipes);
        }
        
    }
        static int countpipes_dfs(int x,int y){
            Queue queue=new Queue();
            Node u1=new Node(x,y);
            u1.dist=1;
            queue.enqueue(u1);
            visited[u1.x][u1.y]=true;
            int countpipes=1;
            while(!queue.isEmpty()){
                Node u=queue.dequeue();
                System.out.println("deq "+u.x+","+u.y+","+u.dist+" "+mat[u.x][u.y]);
                for(int i=0;i<4;i++){
                   // System.out.println("dir "+i+" dx "+(u.x+x_dir[i])+" dy "+(u.y+y_dir[i]));

                    if(isValid(u.x,u.y,u.x+x_dir[i],u.y+y_dir[i],u.dist+1)){
                        if(isMoveable(i,mat[u.x][u.y],u.x+x_dir[i],u.y+y_dir[i])){
                            Node v=new Node(u.x+x_dir[i],u.y+y_dir[i]);
                            v.dist=u.dist+1;
                            System.out.println("bfs "+i+" "+v.x+","+v.y+","+v.dist+" cp "+countpipes);
                            visited[v.x][v.y]=true;
                            queue.enqueue(v);
                            countpipes++;
                        }
                    }
                }
            }
            return countpipes;
        }
        static boolean isValid(int x,int y,int reachable_x,int reachable_y,int len){
            if(reachable_x<0 || reachable_x>=n || reachable_y<0 || reachable_y>=m){
		System.out.println("vis false");
                return false;
            }
            else if(visited[reachable_x][reachable_y]==true || len>length||mat[x][y]==0){
		System.out.println("vis false");
                return false;
	}
	System.out.println("vistrue");
        return true;
        }
        static boolean isMoveable(int dir,int curpipe,int dx,int dy){
            if(dir==0){     //-1,0=left
                    if(curpipe==1||curpipe==3||curpipe==6||curpipe==7){
                        return(mat[dx][dy]==1||mat[dx][dy]==3||mat[dx][dy]==4||mat[dx][dy]==5);
                    }                
            }
            else if(dir==1){
                if(curpipe==1||curpipe==3||curpipe==4||curpipe==5){
                    return (mat[dx][dy]==1||mat[dx][dy]==3||mat[dx][dy]==6||mat[dx][dy]==7);
                }
            }
            else if(dir==2){
                if(curpipe==1||curpipe==2||curpipe==4||curpipe==7){
                    return (mat[dx][dy]==1||mat[dx][dy]==2||mat[dx][dy]==5||mat[dx][dy]==6);
                }
            }
            else if(dir==3){
                if(curpipe==1||curpipe==2||curpipe==5||curpipe==6){
                    return (mat[dx][dy]==1||mat[dx][dy]==2||mat[dx][dy]==4||mat[dx][dy]==7);
                }   
            }
            return false;
        }
        // Write your code here

    
}

