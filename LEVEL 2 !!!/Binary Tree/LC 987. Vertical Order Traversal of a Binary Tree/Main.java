class Solution {
    public class pair {
        TreeNode node;
        int level;
        int htlevel;

       pair(TreeNode node, int level,int htlevel) {
           this.node = node;
           this.level = level;
           this.htlevel = htlevel;
           
       }
    }

    public List<List<Integer>> verticalTraversal(TreeNode node) {
        Queue<pair> q = new ArrayDeque<>();
        q.add(new pair(node, 0,0));
        HashMap<Integer, List<pair>> map = new HashMap<>();
        int lmost = 0;
        int rmost = 0;
        while (q.size() > 0) {
            pair p = q.remove();
            if (map.containsKey(p.level) == false) {
                List<pair> check = new ArrayList<>();
                check.add(p);
                map.put(p.level, check);
            } else {
                List<pair> check = map.get(p.level);

                check.add(p);
                map.put(p.level, check);
            }
            if (p.node.left != null) {
                q.add(new pair(p.node.left, p.level - 1,p.htlevel+1));
            }
            if (p.node.right != null) {
                q.add(new pair(p.node.right, p.level + 1,p.htlevel+1));
            }
            lmost = Math.min(p.level, lmost);
            rmost = Math.max(p.level, rmost);
        }
        List<List<Integer>> vertical = new ArrayList<>();
        for (int j = lmost; j <= rmost; j++) {
            Collections.sort(map.get(j), (a, b) -> {
                if (a.htlevel - b.htlevel == 0) {
                    return a.node.val - b.node.val;
                }
                return a.htlevel - b.htlevel;

            });
            List<Integer> temp = new ArrayList<>();
            for (pair p : map.get(j)) {
                temp.add(p.node.val);
            }
            vertical.add(temp);
        }
        return vertical;
    }
}