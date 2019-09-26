package pozoristance12092019;

public class Pozoriste {
	private int id;
	private static int idGlobal = 1;
	private String naziv;

	public Pozoriste(String naziv) {
		this.naziv = naziv;
		this.id = idGlobal;
		idGlobal++;
	}

	public int getId() {
		return id;
	}

	public String getNaziv() {
		return naziv;
	}

	public String getSkraceniNaziv() {
		String[] niz = naziv.split(" ");
		String skraceniNaziv = "";
		for (int i = 0; i < niz.length; i++) {
			String prvoSlovo = Character.toString(niz[i].charAt(0));
			skraceniNaziv += prvoSlovo;
		}
		return skraceniNaziv.toUpperCase();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(naziv + " [" + id + "]");
		return sb.toString();
	}

}
