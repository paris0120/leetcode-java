fdsa/**
 * 225. Implement Stack using Queues
 */
public class Solution0225 {
    Queue<Integer> q;
    int top;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
        top = x;
    }

    public int pop() {
        Queue<Integer> tmp = new LinkedList<>();
        while(q.size()>1){
            top = q.remove();
            tmp.add(top);
        }
        int output = q.remove();
        q = tmp;
        return output;
    }

    public int top() {
        return top;
    }


    public boolean empty() {
        return q.size()==0;
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