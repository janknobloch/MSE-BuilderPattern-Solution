package de.tum.jk.creational.builder;

import de.tum.jk.creational.builder.builder.Hero;
import de.tum.jk.creational.builder.builder.HeroBuilder;
import de.tum.jk.creational.builder.enums.Armor;
import de.tum.jk.creational.builder.enums.HairColor;

public class BuilderMain {

	public static void main(String[] args) {

		System.out.println("select a name, rest all random..");
		for (int i = 0; i < 10; i++) {
			Hero h = new HeroBuilder("Jan").build();
			System.out.println(h);
		}
		System.out.println("all advanced armor and blue hair rest is random..");
		for (int i = 0; i < 10; i++) {
			Hero h = new HeroBuilder("Jan").withArmor(Armor.Advanced).withHairColor(HairColor.Blue).build();
			System.out.println(h);
		}

	}
}
