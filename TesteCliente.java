package Familia44;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Geraldo Vedrossi",1234);
		
		cliente1.comprar();
		
		System.out.println("\n"+cliente1.getInfo());}

   }


