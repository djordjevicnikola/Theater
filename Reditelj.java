package pozoristance12092019;

public class Reditelj extends Zaposleni {

	public Reditelj(String ime, Pozoriste pozoriste) {
		super(ime, pozoriste);
	}

	@Override
	public String imePosla() {
		return "Reditelj";
	}

}
