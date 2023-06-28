import java.util.*;
class IB53_SumPaths{
  static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) {
       val = x;
       left=null;
       right=null;
      }
  }
 
//public class Solution {
    static ArrayList<ArrayList<Integer>> outer= new ArrayList<ArrayList<Integer>>();
    static ArrayList<Integer> inner=new ArrayList<Integer>();
static int k=0;
    static void Sumtree(TreeNode node,int x){
        if(node==null){
            return ;
            }
        if(node.left!=null){
            node.left.val+=node.val;
        }
        if(node.right!=null){
            node.right.val+=node.val;
        }
        Sumtree(node.left,x);
        Sumtree(node.right,x);
    }
    static ArrayList<ArrayList<Integer>> findpath(TreeNode node,int x){
	outer=outer;
ArrayList<Integer> temp;
       System.out.println("curren "+node.val);
        if(node!=null){
            inner.add(node.val);
        }
        if(node.left==null && node.right==null){
            if(node.val==x){
		temp=inner;
		System.out.println("inner ");
		for(int i=0;i<inner.size();i++){
			System.out.print(inner.get(i)+ " ");			
			}
	        outer.add(k,temp);
		k++;
		System.out.println("path "+k);
		for(int i=0;i<outer.size();i++){
			for(int j=0;j<outer.get(i).size();j++){
                   		 System.out.print(outer.get(i).get(j)+" ");}
		System.out.println();
                }
		inner.remove(inner.size()-1);
            }
        }
        if(node.left!=null){
        	findpath(node.left,x);
		System.out.println("rempving "+inner.get(inner.size()-1));
		inner.remove(inner.size()-1);
	}
        if(node.right!=null){
            findpath(node.right,x);
	}
	return outer;		
    }
static ArrayList<ArrayList<Integer>> formatted(ArrayList<ArrayList<Integer>> result){
	for(int i=0;i<result.size();i++){
		ArrayList<Integer> in=result.get(i);
		for(int j=in.size()-1;j>0;j--){
				System.out.print(in.get(j)+" ");
				//outer.get(i).set(j,in.get(j)-in.get(j-1));	
			}
		System.out.println();		
		}
	return result;
	}
    static ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {
        outer.clear();
        inner.clear();
        Sumtree(A,B);
	//        ArrayList<ArrayList<Integer>> res= 
findpath(A,B);
	//return formatted(res);
	return new ArrayList<ArrayList<Integer>>();
    }
public static void main(String args[]){
	TreeNode root=new TreeNode(5);
	TreeNode node=root;
	root.left=new TreeNode(4);
	root.right=new TreeNode(8);
	root.left.left=new TreeNode(11);
	root.left.left.left=new TreeNode(7);
	root.left.left.right=new TreeNode(2);
	root.right.right=new TreeNode(4);
	root.right.left=new TreeNode(13);
	root.right.right.right=new TreeNode(1);
	root.right.right.left=new TreeNode(5);
	pathSum(node,22);
		
}
}

