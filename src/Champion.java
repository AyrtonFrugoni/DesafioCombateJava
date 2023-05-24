
public class Champion {

	
    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.setAttack(attack);
        this.armor = armor;
    }

    public void takeDamage(int damage) {
        int effectiveDamage = Math.max(damage - armor, 1);
        life -= effectiveDamage;
        if (life < 0) {
            life = 0;
        }
    }

    public boolean isDead() {
        return life == 0;
    }

    public String getStatus() {
        if (isDead()) {
            return name + ": 0 de vida (morreu)";
        } else {
            return name + ": " + life + " de vida";
            }
    }

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}
}
