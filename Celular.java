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
			System.out.println("\nTanãnãnã tanãnã");
			break;
		case 2:
			System.out.println("\nPanãnã...panãnã");
			break;
			default:
				System.out.println("\nTinãnã...nãnini");
		}
}
	
	         @Override
	              public void disca(String numero)
	                {
		           System.out.println("\nO número: "+numero+" é um celular...");
}
}

