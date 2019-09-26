package pozoristance12092019;

public class Kostimograf extends Zaposleni {

	public Kostimograf(String ime, Pozoriste pozoriste) {
		super(ime, pozoriste);
	}

	@Override
	public String imePosla() {
		return "Kostimograf";
	}

}
