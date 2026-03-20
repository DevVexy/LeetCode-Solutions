# 3666. Minimum Operations to Equalize Binary String 🔴

## 📝 Descrição do Problema
Dado uma string binária `s` e um inteiro `k`, em uma operação você deve escolher **exatamente** `k` índices diferentes e inverter os bits ('0' vira '1' e '1' vira '0'). O objetivo é retornar o número mínimo de operações para tornar todos os caracteres iguais a '1'. Se for impossível, retorne -1.

---

## 🚀 Evolução da Solução

### 1. Abordagem Inicial: Paridade e Ganância (Greedy)
A tentativa inicial focou apenas na paridade global e contagem de zeros.
* **Falha:** Não considerava o "espaço físico" da string. Em casos como `s = "001", k = 3`, a paridade sugere que é possível, mas a restrição de inverter exatamente $k$ bits em uma string de tamanho $n=3$ cria um ciclo infinito que nunca atinge o estado desejado.

### 2. Segunda Abordagem: BFS de Estados ($O(N^2)$)
Implementação de uma busca em largura (BFS) onde cada nó representa a quantidade de zeros na string.
* **Vantagem:** Resolve a lógica de estados e ciclos.
* **Falha:** *Time Limit Exceeded (TLE)*. Para $n = 10^5$, a exploração de todos os vizinhos em cada nível da BFS resultou em uma complexidade quadrática.

### 3. Solução Final: BFS Otimizada com Path Compression ($O(N \alpha(N))$)
Para atingir o tempo de **30ms**, substituí a busca linear e o `TreeSet` por uma técnica de **Pulo de Estados (estilo DSU)**.

* **Intervalo de Transição:** Para um estado com $Z$ zeros, o próximo estado $Z'$ estará no intervalo $[L, R]$, onde:
  - $L = Z + k - 2 \cdot \min(Z, k)$
  - $R = Z + k - 2 \cdot \max(0, k - (n - Z))$
* **Otimização de Pulo:** Utilizamos um array `next` para armazenar o próximo estado não visitado de mesma paridade. Ao visitar um estado, conectamos o anterior ao próximo usando compressão de caminho, garantindo que cada contagem de zeros seja processada apenas uma vez.

---

## 📊 Complexidade
* **Tempo:** $O(N \alpha(N))$ — Onde $\alpha$ é a função inversa de Ackermann devido à compressão de caminho.
* **Espaço:** $O(N)$ — Para armazenar os arrays de distância, fila e controle de pulos.

---

## 💻 Implementação (Java)
```java
// A solução final utiliza BFS com Path Compression para gerenciar 
// os intervalos de transição de forma linear.
// Runtime: 30ms (Beats high percentile)