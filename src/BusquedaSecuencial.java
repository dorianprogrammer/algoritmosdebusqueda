
public class BusquedaSecuencial {

	public static void main(String[] args) {

		int[] arreglo = { 22, 33, 55, 11, 65 };

		Busqueda b = new Busqueda();
		int lugar = b.Secuencial(arreglo, 11);

		if (lugar != -1) {
			System.out.println(lugar);
		} else {
			System.out.println("NO FOUND");
		}

	}

}

class Busqueda {

	public int Secuencial(int arreglo[], int elemento) {
		int j;
		boolean selecionado = false;

		for (j = 0; j < arreglo.length && selecionado == false; j++) {
			if (elemento == arreglo[j]) {
				selecionado = true;
				return j;
			}
		}
		return -1;
	}

}
