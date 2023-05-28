package model.charaters;

import model.armors.EpicArmor;
import model.base.Armor;
import model.base.Weapon;
import model.charaters.base.Figter;
import model.weapons.Sword;

public class Knight extends Figter 
{
    public Knight(String name, Sword weapon, EpicArmor armor) 
    {
        super(name, weapon, armor);
    }
}
