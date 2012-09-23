package br.com.zaul.design.patterns.creational.factory.client;

import br.com.zaul.design.patterns.creational.factory.VideoGameType;
import br.com.zaul.design.patterns.creational.factory.concretecreator.ConcreteVideoGameFactory;
import br.com.zaul.design.patterns.creational.factory.creator.VideoGameFactory;
import br.com.zaul.design.patterns.creational.factory.product.VideoGame;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VideoGameFactory videoGameFactory = new ConcreteVideoGameFactory(); 
		
		VideoGame videoGame = videoGameFactory.createVideoGame(VideoGameType.PLAYSTATION_3);
		videoGame.play();
		
		videoGame = videoGameFactory.createVideoGame(VideoGameType.XBOX);
		videoGame.play();
	}

}
