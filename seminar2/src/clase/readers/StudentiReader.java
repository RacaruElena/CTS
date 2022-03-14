package clase.readers;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import clase.Aplicant;
import clase.Student;

public class StudentiReader extends IReader{
	public StudentiReader(String numeFisier) throws FileNotFoundException {
		super(numeFisier);
	}

	@Override
	public List<Aplicant> readAplicanti() throws FileNotFoundException {
		super.scanner.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<Aplicant>();

		while (super.scanner.hasNext()) {
			Student student = new Student();
			super.citireAplicant(super.scanner, student);
			int anStudii = super.scanner.nextInt();
			String facultate = (super.scanner.next());
			student.setAnStudii(anStudii);
			student.setFacultate(facultate);
			studenti.add(student);
		}
		super.scanner.close();
		return studenti;
	}

}
