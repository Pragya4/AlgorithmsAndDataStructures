import java.util.*;
class IB20_maximumGap{

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    static void sort(int a[],int[] index)
    {
        int n = a.length;
 
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(a,index, n, i);
 
        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            int temp1 = index[0];
            int temp2=a[0];
            index[0]=index[i];
            a[0] = a[i];
            index[i]=temp1;
            a[i] = temp2;
 
            // call max heapify on the reduced heap
            heapify(a,index, i, 0);
        }
    }
 
    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    static void heapify(int a[],int[] index, int n, int i)
    {
        int largest = i;  // Initialize largest as root
        int l = 2*i + 1;  // left = 2*i + 1
        int r = 2*i + 2;  // right = 2*i + 2
 
        // If left child is larger than root
        if (l < n && a[l] > a[largest])
            largest = l;
 
        // If right child is larger than largest so far
        if (r < n && a[r] > a[largest])
            largest = r;
 
        // If largest is not root
        if (largest != i)
        {
            int swap1 = a[i];
            int swap2= index[i];
            a[i] = a[largest];
            index[i]=index[largest];
            a[largest] = swap1;
            index[largest]=swap2;
            
 
            // Recursively heapify the affected sub-tree
            heapify(a,index, n, largest);
        }
    }
 
    static int maximumGap(final List<Integer> A) {
        int[] a=new int[A.size()];
        
        for(int i=0;i<A.size();i++){
            a[i]=A.get(i);
        }
        int[] index=new int[A.size()];
        for(int i=0;i<A.size();i++){
            index[i]=i;
        }
        sort(a,index);
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+" ");		
		}
	System.out.println();
	for(int i=0;i<a.length;i++){
		System.out.print(index[i]+" ");		
		}
	
        int max=Integer.MIN_VALUE;
        int l=0,r=a.length-1;
        while(l<r){
            if(index[r]-index[l]>max)
                max=index[r]-index[l];
	l++;
	r--;
        }
    
        return max;
    }
public static void main(String args[]){
ArrayList<Integer> a=new ArrayList<Integer>();
a.add(3);
a.add(5);
a.add(4);
a.add(2);
System.out.println(maximumGap(a));

}



}
