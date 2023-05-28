package model.charaters.base;

import model.base.Armor;
import model.base.Character;
import model.base.Weapon;

public abstract class Figter extends Character {
    public Figter(String name, Weapon weapon, Armor armor) {
        super(name, weapon, armor);
    }
}
