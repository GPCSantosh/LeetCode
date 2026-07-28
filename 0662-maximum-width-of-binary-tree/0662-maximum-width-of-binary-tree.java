/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class NodeInfo {
        TreeNode node;
        long index;
        NodeInfo(TreeNode node, long index) {
            this.node = node;
            this.index = index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        Queue<NodeInfo> q = new LinkedList<>();
        q.offer(new NodeInfo(root, 0));
        int ans = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            long min = q.peek().index;
            long first = 0, last = 0;
            for (int i = 0; i < size; i++) {
                NodeInfo cur = q.poll();
                long idx = cur.index - min;
                if (i == 0) first = idx;
                if (i == size - 1) last = idx;
                if (cur.node.left != null)
                    q.offer(new NodeInfo(cur.node.left, 2 * idx));
                if (cur.node.right != null)
                    q.offer(new NodeInfo(cur.node.right, 2 * idx + 1));
            }
            ans = Math.max(ans, (int)(last - first + 1));
        }
        return ans;
    }
}