package br.com.zaul.design.patterns.creational.factory.creator;

import br.com.zaul.design.patterns.creational.factory.VideoGameType;
import br.com.zaul.design.patterns.creational.factory.product.VideoGame;

public interface VideoGameFactory {

	VideoGame createVideoGame(VideoGameType videoGameType);
}
