
public class TrianguloReversa {

	public static void main(String[] args) {
		System.out.println("================== For Estrellas Reversa ===============");
		int estrella = 5;
		for(int increment = 1; increment <= estrella; increment++) {
			for(int n = 1; n <= increment; n++) {
				System.out.print("*");
			}//for n
			System.out.println("");
		}// for increment

	}//main

}// for triangulo reversa
