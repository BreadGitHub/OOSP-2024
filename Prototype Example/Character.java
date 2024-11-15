public class Character implements Prototype {
    //Cloneable позволяет контролировать как именно копируется объект
    protected String name;
    protected int health;
    protected int attack;

    public Character (String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    @Override
    public Prototype clone()  {
        return new Character(name, health, attack); 
    }

    @Override
    public String displayStats() {
        return ("Name: " + name + " health: " + health + " attack: " + attack);
    }
}