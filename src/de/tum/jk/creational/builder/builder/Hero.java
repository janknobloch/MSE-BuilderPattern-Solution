package de.tum.jk.creational.builder.builder;

import de.tum.jk.creational.builder.enums.Armor;
import de.tum.jk.creational.builder.enums.HairColor;
import de.tum.jk.creational.builder.enums.HairType;
import de.tum.jk.creational.builder.enums.HeroType;
import de.tum.jk.creational.builder.enums.Weapon;

public class Hero {

	private HeroType heroType;
	private HairType hairType;
	private HairColor hairColor;
	private Armor armor;
	private Weapon weapon;
	private String name;

	public Hero(HeroBuilder heroBuilder) {
		heroType = heroBuilder.heroType;
		hairType = heroBuilder.hairType;
		hairColor = heroBuilder.hairColor;
		armor = heroBuilder.armor;
		weapon = heroBuilder.weapon;
		name = heroBuilder.name;
	}

	@Override
	public String toString() {
		return "Hero [heroType=" + heroType + ", hairType=" + hairType + ", hairColor=" + hairColor + ", armor=" + armor + ", weapon=" + weapon + ", name=" + name + "]";
	}

	
	
	
}
