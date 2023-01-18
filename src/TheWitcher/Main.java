package TheWitcher;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheWitcher brujo = new TheWitcher();
		brujo.setName("Carlos");
		brujo.setHealth(15);
		brujo.setHasSoul(true);
		if(brujo.isDead()){
			System.out.println(brujo.getName()+" esta muerto");
		}else {
			System.out.println(brujo.getName()+" esta vivo");
		}
	}

}
