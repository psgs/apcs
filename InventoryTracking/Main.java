import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
	}
	
	public static String lookupMedia(ArrayList<MusicMedia> catalog, String sku) {
		for(MusicMedia media : catalog) {
			if(media.getSKU().equalsIgnoreCase(sku)) {
				return media.toString();
			}
		}
		
		return "SKU not found...";
	}
	
}
