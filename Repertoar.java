package pozoristance12092019;

import java.util.ArrayList;

public class Repertoar {
	private Pozoriste pozoriste;
	private ArrayList<Predstava> predstava = new ArrayList<Predstava>();

	public Repertoar(Pozoriste pozoriste) {
		this.pozoriste = pozoriste;
	}

	public void dodaj(Predstava p) {
		predstava.add(p);
	}

	public void ukloni(String imePredstave) {
		for (int i = 0; i < predstava.size(); i++) {
			if (predstava.get(i).getNaziv().equals(imePredstave)) {
				predstava.remove(i);
				return;
			} else {
				System.out.println("Predstave nema u ovom pozoristu");
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(pozoriste.getNaziv() + ": [\t");
		for (int i = 0; i < predstava.size(); i++) {
			sb.append(predstava.get(i).toString());
		}
		sb.append("\n]");
		return sb.toString();
	}
}
