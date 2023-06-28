import java.util.Scanner;

class QuickSort
{
    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
    int partition(int sarr[],int earr[], int low, int high)
    {
        int pivot = earr[high]; 
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (earr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int etemp = earr[i];
		int stemp = sarr[i];
                earr[i] = earr[j];
		sarr[i] = sarr[j];
                earr[j] = etemp;
		sarr[j] = stemp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int etemp = earr[i+1];
	int stemp = sarr[i+1];
        earr[i+1] = earr[high];
	sarr[i+1] = sarr[high];
        earr[high] = etemp;
	sarr[high] = stemp;

        return i+1;
    }


    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    void sort(int sarr[],int earr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is 
              now at right place */
            int pi = partition(sarr,earr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(sarr,earr, low, pi-1);
            sort(sarr,earr, pi+1, high);
        }
    }

    /* A utility function to print array of size n */
    void printArray(int sarr[],int earr[])
    {
        int n = earr.length;
        for (int i=0; i<n; ++i)
            System.out.print(sarr[i]+" "+earr[i]+"\n");
        System.out.println();
    }

    
    
}
class JobSchedulingGreedy{		//first to finish strategy

public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	System.out.println("Max number of machines present in the system");
	int m=s.nextInt();
	int[] machine=new int[m];
	int start[]=new int[n];
	int end[]=new int[n];
	int cur=0;
	int count=0;
	for(int i=0;i<n;i++){
		start[i]=s.nextInt();
		end[i]=s.nextInt();
	}
	QuickSort ob = new QuickSort();
        ob.sort(start,end, 0, n-1);
	ob.printArray(start,end);
	for(int i=0;i<n;i++){
		if(cur==0){
			machine[0]=end[i];
			cur++;	
			count++;
			System.out.println("Job "+i+" Scheduled in machine 0 \n");
		
			}
		else{
			for(int mac=0;mac<=cur;mac++){
				if(start[i]>machine[mac]){	//can allocate any of the existing machine
					machine[mac]=end[i];
					System.out.println("Job "+i+" Scheduled in machine "+mac+"\n");
					break;			//break the for loop					
				}
				else if(mac==cur){	//agar else if nahi lagaya aur sirf else lagaya to wo bas 0th machine ke baad nayi allocate kardega har baar,aur else if se kya ho raha hai ke uske paas compulsion hai ke saari machines check karne ke baad hi wo cur pe aaega;
					if(cur<m){
						machine[cur]=end[i];	//new machine allocated
						System.out.println("Job "+i+" Scheduled in machine "+cur+ "\n");
						cur++;
						count++;
						break;
						}
					else if(cur>=m){
						System.out.println("not ableto allocate in any of machine\n");	
						break;				
						}
										
					}				
			}			
			}		
		}
System.out.println("Total machines needed "+count);

}

}
