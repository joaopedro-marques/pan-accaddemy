package operadores;

public class PegarMaxMin {
	public static void main(String[] args) {
		
		//aquecimento 1
		System.out.println("M�ximo: " + Math.max(5, 10));
		System.out.println("M�nimo: " + Math.min(5, 10));
		
		
		//ceil arredonda para cima
		//arredonda para cima
		double a = 3.5;
		System.out.println("ceil arr. para cima: " + Math.ceil(a));
		System.out.println("ceil arr. para cima: " + Math.floor(a));
		
		
		//inicia com array
		int[] arr = {4, 2, 5, 3, 6};
		
		//inicia com zero
		int max = arr[0];
		
		//for
		
		for (int i =1; i<arr.length; i++) {
			
			max = Math.max(max,  arr[i]);
			
		}
		System.out.println("Maximo: " + max);
		
	}
}
