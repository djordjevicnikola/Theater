package pozoristance12092019;

import java.util.ArrayList;

public class Predstava {
	private String naziv;
	private Pozoriste pozoriste;
	private ArrayList<Zaposleni> zaposleni = new ArrayList<Zaposleni>();
	private static int brK = 0;

	public Predstava(String naziv, Pozoriste pozoriste, Reditelj reditelj) {
		this.naziv = naziv;
		this.pozoriste = pozoriste;
		if (!reditelj.getPozoriste().getSkraceniNaziv().equals(pozoriste.getSkraceniNaziv())) {
			System.out.println("Reditelj nije iz ovog pozorista");
		} else {
			this.zaposleni.add(reditelj);
		}
	}

	public boolean dodaj(Glumac g) {
		if (!g.getPozoriste().getSkraceniNaziv().equals(pozoriste.getSkraceniNaziv())) {
			System.out.println("Glumac nije iz ovog pozorista");
			return false;
		} else {
			this.zaposleni.add(g);
			return true;
		}

	}

	public boolean dodaj(Kostimograf k) {
		if (!k.getPozoriste().getSkraceniNaziv().equals(pozoriste.getSkraceniNaziv())) {
			System.out.println("Kostimograf nije iz ovog pozorista");
			return false;
		} else if (brK < 3) {
			this.zaposleni.add(k);
			brK++;
			return true;
		} else {
			System.out.println("Moguce je ubaciti samo 2 kostimografa.");
			return false;
		}
	}

	public String getNaziv() {
		return naziv;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n  " + naziv + ": ");
		for (int i = 0; i < zaposleni.size(); i++) {
			sb.append("\n\t" + zaposleni.get(i).toString());
		}
		return sb.toString();
	}

}
