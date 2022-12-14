package myLambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda_game {
	public static void main(String[] args) {
		Game footbal = new Game(){
			public void play(){
				System.out.println("am playing football");
			}
		};
		Game cricket = new Game(){
			public void play(){
				System.out.println("am playing cricket");
			}
		};
		
		Game footbalLambda =()->
				System.out.println("am playiong footbal");
		Series odiSeries = (type)->
				System.out.println("it's Odi"+type);
		cricket.play();
		footbal.play();
		odiSeries.play("something");
		
		
		List<String>players = Arrays.asList("Abab","Sfskf","Isfdfs","Pkjnd");
		
		players
				.stream()
				.filter(player-> player.equals("Isfdfs"))
				.forEach(System.out::println);
		
		
		players
				.stream()
				.filter(player->player.equals("Isfdfs"))
				.forEach(player-> System.out.println("yes, he is here"));
				
		
	}
}
@FunctionalInterface
interface Game{
	void play();
}
@FunctionalInterface
interface Series{
	void play(String type);
}
