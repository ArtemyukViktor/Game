
public class VivestyIgrovePole {
	
	Zminni zmin = new Zminni();
	
public void  Pole() {
	
	for (int i = 0; i < Zminni.pole.length; i++) {
		for (int j = 0; j < Zminni.pole[i].length; j++) {
			
			System.out.print(Zminni.pole[i][j]);
			if(j<Zminni.pole.length-1){
			System.out.print("|");}
		}System.out.println();
		
		if(i<Zminni.pole.length-1){System.out.println("----------");}
	  
	}
	
}
}
