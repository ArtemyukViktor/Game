public class Porivnannya {

	public void porivnannya() {
		if (Zminni.count == 9) {
			Zminni.tr = false;
			System.out.println("Ничья");
		}

		for (int i = 0; i < Zminni.pole.length; i++) {

			if (Zminni.pole[i][0] == Zminni.aktivnyqGravech
					&& Zminni.pole[i][1] == Zminni.aktivnyqGravech
					&& Zminni.pole[i][2] == Zminni.aktivnyqGravech) {
				Zminni.tr = false;
				System.out.println("Победил" + Zminni.aktivnyqGravech);

			} else if (Zminni.pole[0][i] == Zminni.aktivnyqGravech
					&& Zminni.pole[1][i] == Zminni.aktivnyqGravech
					&& Zminni.pole[2][i] == Zminni.aktivnyqGravech) {
				Zminni.tr = false;
				System.out.println("Победил" + Zminni.aktivnyqGravech);
			}

		}
		if (Zminni.pole[0][0] == Zminni.aktivnyqGravech
				&& Zminni.pole[1][1] == Zminni.aktivnyqGravech
				&& Zminni.pole[2][2] == Zminni.aktivnyqGravech) {
			Zminni.tr = false;
			System.out.println("Победил" + Zminni.aktivnyqGravech);
		} else if (Zminni.pole[2][0] == Zminni.aktivnyqGravech
				&& Zminni.pole[1][1] == Zminni.aktivnyqGravech
				&& Zminni.pole[0][2] == Zminni.aktivnyqGravech) {
			Zminni.tr = false;
			System.out.println("Победил" + Zminni.aktivnyqGravech);
		}

	}
}
