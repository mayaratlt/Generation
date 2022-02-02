package Heranca;

public class Preguica extends Animal{
	
	private String corPelo;

	public Preguica(String nomeAnimal, int idadeAnimal, boolean emiteSom, String deslocamento, String corPelo) {
		super(nomeAnimal, idadeAnimal, emiteSom, deslocamento);
		this.corPelo = corPelo;
		
	}
	
	public void infoPreguica() {
		System.out.print(getNomeAnimal()+" é uma preguiça e tem "+getIdadeAnimal()+" anos, ");
		if(isEmiteSom()) {
			System.out.print("gruni");
		} else {
			System.out.print("não emite som");
		}
		System.out.println(", "+getDeslocamento()+" o tempo todo e é da cor "+corPelo);
	}

}
	