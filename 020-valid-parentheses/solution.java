import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            // Se abrir, empurramos o fechamento esperado para facilitar a comparação futura
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } 
            // Se for fechamento, checamos se casa com o topo da pilha
            else {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }
        
        // Se a pilha estiver vazia, tudo foi fechado corretamente
        return stack.isEmpty();
    }
}