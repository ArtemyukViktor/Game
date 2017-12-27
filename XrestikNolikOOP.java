public class XrestikNolikOOP {

	public static void main(String[] args) {

		PochatyGry pocGry = new PochatyGry();
		pocGry.VyvesyuPoleOdynRaz();

		do {
			System.out.println("Ходит " + Zminni.aktivnyqGravech);
			VvedenyaVidKotystyvatha vvod = new VvedenyaVidKotystyvatha();
			vvod.vvedenyaVidKotystyvatha();
			VivestyIgrovePole ig = new VivestyIgrovePole();
			ig.Pole();
			Zminni.tr = true;
			Porivnannya poriv = new Porivnannya();
			poriv.porivnannya();
			PominyatyGravcha zaminaGravtca = new PominyatyGravcha();
			zaminaGravtca.pominyatyGravcha();

		} while (Zminni.tr != false);

	}

}
