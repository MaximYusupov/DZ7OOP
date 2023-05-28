package model.charaters;

import model.armors.MagiciansRobe;
import model.base.Armor;
import model.base.Weapon;
import model.charaters.base.Mage;
import model.weapons.WizardsStaff;

public class BlackMage extends Mage 
{
    public BlackMage(String name, WizardsStaff weapon, MagiciansRobe armor) 
    {
        super(name, weapon, armor);
    }
}
