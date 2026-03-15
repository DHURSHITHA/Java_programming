class MyStack {
    Queue<Integer> q;
    public MyStack() {
       q=new LinkedList<>(); 
    }
    
    public void push(int x) {
        if(q.isEmpty())
        {
            q.add(x);
        }
        else
        {
            q.add(x);
            int count=1;
            while(count<=q.size()-1)
            {
                int temp=q.remove();
                q.add(temp);
                count++;
            }
        }
        
    }
    
    public int pop() {
        if(q.isEmpty()) return -1;
        return q.remove();
        
    }
    
    public int top() {
        return q.peek();
        
    }
    
    public boolean empty() {
        return q.isEmpty();
        
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
