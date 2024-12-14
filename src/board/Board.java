package board;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {

	private List<Character> board = new ArrayList<>(Arrays.asList(
	            '-', '-', '-',
	            '-', '-', '-',
	            '-', '-', '-'));
	 
	public List<Character> getBoard() {
	        return board;
	}
	
	public Character get(int i) {
		return board.get(i);
	}
	
	public void set(int index, Character player) {
		board.set(index, player);
	}
	
	public void printBoard() {
		System.out.println(" " + board.get(0) + " | " + board.get(1) + " | " + board.get(2));
		System.out.println("----------");
		System.out.println(" " + board.get(3) + " | " + board.get(4) + " | " + board.get(5));
		System.out.println("----------");
		System.out.println(" " + board.get(6) + " | " + board.get(7) + " | " + board.get(8));
	}
	
}
