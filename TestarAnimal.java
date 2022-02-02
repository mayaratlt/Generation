package Heranca;

public class TestarAnimal {

	public class Exheranca {
		
		
		public static void main(String[] args) {
				
				Cachorro dog1 = new Cachorro("Sirius", 2, true, "anda", "husky.");
				Cavalo cav = new Cavalo("Jorge", 6, true, "galopa", "preto.");
				Preguica pre = new Preguica("Berg", 4, false, "dorme", "cinza.");
				

				dog1.infoCachorro();
				System.out.println();
				cav.infoCavalo();
				System.out.println();
				pre.infoPreguica();
			}

		}
}
