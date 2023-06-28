class Node{
 	int data;
 	Node left,right;
 	Node(int value){
		data=value;
		left=right=null;	
		}
}
class BinaryTreeHardCoded{
public static void main(String[] args){
	Node root=new Node(1);
	root.left=new Node(2);
	root.right=new Node(3);
	root.left.left=new Node(4);
/*something as   1
		/  \
		2   3
	       /
	       4
*/	
	System.out.println(root.data);
	System.out.println(root.left.data);
	System.out.println(root.left.left.data);
	System.out.println(root.right.data);
	}

}
