package jogodavelha;

import java.util.Scanner;

import board.Board;

public class GameManager {
	
	Board board = new Board();
	Scanner entrada = new Scanner(System.in);

	Character currentPlayer = 'X';
	
	public void printBoard() {
        board.printBoard();
    }
	
	public void switchPlayer() {
		if(currentPlayer.equals('X')) {
			currentPlayer = 'O';
		} else {
			currentPlayer = 'X';
		}
	}
	
	public void playerInput() {
		
		System.out.print("Digite um valor de 1-9: ");
		int input = entrada.nextInt();
		
		if(input >= 1 && input <= 9 && board.get(input - 1).equals('-')) {
			board.set(input-1, currentPlayer);
		} else {
			System.out.println("Invalido");
			playerInput();
		}

	}
	
	public boolean checkWinner() {
        // Verifica as linhas, colunas e diagonais
        if ((board.get(0) == currentPlayer && board.get(1) == currentPlayer && board.get(2) == currentPlayer) || // Linha 1
            (board.get(3) == currentPlayer && board.get(4) == currentPlayer && board.get(5) == currentPlayer) || // Linha 2
            (board.get(6) == currentPlayer && board.get(7) == currentPlayer && board.get(8) == currentPlayer) || // Linha 3
            (board.get(0) == currentPlayer && board.get(3) == currentPlayer && board.get(6) == currentPlayer) || // Coluna 1
            (board.get(1) == currentPlayer && board.get(4) == currentPlayer && board.get(7) == currentPlayer) || // Coluna 2
            (board.get(2) == currentPlayer && board.get(5) == currentPlayer && board.get(8) == currentPlayer) || // Coluna 3
            (board.get(0) == currentPlayer && board.get(4) == currentPlayer && board.get(8) == currentPlayer) || // Diagonal principal
            (board.get(2) == currentPlayer && board.get(4) == currentPlayer && board.get(6) == currentPlayer)) { // Diagonal secundária
            System.out.println("Jogador " + currentPlayer + " venceu!");
            return true;
        }
        return false;
    }
	
	public boolean checkTie() {      
		boolean isFull = true;
        for (Character cell : board.getBoard()) {
            if (cell == '-') {
                isFull = false; 
                break;
            }
        }
        
        if (isFull) {
        	System.out.println("Empate! O jogo terminou em velha.");
        	return true;
        }
        return false;
	}
	
	public void runGame() {
        while (true) {
            printBoard();  
            playerInput(); 
            if(checkWinner() || checkTie()) {
            	printBoard();
            	break;
            }
            switchPlayer(); 
        }
    }
	
	
}
