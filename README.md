# Engenharia de Software — Testes unitários com JUnit 5

Trabalho de Engenharia de Software: escrever casos de teste com **JUnit 5** para cinco algoritmos clássicos e medir a cobertura com **EclEmma (JaCoCo)** no Eclipse, buscando cobrir todos os desvios.

| Classe | O que faz | Cobertura de instruções | Cobertura de desvios |
|---|---|---|---|
| `Equacao` | Raízes de uma equação do 2º grau | 95% | 100% |
| `MaxMin` | Máximo e mínimo de um vetor | 97% | 100% |
| `Palindromo` | Verifica se uma frase é palíndromo | 100% | 100% |
| `Sort` | Bubble sort | 100% | 100% |
| `Triangle` | Classifica um triângulo pelos lados | 100% | 100% |

Os testes ficam em `JUnit5-EclEmma-Tests/src/*TestCase.java`.

## Como rodar

No Eclipse: importe a pasta como projeto Java, adicione a biblioteca JUnit 5 ao build path e use **Coverage As → JUnit Test** para ver a cobertura.
