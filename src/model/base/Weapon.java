package model.base;

public abstract class Weapon 
{
    public Weapon(String name, int damage, int minLevel) 
    {
        this.name = name;
        this.damage = damage;
        this.minLevel = minLevel;
    }
    public int getDamage() 
    {
        return damage;
    }
    public int getMinLevel() 
    {
        return minLevel;
    }
    public String getName() 
    {
        return name;
    }
    private int damage;
    private int minLevel;
    private String name;
}
