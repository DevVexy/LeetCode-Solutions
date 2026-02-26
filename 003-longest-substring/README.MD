# Longest Substring Without Repeating Characters 🟡

## Estratégia
Aplicação da técnica de **Sliding Window** (Janela Deslizante). Usamos dois ponteiros e um HashMap para rastrear a última posição de cada caractere. Quando um caractere se repete, "saltamos" o início da janela para a posição válida.



## Complexidade
- **Tempo:** $O(n)$ - Cada caractere é visitado no máximo duas vezes.
- **Espaço:** $O(min(m, n))$ - Tamanho do conjunto de caracteres únicos.