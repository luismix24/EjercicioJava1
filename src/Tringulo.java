
public class Tringulo {

	public static void main(String[] args) {
		System.out.println("================== For Estrellas ===============");
		int estrella = 5;
		for(int increment = estrella; increment >= 1; increment--) {
			for(int n = 1; n <= increment; n++) {
				System.out.print("*");
			}//for n
			System.out.println("");
		}// for increment

	}//main

	}// Triangulos
