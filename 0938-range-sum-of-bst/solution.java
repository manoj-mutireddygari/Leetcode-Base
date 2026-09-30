class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;

        int max = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode temp = q.poll();

            // Accumulate node value if within [low, high] inclusive range 🎯
            if (temp.val >= low && temp.val <= high) {
                max += temp.val;
            }

            // Enqueue child nodes for traversal 🌿
            if (temp.left != null) q.offer(temp.left);
            if (temp.right != null) q.offer(temp.right);
        }

        return max;
    }
}