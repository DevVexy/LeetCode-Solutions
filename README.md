# 🚀 LeetCode Solutions: Java Edition

Este repositório contém minhas resoluções para os desafios do [LeetCode](https://leetcode.com/), focadas em eficiência algorítmica, estruturas de dados otimizadas e boas práticas de programação em Java.

---


## 🛠️ Desafios Resolvidos

### 🔹 Arrays & HashMaps
| # | Desafio | Dificuldade | Solução | Complexidade |
|---|---------|-------------|---------|--------------|
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | 🟢 Fácil | [Link](./001-two-sum) | $O(n)$ Tempo / $O(n)$ Espaço |
| 66 | [Plus One](https://leetcode.com/problems/plus-one/) | 🟢 Fácil | [Link](./066-plus-one) | $O(n)$ Tempo / $O(n)$ Espaço |
| 1470 | [Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/) | 🟢 Fácil | [Link](./1470-shuffle) | $O(n)$ Tempo / $O(n)$ Espaço |
| 1929 | [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/) | 🟢 Fácil | [Link](./1929-concatenation) | $O(n)$ Tempo / $O(1)$ Espaço |
| 485 | [Max Consecutive Ones](https://leetcode.com/problems/max-consecutive-ones/) | 🟢 Fácil | [Link](./485-max-ones) | $O(n)$ Tempo / $O(1)$ Espaço |

### 🔹 Linked Lists (Listas Ligadas)
| # | Desafio | Dificuldade | Solução | Complexidade |
|---|---------|-------------|---------|--------------|
| 2 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | 🟡 Médio | [Link](./002-add-two-numbers) | $O(\max(m, n))$ |

### 🔹 Strings & Sliding Window
| # | Desafio | Dificuldade | Solução | Complexidade |
|---|---------|-------------|---------|--------------|
| 3 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | 🟡 Médio | [Link](./003-longest-substring) | $O(n)$ Tempo |
| 5 | [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/) | 🟡 Médio | [Link](./005-longest-palindrome) | $O(n^2)$ Tempo / $O(1)$ Espaço |
| 6 | [Zigzag Conversion](https://leetcode.com/problems/zigzag-conversion/) | 🟡 Médio | [Link](./006-zigzag-conversion) | $O(n)$ Tempo / $O(1)$ Espaço |
| 67 | [Add Binary](https://leetcode.com/problems/add-binary/) | 🟢 Fácil | [Link](./067-add-binary) | $O(\max(N, M))$ Tempo / $O(\max(N, M))$ Espaço |

### 🔹 Math & Numbers
| # | Desafio | Dificuldade | Solução | Complexidade |
|---|---------|-------------|---------|--------------|
| 7 | [Reverse Integer](https://leetcode.com/problems/reverse-integer/) | 🟡 Médio | [Link](./007-reverse-integer) | $O(\log_{10}(n))$ Tempo / $O(1)$ Espaço |
| 9 | [Palindrome Number](https://leetcode.com/problems/palindrome-number/) | 🟢 Fácil | [Link](./009-palindrome-number) | $O(\log_{10}(n))$ Tempo / $O(1)$ Espaço |
| 12 | [Integer to Roman](https://leetcode.com/problems/integer-to-roman/) | 🟡 Médio | [Link](./012-integer-to-roman) | $O(1)$ Tempo / $O(1)$ Espaço |
| 13 | [Roman to Integer](https://leetcode.com/problems/roman-to-integer/) | 🟢 Fácil | [Link](./013-roman-to-interger) | $O(n)$ Tempo / $O(1)$ Espaço |
| 69 | [Sqrt(x)](https://leetcode.com/problems/sqrtx/) | 🟢 Fácil | [Link](./069-sqrt(x)) | $O(\log x)$ Tempo / $O(1)$ Espaço |
| 70 | [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) | 🟢 Fácil | [Link](./070-climbing-stairs) | $O(n)$ Tempo / $O(1)$ Espaço |
| 168 | [Excel Sheet Column Title](https://leetcode.com/problems/excel-sheet-column-title/) | 🟢 Fácil | [Link](./168-excel-sheet-column-title) | $O(\log_{26}(n))$ Tempo / $O(1)$ Espaço |
| 171 | [Excel Sheet Column Number](https://leetcode.com/problems/excel-sheet-column-number/) | 🟢 Fácil | [Link](./171-excel-sheet-column-number) | $O(n)$ Tempo / $O(1)$ Espaço |

### 🔹 Binary Trees & Bit Manipulation
| # | Desafio | Dificuldade | Solução | Complexidade |
|---|---------|-------------|---------|--------------|
| 1022 | [Sum of Root To Leaf Binary Numbers](https://leetcode.com/problems/sum-root-to-leaf-binary-numbers/) | 🟢 Fácil | [Link](./1022-sum-root-leaf) | $O(n)$ Tempo |

### 🔹 Algoritmos Avançados (Binary Search)
| # | Desafio | Dificuldade | Solução | Complexidade |
|---|---------|-------------|---------|--------------|
| 4 | [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/) | 🔴 Difícil | [Link](./004-median-arrays) | $O(\log(\min(m, n)))$ |

---

## 💡 Conceitos Aplicados

Neste portfólio, apliquei técnicas fundamentais de Ciência da Computação:

* **Sliding Window:** Otimização de busca em strings de $O(n^2)$ para $O(n)$.
    
* **Busca Binária em Partição:** Resolução de problemas de nível "Hard" com performance logarítmica.
* **Manipulação de Bits:** Uso de *bitwise shifts* (`<<`, `|`) para processamento eficiente de números binários.
* **Recursão (DFS):** Travessia de árvores binárias para soma de caminhos raiz-folha.
    
* **Ponteiros e Dummy Nodes:** Gestão eficiente de memória e simplificação de algoritmos em Listas Ligadas.

---

## 📁 Estrutura do Projeto

```text
.
├── 001-two-sum/
├── 002-add-two-numbers/
├── 003-longest-substring/
├── 004-median-arrays/
├── 005-longest-palindrome/
├── 006-zigzag-conversion/
├── 007-reverse-integer/
├── 009-palindrome-number/
├── 012-integer-to-roman/
├── 013-roman-to-interger/
├── 066-plus-one/
├── 067-add-binary/
├── 069-sqrt(x)/
├── 070-climbing-stairs/
├── 168-excel-sheet-column-title/
├── 171-excel-sheet-column-number/
├── 485-max-ones/
├── 1022-sum-root-leaf/
├── 1470-shuffle/
├── 1929-concatenation/
└── README.md (Este arquivo)
```

