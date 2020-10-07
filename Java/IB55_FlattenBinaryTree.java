import java.util.*;
public class IB55_FlattenBinaryTree {
 static class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
static TreeNode flatten(TreeNode a) {
        if(a==null)
            return null;
        TreeNode head=a;
        TreeNode start=null;
	int flag=0;
        Stack<TreeNode> stack=new Stack<TreeNode>();
        stack.push(a);
        while(!stack.isEmpty()){
            a=stack.pop();
            while(a!=null && a.right==null){
                head.right=a;
                head=head.right;
                if(flag==0){
                    start=head;
                    flag=1;
                }
                a=a.left;
            }
            while(a!=null){
                if(a.right!=null){
                        stack.push(a.right);
		}
	System.out.println(head.val);
            head.right=a;

            head=head.right;
            if(flag==0){
                start=head;
		flag=1;
            }
            a=a.left;
	    head.left=null;
            }
        }
        return start;
    }

    /*static TreeNode flatten(TreeNode a) {
        Stack<TreeNode> stack=new Stack<TreeNode>();
        int flag=0;
        if(a==null)
            return null;
        TreeNode head=a;
        TreeNode start=null;
        while(a.right==null){
            if(flag==0){
                head=a;
                start=head.right;
                flag=1;
            }
            else{
                head.right=a;
		head.left=null;
		}
            a=a.left;
        }
        stack.push(a);
        while(!stack.isEmpty()){
            	a=stack.pop();
        while(a!=null){
             if(flag==0){
                start=head;
                flag=1;
            }
            if(a.right!=null){
                stack.push(a.right);
            }
			head.right=a;	
			head=head.right;
            
           	 a=a.left;
		head.left=null;
		
            }
        }
        return start;
        }*/

public static void main(String args[]){
	TreeNode node=new TreeNode(1);
	TreeNode root=node;
	node.left=new TreeNode(2);
	//node.right=new TreeNode(5);
	node.left.left=new TreeNode(3);
	node.left.right=new TreeNode(4);
	//node.right.right=new TreeNode(6);
	TreeNode head=flatten(root);
	while(head!=null){
		System.out.print(head.val);
		head=head.right;		
		}
}
        
    }


