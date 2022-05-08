/**
 * 341. Flatten Nested List Iterator
 * tc: O(n)
 * sc: O(1)
 */
public class Solution0341 {
    int i = 0;
    Stack<Queue> s = new Stack<Queue>();
    Queue<NestedInteger> q;
    List<NestedInteger> c;
    Integer n;


    public NestedIterator(List<NestedInteger> nestedList) {
        q = new LinkedList<NestedInteger>();
        c = nestedList;
        q.addAll(nestedList);
        n = getNext();
    }

    @Override
    public Integer next() {
        Integer o = n;
        n = getNext();
        return o;
    }
    private Integer getNext(){
        Integer output = null;

        while(output==null) {

            while(q.isEmpty()) {
                if(s.isEmpty()) return null;
                else q = s.pop();
            }
            NestedInteger next = q.remove();
            if(next.isInteger()) {
                output = next.getInteger();
            }
            else {
                s.add(q);
                q = new LinkedList<>();
                q.addAll(next.getList());
            }

        }

        return output;
    }


    @Override
    public boolean hasNext() {
        return n!=null;
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
