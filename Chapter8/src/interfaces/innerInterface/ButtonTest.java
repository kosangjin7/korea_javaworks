package interfaces.innerInterface;

public class ButtonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Button button =new Button();
		
		button.setListener(new CallListener());
		button.touch();
	}

}
 