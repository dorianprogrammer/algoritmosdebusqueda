import java.util.Arrays;

public class Hash {

	public static void main(String[] args) {

		String[] elementos = { "1234", "3342", "2143", "3410", "1322", "1324", "2156", "7100" };
		Hash2 h = new Hash2(1600);
		h.FuncionHash(elementos, h.arreglo);
//		h.mostrar();
		System.out.println(h.BuscarClave("3342"));

	}
}

class Hash2 {

	String[] arreglo;
	int tamano;

	public Hash2(int tamano) {
		super();
		this.arreglo = new String[tamano];
		this.tamano = tamano;
		Arrays.fill(arreglo, null);

	}

	public void FuncionHash(String[] cadenaarreglo, String[] arrglo) {
		int i;

		for (i = 0; i < cadenaarreglo.length; i++) {
			String elemento = cadenaarreglo[i];
			int indiceArreglo = Integer.parseInt(elemento) % (tamano - 1);
			System.out.println("INDICE ES " + indiceArreglo + " PARA ELEEMENTO " + elemento);

//			COLISIONES
			while (arrglo[indiceArreglo] != null) {
				indiceArreglo++;
				System.out.println(
						"COLICION EN EL INDICE " + (indiceArreglo - 1) + " CAMBIAR AL INDICE " + indiceArreglo);

				indiceArreglo %= (tamano);

			}
			arrglo[indiceArreglo] = elemento;

		}

	}

	public void mostrar() {
		int incremento = 0, i, j;

		for (i = 0; i < 1; i++) {
			incremento += 8;

			for (j = 0; j < 71; j++) {
				System.out.println("-");
			}
			System.out.println();
			for (j = incremento - 8; j < incremento; j++) {
				System.out.format("| %3s " + " ", j);
			}
			System.out.println("|");
			for (int n = 0; n < 71; n++) {
				System.out.println("-");
			}
			System.out.println();
			for (j = incremento - 8; j < incremento; j++) {
				if (arreglo[j].equals("-1")) {
					System.out.println("|  ");
				} else {
					System.out.print(String.format("| %3s " + " ", arreglo[j]));
					;
				}
			}
			System.out.println("|");
			for (j = 0; j < 71; j++) {
				System.out.println("-");
			}
			System.out.println();

		}

	}

//	BUSCAR 
	public String BuscarClave(String elemento) {
		int indiceArreglo = Integer.parseInt(elemento) % (tamano - 1);
		int contador = 0;

		System.out.println(arreglo[indiceArreglo]);
		while (arreglo[indiceArreglo] != null) {
			System.out.println("ENTRO");
			if (arreglo[indiceArreglo].equals(elemento)) {
				System.out.println("Elemento " + elemento + " encontrado en el indice " + indiceArreglo);
				return arreglo[indiceArreglo];
			}
			indiceArreglo++;
			indiceArreglo %= tamano;
			contador++;

			if (contador > (tamano - 1)) {
				break;
			}

		}
		return null;

	}

}
