package model.charaters;

import model.armors.LightArmor;
import model.base.Armor;
import model.base.Weapon;
import model.charaters.base.Figter;
import model.weapons.Sword;

public class Paladin extends Figter 
{
    public Paladin(String name, Sword weapon, LightArmor armor) 
    {
        super(name, weapon, armor);
    }
}
