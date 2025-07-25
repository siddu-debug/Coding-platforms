class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> dict = new HashMap<>();
    for (String s: strs){
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        String key = new String(arr);
        if(!dict.containsKey(key)){
            dict.put(key,new ArrayList<>());
        }
        dict.get(key).add(s);
    }
    return new ArrayList<>(dict.values());

            
        }
    }
        
    

