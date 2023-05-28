package model.base;

import model.weapons.Hands;

import java.util.Random;

public abstract class Character  // Базовый класс персонажа
{
    public Character(String name, Weapon weapon, Armor armor) 
    {
        this.name = name;
        this.wp = weapon;
        this.armor = armor;
        level = 0;
        healthPoints = 100;
        maxHP = 100;
        manaPoints = 100;
        maxMana = 100;
        experience = 0;
        maxXP = levelUp[level];
    }

    public int getLevel() 
    {
        return level;
    }

    public Armor getArmor() 
    {
        return armor;
    }

    public int getHealthPoints() 
    {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) 
    {
        this.healthPoints = increaseVal(this.healthPoints, healthPoints, maxHP);
    }

    public int getMaxHP() 
    {
        return maxHP;
    }

    public int getManaPoints() 
    {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) 
    {
        this.manaPoints = increaseVal(this.manaPoints, manaPoints, maxMana);
    }

    public int getMaxMana() 
    {
        return maxMana;
    }

    public int getExperience() 
    {
        return experience;
    }

    public void setExperience(int experience) 
    {
        this.experience = increaseVal(this.experience, experience, maxXP);
    }

    public int getMaxXP() 
    {
        return maxXP;
    }

    public String getName() 
    {
        return name;
    }

    private String name;
    private int level;
    private Armor armor;
    private int healthPoints;
    private int maxHP;
    private int manaPoints;
    private int maxMana;
    private int experience;
    private int maxXP;

    private Weapon wp = new Hands();

    public void attack(Character target) 
    {
        var rnd = new Random();
        target.setDamage(rnd.nextInt(0, wp.getDamage()) + level * wp.getDamage() / 7);
    }

    public int setDamage(int damage) 
    {
        int damageMultiplier = damage / (damage + armor.getArmor());
        damage *= damageMultiplier;
        if (damage >= healthPoints)
            healthPoints = 0;
        else
            healthPoints -= damage;
        return healthPoints;
    }

    private static final int[] levelUp = {5, 10, 50, 100, 500, 1000, 5000, 10000}; // Массив с необходимым XP для перехода на следующий уровень

    public void updateLevel()  // Обновляяем левел персонажа
    {
        if (this.level < 8 && this.experience >= maxXP) // проверяем уровень персонажа
        {
            this.experience = this.experience - maxXP; // если очки XP чуть больше, чем требуется дл перехода, то переносим остатки на следующий уровень
            this.level++; // апаем левел
            maxXP = this.levelUp[this.level];
            maxHP += 10;
            maxMana += 10;
        }
    }

    private int increaseVal(int val, int inc, int limit) 
    {
        if (inc > 0)
            val += inc;
        if (val > limit)
            val = limit;
        return val;
    }
}
