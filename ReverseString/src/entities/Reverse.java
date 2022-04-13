package entities;

public class Reverse {
	private String string;

	public Reverse(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public String reverse() {
		String[] splitedString = string.split("");
		StringBuilder vector = new StringBuilder();

		for (int i = string.length() - 1; i >= 0; i--) {
			vector.append(splitedString[i]);
		}
		return vector.toString();
	}

	@Override
	public String toString() {
		return getString();
	}
}
