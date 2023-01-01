import java.util.LinkedList;
import java.util.List;

public class Solution0797 {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        return o(graph, 0, new LinkedList<Integer>());

    }
    public List<List<Integer>> o(int[][] graph, int i, List<Integer> l) {
        List<List<Integer>> o = new LinkedList<>();
        l.add(i);
        if(i==graph.length-1) o.add(new LinkedList<>(l));
        else
            for(int n:graph[i]) {
                o.addAll(o(graph, n, l));
            }
        l.remove(l.size()-1);
        return o;

    }

}
