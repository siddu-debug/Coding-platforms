class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        if(numRows >= 1){
            res.add(Arrays.asList(1));
        }
        if(numRows >= 2){
            res.add(Arrays.asList(1,1));
        }
        for(int i=2;i<numRows;i++){
            List<Integer> prev_row=res.get(i-1);
            List<Integer> arr=new ArrayList<>();
            arr.add(1);
            for(int j=0;j<prev_row.size()-1;j++){
                arr.add(prev_row.get(j) + prev_row.get(j+1));
            }
            arr.add(1);
            res.add(arr);
        }
        return res;
        
    }
}