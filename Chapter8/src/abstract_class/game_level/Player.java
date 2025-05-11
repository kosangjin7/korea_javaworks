package abstract_class.game_level;

public class Player {
	
	private PlayerLevel level;
	
	public Player() {
		level=new Beginner();
		level.showLevelMassage();
	}
	
	public void play(int count) {
		level.go(count);//탬플릿 메서드
		
	}
	//레벨설정
	public void setLevel(PlayerLevel level) {
		this.level=level;
		level.showLevelMassage();
	}

}
