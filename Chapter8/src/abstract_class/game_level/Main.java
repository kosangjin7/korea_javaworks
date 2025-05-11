package abstract_class.game_level;

public class Main {

	public static void main(String[] args) {
		
		//초보자 객체 생성
		Player player=new Player();
		player.play(1);
		
		//중급자 객체 생성
		AdvancedLevel alevel=new AdvancedLevel();
		player.setLevel(alevel);
		player.play(2);
		
		//고급자 객체 생성
		SuperLevel sLevel=new SuperLevel();
		player.setLevel(sLevel);
		player.play(3);
				
	}

}
