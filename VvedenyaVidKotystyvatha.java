public class VvedenyaVidKotystyvatha {

	public void vvedenyaVidKotystyvatha() {

		System.out.println("������� ��� � �������");
		int ryad = Zminni.input.nextInt();
		int stovp = Zminni.input.nextInt();

		if (Zminni.pole[ryad][stovp] == Zminni.puste
				&& ryad <= Zminni.pole.length && stovp <= Zminni.pole.length) {
			Zminni.pole[ryad][stovp] = Zminni.aktivnyqGravech;
			Zminni.error = true;

		} else {
			System.out.println("������� " + ryad + " �� " + stovp
					+ " ��� �������");
			Zminni.error = false;
		}

	}
}
