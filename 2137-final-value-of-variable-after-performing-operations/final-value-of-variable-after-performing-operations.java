class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res=0;

        for(String op: operations){
            if(op.equals("X++") || op.equals("++X")){
                res++;
            }
            else{
                res--;
            }
        }
        return res;
    }
}