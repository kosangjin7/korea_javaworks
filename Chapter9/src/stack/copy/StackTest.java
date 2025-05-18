package stack.copy;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// Coin객체
		Coin coin500=new Coin(500);
		Coin coin100=new Coin(100);
		
		//Stack자료형
		Stack<Coin> coinBox= new Stack<>();
		
		coinBox.push(coin500);
		coinBox.push(coin100);
		
		//System.out.println(coinBox.pop().getvalue);
		while(!coinBox.isEmpty()) {
			Coin coin=coinBox.pop();
			System.out.println("꺼내온 동전:"+coin.getValue()+"원");
		}
		
		

	}

}
