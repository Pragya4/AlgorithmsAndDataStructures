import java.util.*;
class IB51_UnixLikePath{
static String simplifyPath(String A) {
	String res="/";
	int i=1;
	Queue<String> q=new LinkedList<String>();
	while(i<A.length()){
		String temp="";
		while(i<A.length() &&  A.charAt(i)!='/'){
			temp+=A.charAt(i);
			i++;
			}
		System.out.println("temp"+temp);
		i++;
		q.add(temp);		
		}
int k=0;
while(q.size()>0){
	if(q.peek().equals("..")){
		res="/";
		q.remove();		
	}
	else if(q.peek().equals(".")){
		q.remove();			
		}
	else if(q.peek().equals("/")){
		q.remove();		
		}
	else if(q.peek().equals("")){
		q.remove();			
	}
	else {
		res=res+q.remove()+"/";			
		}
	
}
 if(res.length()>1 && res.charAt(res.length()-1)=='/'){
	res=res.substring(0,res.length()-1);		
	}
System.out.println(res);
return res;   
}
public static void main(String args[]){
	//simplifyPath("/a/./b/../../c/");
	//simplifyPath("/a/..");
	//simplifyPath("/a/../");
	//simplifyPath("/../../../../../a");
	//simplifyPath("/a/./b/./c/./d/");
	//simplifyPath(" /a/../.././../../.");
	simplifyPath("/a//b//c//////d");
/*



*/
}
}


/*/./.././ykt/xhp/nka/eyo/blr/emm/xxm/fuv/bjg/./qbd/./../pir/dhu/./../../wrm/grm/ach/jsy/dic/ggz/smq/mhl/./../yte/hou/ucd/vnn/fpf/cnb/ouf/hqq/upz/akr/./pzo/../llb/./tud/olc/zns/fiv/./eeu/fex/rhi/pnm/../../kke/./eng/bow/uvz/jmz/hwb/./././ids/dwj/aqu/erf/./koz/..*/
