package Polimorfismo;


public class Celular extends Telefone {

	public Celular()
	{
		super("Telefone Celular");
}
	
	@Override
	public void toca(int codigoToque)
	   {
		switch(codigoToque)
		{
		case 1:
			System.out.println("\nTan�n�n� tan�n�");
			break;
		case 2:
			System.out.println("\nPan�n�...pan�n�");
			break;
			default:
				System.out.println("\nTin�n�...n�nini");
		}
}
	
	         @Override
	              public void disca(String numero)
	                {
		           System.out.println("\nO n�mero: "+numero+" � um celular...");
}
}

