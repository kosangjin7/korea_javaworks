package interfaces.innerInterface;

public class Button {
	
	private OnClickListener listener;
	
	//내부 인터페이스
	interface OnClickListener{
		public void onClick();
	}
	
	public void setListener(OnClickListener listener) {
		this.listener=listener;
	}
	
	public void touch() {
		listener.onClick();
	}
	

}
