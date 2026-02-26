class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Nó auxiliar para iniciar a lista
        ListNode atual = dummyHead;
        int carry = 0; // Armazena o "vai um"

        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            
            int soma = carry + x + y;
            carry = soma / 10; // Extrai a dezena para o próximo nó
            
            atual.next = new ListNode(soma % 10); // Cria o nó com a unidade
            atual = atual.next;
            
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return dummyHead.next;
    }
}