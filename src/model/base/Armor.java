package model.base;

public abstract class Armor 
{
    public Armor(String name, int armor, int minLevel) 
    {
        this.name = name;
        this.armor = armor;
        this.minLevel = minLevel;
    }
    public int getArmor() 
    {
        return armor;
    }
    public int getMinLevel() 
    {
        return minLevel;
    }
    public String getName() 
    {
        return name;
    }
    private int armor;
    private int minLevel;
    private String name;
}
