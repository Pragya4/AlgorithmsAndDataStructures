public class IB39_ReverseWordsOfSentence {
    static String reverseWords(String a) {
	a=a.trim();
        String[] str=a.split(" ");
        int i=0;
        int j=str.length-1;
        while(i<=j){
            String temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
        String res="";
        for(int i1=0;i1<str.length;i1++){
            res=res+" "+str[i1].replaceAll("\\s","");
        }
        return res;
    }
public static void main(String args[]){
	String str="the sky is blue";
	System.out.println((reverseWords(str)));

}
}

