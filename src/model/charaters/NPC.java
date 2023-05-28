package model.charaters;

import model.armors.Tatters;
import model.base.Character;
import model.base.Weapon;
import model.weapons.Hands;

public class NPC extends Character 
{
    public NPC(String name) 
    {
        super(name, new Hands(), new Tatters());
    }
}
