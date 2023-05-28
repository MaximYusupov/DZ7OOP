package model.charaters;

import model.base.Armor;
import model.base.Weapon;
import model.charaters.base.Mage;
import model.weapons.Hands;

public class WhiteMage extends Mage 
{
    public WhiteMage(String name, Armor armor) 
    {
        super(name, new Hands(), armor);
    }
}
