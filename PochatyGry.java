/**
 * 
 * @author Administrator
 *  Заполнение матрыцы 3х3 пустыми значениями и ее вывод
 */
public class PochatyGry {

	VivestyIgrovePole dd = new VivestyIgrovePole();

	public void VyvesyuPoleOdynRaz() {

		for (int i = 0; i < Zminni.pole.length; i++) {
			for (int j = 0; j < Zminni.pole[i].length; j++) {
				Zminni.pole[i][j] = Zminni.puste;
				System.out.print(Zminni.pole[i][j]);
				if (j < Zminni.pole.length - 1) {
					System.out.print("|");
				}
			}
			System.out.println();

			if (i < Zminni.pole.length - 1) {
				System.out.println("----------");
			}

		}
		Zminni.aktivnyqGravech = Zminni.xpestik;

	}
}
