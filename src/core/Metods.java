package core;

public class Metods {
	public static void main(String[] args) {

		
		int[] mas = {1, 2, 3, 4, 5, 6};
				
		getZeroMas (mas);
		int [] mas2 = getZeroMas(mas);
		for (int i=0; i<mas2.length; i++) {
			System.out.println(mas[i]);
		}
	}
	
	public static int[] getZeroMas(int [] anyMas) {
		int [] result = new int [anyMas.length];
		for (int i=0; i<anyMas.length; i++) {
			if (i%2==0)
			{
				result [i]= 0;
			} else {
				result [i]= anyMas[i];
			}
			
		}
		return result;
	}
	
	
}
