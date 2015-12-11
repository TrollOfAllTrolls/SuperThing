import java.util.ArrayList;

public class ALPractice {

	public static void main(String[] args) {
		ArrayList<String> Memes = new ArrayList<String>();
		Memes.add("u m@d brUh");
		Memes.add("r3kT");
		Memes.add("U w0t m9");
		Memes.add("lMa0");
		Memes.add("D@@@22@@2@yum");
		for (int i = 0; i < Memes.size(); i++) {
			System.out.println(Memes.get(i));
		}
		ArrayList<Pretzel>PretzelThing = new ArrayList<Pretzel>();
		PretzelThing.add(new Pretzel("Pretzel Pesant"));
		PretzelThing.add(new Pretzel("Pretzel Soldier"));
		PretzelThing.add(new Pretzel("Pretzel Officer"));
		PretzelThing.add(new Pretzel("Pretzel King"));
		PretzelThing.add(new Pretzel("Pretzel Lord"));
		PretzelThing.add(new Pretzel("Pretzel OverLord"));
		PretzelThing.add(new Pretzel("Pretzel God"));
		PretzelThing.add(new Pretzel("Pretzel OverGod"));
		PretzelThing.add(new Pretzel("Dank Pretzel"));
		for (int j = 0; j < PretzelThing.size(); j++) {
			System.out.println(PretzelThing.get(j).getName());
		}
		ArrayList<Star>Starz = new ArrayList<Star>();
		Starz.add(new Star(143245345, "Dank'ie"));
		Starz.add(new Star(435353531, "LMAO'ie"));
		Starz.add(new Star(243542347, "Pretzel'ie"));
		Starz.add(new Star(121120389, "R3kt'ie"));
		Starz.add(new Star(102938464, "Shrekt'ie"));
		for (int k = 0; k < Starz.size(); k++) {
			System.out.println(Starz.get(k));
		}
		for(Star l : Starz){
			System.out.println(l);
		}
	}
}
