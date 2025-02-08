# 🎮 Jogo da Velha em Java

Um jogo da velha (Tic Tac Toe) desenvolvido em Java, implementando uma estrutura orientada a objetos com separação clara de responsabilidades entre as classes.

## 📋 Características

- Interface via console
- Sistema de dois jogadores (X e O)
- Verificação automática de vitória
- Detecção de empate
- Validação de jogadas
- Tabuleiro 3x3 clássico

## 🏗️ Estrutura do Projeto

O projeto está organizado em três pacotes principais:

```
src/
├── board/
│   └── Board.java         # Gerencia o tabuleiro e sua visualização
├── gamerun/
│   └── GameRun.java       # Classe principal que inicia o jogo
└── jogodavelha/
    └── GameManager.java   # Controla a lógica do jogo
```

## 🔧 Pré-requisitos

- Java JDK 8 ou superior
- IDE Java (Eclipse, IntelliJ, NetBeans, etc) ou linha de comando

## 🚀 Como Compilar e Executar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/jogo-velha.git
cd jogo-velha
```

2. Compile o projeto:
```bash
javac gamerun/GameRun.java
```

3. Execute o jogo:
```bash
java gamerun.GameRun
```

## 🎮 Como Jogar

1. O jogo começa com o jogador 'X'
2. Digite um número de 1 a 9 para fazer sua jogada
3. As posições do tabuleiro são numeradas assim:
```
 1 | 2 | 3 
-----------
 4 | 5 | 6 
-----------
 7 | 8 | 9 
```
4. Os jogadores alternam turnos até que alguém vença ou ocorra empate

## 📺 Exemplo de Execução

```
 - | - | -
----------
 - | - | -
----------
 - | - | -

Digite um valor de 1-9: 5
 - | - | -
----------
 - | X | -
----------
 - | - | -

Digite um valor de 1-9: 1
 O | - | -
----------
 - | X | -
----------
 - | - | -

[...]

 O | X | O
----------
 - | X | -
----------
 - | X | -

Jogador X venceu!
```

## 🔍 Classes Principais

### Board
- Gerencia o estado do tabuleiro
- Implementa a visualização do jogo
- Controla as posições das jogadas

### GameManager
- Controla o fluxo do jogo
- Verifica condições de vitória e empate
- Gerencia a alternância de jogadores
- Valida as jogadas

### GameRun
- Classe principal que inicializa o jogo
- Cria a instância do GameManager
