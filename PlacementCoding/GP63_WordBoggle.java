/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GP63_WordBoggle {

    static boolean diction(String[] strarr,String str){
        for(int i=0;i<strarr.length;i++){
            if(strarr[i].equals(str))
                return true;
        }
        return false;
    }
    static String wordboggle(String[] strarr,char[][] mat,boolean[][] visited,int i,int j,String str){
        visited[i][j]=true;
	//System.out.print(mat[i][j]);
        str=str+Character.toString(mat[i][j]);
	//System.out.println(str);
        if(diction(strarr,str)){
            System.out.println(str);
        }
        for(int row=i-1;row<=i+1 && row<3;row++){
            for(int col=j-1;col<=j+1 && col<3;col++){
		//System.out.println(i+", "+j);
                if(row>=0 && col>=0 && !visited[row][col]){
			
                    wordboggle(strarr,mat,visited,row,col,str);
                }
		}
		}
        str=str.substring(0,str.length()-1);
        visited[i][j]=false;
        return str;
    }
	public static void main (String[] args) {
		//code]
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t!=0){
		    t--;
			String str="";
			System.out.println();
			// str=new StringBuffer("");
		    int nwords=s.nextInt();
		    String[] strarr=new String[nwords];
		    for(int i=0;i<nwords;i++){
		        strarr[i]=s.next();
		    }
		    int n=s.nextInt();
		    char[][] mat=new char[n][n];
		    for(int i=0;i<n;i++){
		        for(int j=0;j<n;j++){
		            mat[i][j]=s.next().charAt(0);
		        }
		    }
		    boolean[][] visited=new boolean[n][n];
		    for(boolean[] row:visited){
		        Arrays.fill(row,false);
		    }
		    
		    for(int i=0;i<n;i++){
		        for(int j=0;j<n;j++){
			//	System.out.println(i+","+j);
		            wordboggle(strarr,mat,visited,i,j,str);
		        }
		    }
		}
	}
}
