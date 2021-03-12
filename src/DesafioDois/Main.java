package DesafioDois;
public class Main {

	public static void main(String[] args) {

		DesafioDois desafioDois = new DesafioDois();
		int resultado = desafioDois.countNumbers(new int[] {1,3,5,7}, 4);
		int resultado2 = desafioDois.countNumbers(new int[] {1,2,3,4}, 4);
		System.out.println(resultado);
		System.out.println(resultado2);
	}
}