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
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int valorAtual) {
        if (node == null) return 0;
        
        // Calcula o novo valor acumulado (shift para esquerda + valor do nó)
        valorAtual = (valorAtual << 1) | node.val;
        
        // Se for folha, retorna o valor do caminho construído
        if (node.left == null && node.right == null) {
            return valorAtual;
        }
        // Soma os resultados dos caminhos à esquerda e à direita
        return dfs(node.left, valorAtual) + dfs(node.right, valorAtual);
    }
}