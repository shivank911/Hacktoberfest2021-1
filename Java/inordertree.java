// ques link https://github.com/shivank911/Hacktoberfest2021-1.git
//solution
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null)
            return new ArrayList<Integer>();
        List<Integer> ans=new ArrayList<Integer>();// create list for adding ans
        List<Integer> left=inorderTraversal(root.left);//recursive for left
        List<Integer> right=inorderTraversal(root.right);//recursive for right
        ans.addAll(left);
        ans.add(root.val);
        ans.addAll(right);
        return ans;
        
    }
}
//time complexity O(n)