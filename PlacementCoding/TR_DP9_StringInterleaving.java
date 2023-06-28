import java.util.*;
class TR_DP9_StringInterleaving{
static int StringInterleaved(String s1,String s2,String s3){
	String A=s1;
    String B=s2;
    String C=s3;
    if(C.length()!=A.length()+B.length()){
       // System.out.println("dur to this?");
        return 0;
    }
    boolean[][] table=new boolean[s1.length()+1][s2.length()+1];
    table[0][0]=true;
    //System.out.println("flag1");
    for(int i=1;i<=s1.length();i++){
        //System.out.println("flag2");

        if(s1.charAt(i-1)==s3.charAt(i-1))
            table[i][0]=table[i-1][0];
        else
            table[i][0]=false;        
        }
    for(int i=1;i<=s2.length();i++){
        if(s2.charAt(i-1)==s3.charAt(i-1))
            table[0][i]=table[0][i-1];
        else
            table[0][i]=false;
        }
    for(int i=1;i<=s1.length();i++){
        //System.out.println("here");
        for(int j=1;j<=s2.length();j++){
            int k=i+j-1;
            //System.out.println(i+" "+j+" "+k);
            if(s3.charAt(k)==s1.charAt(i-1) && s3.charAt(k)!=s2.charAt(j-1)){
            //System.out.println("s1 and s3 "+s1.charAt(i-1)+" "+s3.charAt(k));
                table[i][j]=table[i-1][j];                
                }
            else if(s3.charAt(k)==s2.charAt(j-1) && s3.charAt(k)!=s1.charAt(i-1)){
            //System.out.println("s2 and s3 "+s2.charAt(j-1)+" "+s3.charAt(k));
                table[i][j]=table[i][j-1];                
                }
            else if(s3.charAt(k)==s2.charAt(j-1) && s3.charAt(k)==s1.charAt(i-1)){
                table[i][j]=table[i-1][j]||table[i][j-1];
            }
            else if(s3.charAt(k)!=s1.charAt(i-1) && s3.charAt(k)!=s2.charAt(j-1)){
            //System.out.println("none "+s1.charAt(i-1)+" "+s2.charAt(j-1)+" "+s3.charAt(k));
                table[i][j]=false;                
            }
            
                            
            }        
        }
        if(table[s1.length()][s2.length()]==true)
            return 1;
return 0;    
}
public static void main(String args[]){
	String str1="aabcc";
	String str2="dbbca";
	String str3="aadbbbaccc";
	System.out.println("RESULT "+StringInterleaved(str1,str2,str3));	
	}
}
