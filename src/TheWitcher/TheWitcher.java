package TheWitcher;

public class TheWitcher {
	private String name;
	private int health;
	private boolean isDead;
	private boolean hasSoul;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public boolean isHasSoul() {
		return hasSoul;
	}

	public void setHasSoul(boolean hasSoul) {
		this.hasSoul = hasSoul;
	}

	public boolean isDead() {
		if(health==0) {
			return true;
		}else if (!hasSoul){
			return  true;
		}else {
			return false;
		}
	}

	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}
}
