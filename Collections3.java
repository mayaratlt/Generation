package Familia44;

public class Collections3 {

	public static int[] vetorInvertido(int[] vet) {
	    int tamanho = vet.length;
	    int[] vetInvert = new int[tamanho];
	    for (int i = 0; i < tamanho; i++) {
	        vetInvert[tamanho - 1 - i] = vet[i];
	    }
	    return vetInvert;
	}
}
