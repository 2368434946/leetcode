//给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。 
//
// 
//
// 示例 1： 
//
// 
//输入：root = [1,null,2,3]
//输出：[1,3,2]
// 
//
// 示例 2： 
//
// 
//输入：root = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：root = [1]
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目在范围 [0, 100] 内 
// -100 <= Node.val <= 100 
// 
//
// 
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树 深度优先搜索 二叉树 👍 1468 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

//Java : 二叉树的中序遍历
public class P94BinaryTreeInorderTraversal {
    public static void main(String[] args){
        Solution solution = new P94BinaryTreeInorderTraversal().new Solution();
        // TO TEST 
    
    }
//leetcode submit region begin(Prohibit modification and deletion)




class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        dfs(root,list);
        return list;

    }

    public void dfs(TreeNode root,List<Integer> res){
        if( root == null){
            return ;
        }
        dfs(root.left,res);
        res.add(root.val);
        dfs(root.right,res);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}


