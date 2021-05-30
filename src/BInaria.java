
public class BInaria {

	public static void main(String[] args) {
		int[] arreglo = { 1, 2, 3, 4, 5, 6 };
		Binario B = new Binario();
		int lugar = B.Binario(arreglo, 1);

		if (lugar != -1) {
			System.out.println(lugar);
		} else {
			System.out.println("NO FOUND");
		}

	}

}

class Binario {

	public int Binario(int[] arreglo, int elemento) {
		int centro, primero, ultimo, valorcentro;
		primero = 0;
		ultimo = arreglo.length - 1;

		while (primero <= ultimo) {
			centro = (primero + ultimo) / 2;
			valorcentro = arreglo[centro];

			if (elemento == valorcentro) {
				return centro;
			} else if (elemento < valorcentro) {
				ultimo = centro - 1;
			} else {
				primero = centro + 1;
			}

		}
		return -1;

	}

}
