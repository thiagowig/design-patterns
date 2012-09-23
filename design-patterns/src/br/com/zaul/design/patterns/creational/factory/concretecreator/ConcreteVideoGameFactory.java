package br.com.zaul.design.patterns.creational.factory.concretecreator;

import br.com.zaul.design.patterns.creational.factory.VideoGameType;
import br.com.zaul.design.patterns.creational.factory.concreteproduct.Playstation3;
import br.com.zaul.design.patterns.creational.factory.concreteproduct.Xbox;
import br.com.zaul.design.patterns.creational.factory.creator.VideoGameFactory;
import br.com.zaul.design.patterns.creational.factory.product.VideoGame;

public class ConcreteVideoGameFactory implements VideoGameFactory {

	@Override
	public VideoGame createVideoGame(VideoGameType videoGameType) {

		if (videoGameType.equals(VideoGameType.PLAYSTATION_3)) {
			return new Playstation3();
			
		} else if (videoGameType.equals(VideoGameType.XBOX)) {
			return new Xbox();
		}

		return null;
	}

}
