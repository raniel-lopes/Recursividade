# Exercícios de Recursividade em Java

Este repositório contém as soluções para uma lista de exercícios de recursividade em Java. Cada exercício foi resolvido utilizando técnicas de recursão e está documentado para fins de aprendizado.

## Índice de Exercícios

1. [Cálculo do MDC (Máximo Divisor Comum)](#1-cálculo-do-mdc-máximo-divisor-comum)
2. [Cálculo do Fatorial de um Número](#2-cálculo-do-fatorial-de-um-número)
3. [Conversão de um Número para Base Binária](#3-conversão-de-um-número-para-base-binária)
4. [Soma dos Algarismos de um Número](#4-soma-dos-algarismos-de-um-número)
5. [Impressão de Números de 1 até N](#5-impressão-de-números-de-1-até-n)
6. [Contagem Regressiva](#6-contagem-regressiva)
7. [Verificação de Palíndromo](#7-verificação-de-palíndromo)
8. [Soma dos Primeiros N Números Naturais](#8-soma-dos-primeiros-n-números-naturais)
9. [Cálculo da Potência de um Número](#9-cálculo-da-potência-de-um-número)
10. [Sequência de Fibonacci](#10-sequência-de-fibonacci)
11. [Inversão de uma String](#11-inversão-de-uma-string)
12. [Soma dos Elementos de um Array](#12-soma-dos-elementos-de-um-array)
13. [Contagem de Caracteres em uma String](#13-contagem-de-caracteres-em-uma-string)
14. [Encontrar o Maior Elemento em um Array](#14-encontrar-o-maior-elemento-em-um-array)
15. [Cálculo do Mínimo Múltiplo Comum (MMC)](#15-cálculo-do-mínimo-múltiplo-comum-mmc)
16. [Desafio: Torre de Hanoi](#16-desafio-torre-de-hanoi)

---

### 1. Cálculo do MDC (Máximo Divisor Comum)

Método recursivo para calcular o MDC de dois inteiros `m` e `n`.

```java
public static int mdc(int m, int n) {
    if (n == 0) {
        return m;
    }
    return mdc(n, m % n);
}
