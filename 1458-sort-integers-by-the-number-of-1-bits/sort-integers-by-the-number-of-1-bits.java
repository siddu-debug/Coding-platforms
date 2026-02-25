class Solution {
    public int[] sortByBits(int[] arr) {
        List<List<Integer>> lst=new ArrayList<>();
        for(int i=0;i<15;i++){
            lst.add(new ArrayList<Integer>());
        }
        for(int i:arr){
            int bits=Integer.bitCount(i);
            lst.get(bits).add(i);
        }
        int idx=0;
        int [] ans=new int[arr.length];
        for(List<Integer> x: lst){
            Collections.sort(x);

            for(int i:x){
                ans[idx++]=i;
            }
        }
    return ans;
}
}