import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Solution0126 {

    HashMap<String,List<String>> sim = new HashMap<>();
    HashMap<String,List<String>> simkeys = new HashMap<>();
    HashMap<String, L> map = new HashMap<>();
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        for(String s:wordList) {
            List<String> keys = new LinkedList<>();
            for(int i = 0;i<s.length();i++) {
                String k =getI(s, i);
                keys.add(k);
                if(!sim.containsKey(k)) sim.put(k, new LinkedList<>());
                sim.get(k).add(s);
            }
            simkeys.put(s, keys);
        }

        List<String> keys = new LinkedList<>();
        for(int i = 0;i<beginWord.length();i++) {
            String k =getI(beginWord, i);
            keys.add(k);
            if(!sim.containsKey(k)) sim.put(k, new LinkedList<>());
            sim.get(k).add(beginWord);
        }
        simkeys.put(beginWord, keys);
        HashMap<String, L> list = new HashMap<>();
        list.put(beginWord, new L(beginWord));
        List<List<String>> o = new LinkedList<>();
        while(list.size()>0) {
            map.putAll(list);
            HashMap<String, L> tmp = new HashMap<>();

            for(String key:list.keySet()) {
                boolean got = false;
                for(String k:simkeys.get(key)) {
                    for(String s:sim.get(k)) {
                        if(map.containsKey(s)) continue;
                        if(!tmp.containsKey(s)) tmp.put(s, new L(s));
                        tmp.get(s).add(key);
                        if(s.equals(endWord)) {
                            got = true;
                            break;
                        }
                    }
                    if(got) break;
                }

            }
            list = tmp;

            if(map.containsKey(endWord)) return map.get(endWord).get();
        }


        return o;


    }


    public String getI(String s, int i) {

        StringBuilder sb = new StringBuilder();
        sb.append(s.substring(0,i));
        sb.append('|');
        sb.append(s.substring(i+1));
        return sb.toString();
    }


    class L{
        public String s;
        HashSet<String> last;
        public L(String s) {
            this.s = s;
            // if(last==null) this.m = new HashSet<>();
            // else this.m = new HashSet<>(last.m);
            // m.add(s);
            this.last = new HashSet<>();
        }
        boolean add(String s) {
            return last.add(s);
        }
        public List<List<String>> get(){
            List<List<String>> o = new LinkedList<>();
            if(last.size() == 0)  {
                o.add(new LinkedList<>());
            }
            else  for(String s:last) {
                o.addAll(map.get(s).get());
            }
            for(List<String> l:o) {
                l.add(this.s);

            }
            return o;
        }



    }
}
