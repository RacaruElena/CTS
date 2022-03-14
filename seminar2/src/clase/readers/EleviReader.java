package clase.readers;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import clase.Aplicant;
import clase.Elev;

public class EleviReader extends IReader{
	public EleviReader(String numeFisier) throws FileNotFoundException {
		super(numeFisier);
	}

	@Override
	public List<Aplicant> readAplicanti() throws FileNotFoundException {
		scanner.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();

		while (scanner.hasNext()) {
			Elev elev = new Elev();
			super.citireAplicant(scanner, elev);
			int clasa = scanner.nextInt();
			String tutore = scanner.next();
			elev.setTutore(tutore);
			elev.setClasa(clasa);
			elevi.add(elev);
		}

		scanner.close();
		return elevi;
	}

}
