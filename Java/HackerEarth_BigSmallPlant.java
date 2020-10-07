import java.util.Scanner;
class HackerEarth_BigSmallPlant{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] smallplant=new int[n];
	for(int i=0;i<n;i++){
		smallplant[i]=s.nextInt();	
		}
	int[][] city=new int[n][3];
	int cost=0;
	int ways=1;
	for(int j=0;j<n-1;j++){
		for(int i=0;i<3;i++){
			city[j][i]=s.nextInt();
			}
	}
	for(int j=0;j<n-1;j++){		
	if(city[j][2]>smallplant[j]+smallplant[j+1]){
		cost+=smallplant[j]+smallplant[j+1];			
		j+=1;	//j++ will happen anyway so effectively jumping from city 3 after having accepted small plant for city1 and city 2
	 }
	else if(city[j][2]<smallplant[j]+smallplant[j+1]){			//need to accept the bigplant
		cost+=city[j][2];
		j+=1;	
		}
	else{
		ways++;	
		cost+=city[j][2];
		j+=1;		
	}
	if(j==n-2){
		cost+=smallplant[n-1];		
		}
	
}

System.out.println(cost+" "+ways);

}

}
