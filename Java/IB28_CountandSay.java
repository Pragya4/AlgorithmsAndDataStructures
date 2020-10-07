import java.util.*;
class IB28_CountandSay {
    static String CountandSay(int A) {
        StringBuilder num=new StringBuilder("1");
        StringBuilder res=new StringBuilder("");
        for(int i=1;i<A;i++){
            res=new StringBuilder("");
            int movingptr=0;
            int curptr=0;
            int count=0;
            while(movingptr<num.length()+1 && curptr<num.length()){
            //    System.out.println("moving ptr"+movingptr);
                if(movingptr<num.length() && num.charAt(movingptr)==num.charAt(curptr)){
                    count++;
            //        System.out.println("count:"+count);
                }
                else{
            //        System.out.println("in else");
                    res.append(Integer.toString(count));
                    res.append(num.charAt(curptr));
            //        System.out.print(res);
                    curptr++;
                }
                movingptr++;
          //      System.out.println("num: "+num+" res: "+res);
            }
            num=res;
        //System.out.println("######################");    
        }
        
        return res.toString();
    }
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	System.out.println(CountandSay(n));
}
}

