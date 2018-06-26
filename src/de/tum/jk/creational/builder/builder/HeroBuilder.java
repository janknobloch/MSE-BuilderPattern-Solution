package de.tum.jk.creational.builder.builder;
import java.util.Random;

import de.tum.jk.creational.builder.enums.Armor;
import de.tum.jk.creational.builder.enums.HairColor;
import de.tum.jk.creational.builder.enums.HairType;
import de.tum.jk.creational.builder.enums.HeroType;
import de.tum.jk.creational.builder.enums.Weapon;


public class HeroBuilder {

	protected HeroType heroType;
	protected HairType hairType;
	protected HairColor hairColor;
	protected Armor armor;
	protected Weapon weapon;
	protected String name;

	public HeroBuilder(String name) {
		this.name = name;
	}

	public HeroBuilder withHeroType(HeroType heroType) {
		this.heroType = heroType;
		return this;
	}

	public HeroBuilder withHairType(HairType hairType) {
		this.hairType = hairType;
		return this;
	}

	public HeroBuilder withHairColor(HairColor hairColor) {
		this.hairColor = hairColor;
		return this;
	}

	public HeroBuilder withArmor(Armor armor) {
		this.armor = armor;
		return this;
	}

	public HeroBuilder withWeapon(Weapon weapon) {
		this.weapon = weapon;
		return this;
	}

	public HeroBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public Hero build() {
		initNullFieldsWithRandomValues();
		return new Hero(this);
	}

	private void initNullFieldsWithRandomValues() {

		if (heroType == null) {
			heroType = randomEnum(HeroType.class);
		}
		if (hairType == null) {
			hairType = randomEnum(HairType.class);
		}
		if (hairColor == null) {
			hairColor = randomEnum(HairColor.class);
		}
		if (armor == null) {
			armor = randomEnum(Armor.class);
		}
		if (weapon == null) {
			weapon = randomEnum(Weapon.class);
		}

	}

	public static <T extends Enum<?>> T randomEnum(Class<T> clazz) {
		Random random = new Random();
		int x = random.nextInt(clazz.getEnumConstants().length);
		return clazz.getEnumConstants()[x];
	}
}
