
public class CasetteTape extends MusicMedia {
	
	public CasetteTape(String title, String artist, String SKU) {
		super(title, artist, SKU);
	}

	public String getMediaType() {
		return "Cassette";
	}
	
	public String toString() {
		return this.getMediaType() + " - " + super.basicToString();
	}
}
