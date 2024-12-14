# Jogo da Velha - Java

Este projeto implementa o jogo da velha (tic-tac-toe) em Java. O objetivo é criar uma versão simples do jogo, onde dois jogadores podem alternar jogadas até que um vença ou o jogo termine em empate.

## Funcionalidades

- Dois jogadores alternam entre "X" e "O".
- O jogo verifica automaticamente se algum jogador ganhou ou se houve empate.
- A entrada do jogador é feita por números de 1 a 9, representando as posições do tabuleiro.
- O jogo termina assim que um vencedor é encontrado ou em caso de empate.

## Tecnologias Utilizadas

- Java

## Como Executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/caioasaraiv1/jogo-da-velha-java.git
   ```

2. Abra o projeto no Eclipse IDE ou em outro editor de sua preferência.

3. Compile e execute a classe principal `GameRun.java`.

4. O jogo solicitará a entrada do jogador (um número de 1 a 9) e exibirá o estado atual do tabuleiro após cada jogada.

## Como Jogar

- O jogador será solicitado a digitar um número de 1 a 9, onde cada número corresponde a uma posição no tabuleiro (veja o exemplo abaixo).
  
  Exemplo de como o tabuleiro é exibido:
  
  ```
   X | O | -
  -----------
   - | X | O
  -----------
   O | - | X
  ```

- O jogo verifica automaticamente se há um vencedor ou se o jogo terminou em empate.
  
## Estrutura do Projeto

- `Board.java`: Classe responsável pelo tabuleiro do jogo. Contém a lista que armazena as posições e métodos para manipulação do tabuleiro, como obter e alterar valores das posições e exibir o tabuleiro.
- `GameRun.java`: Classe responsável pela execução do jogo. Controla a sequência de jogadas e interações com o usuário.
- `JogoDaVelha.java`: Contém toda a lógica do jogo, incluindo a verificação de vitória, empate e controle dos turnos dos jogadores.
