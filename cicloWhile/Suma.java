package cicloWhile;

public class Suma {
	public static void main(String[] args) {
        int suma = 0;
        int numero = 1;
        while (numero <= 10) {
        	//+=
            suma= suma +  numero;
            numero++;
        }
        System.out.println("La suma de los primeros 10 números naturales es: " + suma);
    }
}
