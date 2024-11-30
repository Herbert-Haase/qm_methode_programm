import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public final class QMMethode {
	private QMMethode() {
	}

	public static Collection minterme(int... minterme) {
		// amount of binary digits
		Arrays.sort(minterme);
		String binary = Integer.toBinaryString(minterme[minterme.length - 1]);
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] gGroup = new ArrayList[binary.length() + 1];

		// create an array of ArrayLists to hold the groups
		for (int i = 0; i < binary.length() + 1; i++) {
			gGroup[i] = new ArrayList<>();
		}
		// sort minterme
		for (int term : minterme) {
			int index = Integer.bitCount(term);
			gGroup[index].add(term);
		}
		return gGroup;
	}

	public static Collection implicanten(Collection<> minterme) {
		for (Object gGruppe : minterme) {
			for (int term : gGruppe) {

			}
		}
	}
}
