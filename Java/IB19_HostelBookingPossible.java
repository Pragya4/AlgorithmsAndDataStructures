import java.util.*;
class IB19_HostelBookingPossible{
static void sort(int arr[],int dept[])
    {
        int n = arr.length;
 
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr,dept, n, i);
 
        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            int temp1 = arr[0];
	    int temp2=dept[0];
            arr[0] = arr[i];
	    dept[0]=dept[i];
            arr[i] = temp1;
	    dept[i]=temp2;
 
            // call max heapify on the reduced heap
            heapify(arr,dept, i, 0);
        }
    }
 
    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    static void heapify(int arr[],int dept[], int n, int i)
    {
        int largest = i;  // Initialize largest as root
        int l = 2*i + 1;  // left = 2*i + 1
        int r = 2*i + 2;  // right = 2*i + 2
 
        // If left child is larger than root
        if (l < n && dept[l] > dept[largest])
            largest = l;
 
        // If right child is larger than largest so far
        if (r < n && dept[r] > dept[largest])
            largest = r;
 
        // If largest is not root
        if (largest != i)
        {
            int swap1 = arr[i];
	    int swap2=dept[i];
            arr[i] = arr[largest];
	    dept[i]=dept[largest];
            arr[largest] = swap1;
	    dept[largest]=swap2;
 
            // Recursively heapify the affected sub-tree
            heapify(arr,dept, n, largest);
        }
    }
static boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        int[] a=new int[arrive.size()];
	int[] d=new int[depart.size()];
	for(int i=0;i<arrive.size();i++){
		a[i]=arrive.get(i);
		d[i]=depart.get(i);			
		}
	sort(a,d);
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+" ");			
		}
	System.out.println();
	for(int i=0;i<a.length;i++){
		System.out.print(d[i]+" ");			
		}

	int[] room=new int[K];
	room[0]=d[0];
	int i=1;
	int roomptr=0;
	int k=0;
	while(i<a.length && roomptr<K){
		System.out.println("while "+i+"to "+k+" of roomptr "+roomptr);
		for(k=0;k<=roomptr;k++){
		if(i<arrive.size() && room[k]<=a[i]){
				System.out.println("room "+k+"to "+i+" of roomptr "+roomptr);
				room[k]=d[i];				
				i++;
				k--;
				}
		if(i<arrive.size() && roomptr+1<K){
			roomptr++;
			k=0;
			System.out.println("for "+roomptr+" index "+i+"-"+d[i]);				
			room[roomptr]=d[i];
				System.out.println("room "+roomptr+"to "+i+" of roomptr "+roomptr);	
		}
		if(i==arrive.size()){
			return true;				
				}
			}
		
		i++;
		}
	System.out.println("out of while i"+i+" roomptr "+roomptr+" k "+k);		
	if(i==arrive.size() && k<K && roomptr<K){
		return true;
	}
return false;
}
    
public static void main(String args[]){
	ArrayList<Integer> arrive=new ArrayList<Integer>();
	ArrayList<Integer> depart=new ArrayList<Integer>();
	arrive.add(1);
	arrive.add(2);
	arrive.add(3);
	arrive.add(4);
	depart.add(10);
	depart.add(2);
	depart.add(6);
	depart.add(14);
	System.out.println(hotel(arrive,depart,2));
}


}
