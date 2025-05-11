package abstract_class.game_level;

public abstract class PlayerLevel {
	//추상메서드
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMassage();
	
	//템플릿 메서드
	final public void go(int count) {
		run();
		for(int i=0;i<count;i++) {
			jump();//횟수가 있음
		}
		jump();
		turn();
	}
	

}
