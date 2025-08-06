class MyStack {
    List<Integer> q1;
    List<Integer> q2;


    public MyStack() {
        q1 = new ArrayList<>();
        q2 = new ArrayList<>();

        
    }
    
    public void push(int x) {
        q2.add(x);
        while(!q1.isEmpty()){
            q2.add(q1.remove(0));

        }
        List<Integer> temp = q1; 
        q1 = q2;
        q2 = temp;
        
    }
    
    public int pop() {
        return q1.remove(0);
        
    }
    
    public int top() {
        return q1.get(0);
        
    }
    
    public boolean empty() {
        return q1.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */