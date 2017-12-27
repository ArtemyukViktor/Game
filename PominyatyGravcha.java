public class PominyatyGravcha {

	public void pominyatyGravcha() {

		if (Zminni.error == true) {

			Zminni.count++;
			if (Zminni.aktivnyqGravech == Zminni.xpestik) {
				Zminni.aktivnyqGravech = Zminni.nolik;

			} else {
				Zminni.aktivnyqGravech = Zminni.xpestik;

			}
		}
	}

}
