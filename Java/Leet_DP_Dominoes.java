import java.util.*;
class Leet_DP_Dominoes{
static String dominoes(String str){
	char[] ch=str.toCharArray();
	int sym=0;
	StringBuilder res=new StringBuilder("");
	for(int i=0;i<ch.length;i++){
		//System.out.println(i+" "+ch[i]);
		if(ch[i]=='L'||ch[i]=='R')
			sym++;		
		}
	System.out.println("sym "+sym);
	char[] symbol=new char[sym];
	int[] index=new int[sym];
	int k=0;
	for(int i=0;i<ch.length;i++){
		if(ch[i]=='L'||ch[i]=='R'){
			symbol[k]=ch[i];
			index[k]=i;
			k++;
			}			
	}
	for(int i=0;i<sym;i++){
		System.out.print(symbol[i]+" ");			
		}
	System.out.println();
	for(int j=0;j<sym;j++){
		System.out.print(index[j]+" ");			
		}
	int i=0;
	while(i+1<sym){
		if(symbol[i]==symbol[i+1]){
			for(int j=index[i];j<=index[i+1];j++){
				res=res.append(symbol[i]);				
				}				
			}
		else if(symbol[i]=='L' && symbol[i+1]=='R'){
			res=res.append('L');
			for(int j=index[i]+1;j<index[i+1];j++){
				res=res.append('.');				
				}
			res=res.append('R');
						
			}
		else if(symbol[i]=='R' && symbol[i+1]=='L'){
			int total=index[i+1]-index[i];
			if(total%2==0){
				for(int k1=index[i];k1<=index[i]+(total/2);k1++){
					res=res.append('R');					
					}
				for(int k1=index[i]+(total/2)+1;k1<=index[i+1];k1++){
					res=res.append('L');					
					}				
			}
			else if(total%2==1){
				for(int k1=index[i];k1<=index[i]+(total/2);k1++){
					res=res.append('R');					
					}
				res=res.append('.');
				for(int k1=index[i]+(total/2)+2;k1<=index[i+1];k1++){
					res=res.append('L');					
					}				
				}		
			}
	i++;			
		}
System.out.println("res "+res);
return res.toString();
}
public static void main(String args[]){
	String str=".L.R...LR..L..";
	dominoes(str);

}

}
