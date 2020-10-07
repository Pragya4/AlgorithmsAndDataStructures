class IB26_BitManip_DifferentBitSumPaiwise{
 static int cntBits(ArrayList<Integer> A) {
        int result=0;
        int mod=1000000007;
        for(int j=0;j<=31;j++){
            int count=0;
            int zero=0;
       // System.out.println("AT j "+j);
        for(int i=0;i<A.size();i++){
            
              //  System.out.println("for "+A.get(i)+" ,"+A.get(j));
                int rem=A.get(i)%2;
                
                if(rem==1){
                    count++;
                }
                else 
                    zero++;
              //  System.out.println(count+" "+zero);
                A.set(i,A.get(i)/2);
            }
            
            result+=(count*zero*2);
        }
        return result%mod;
    }

}
