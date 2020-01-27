/**
 * 
 */
package main.java.com.cdmon;

/**
 * @author Alex
 *
 */
public class CDmon {

	/**
	 * 
	 */
	public CDmon() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Escribe, en el lenguaje de programación que desees, un programa que muestre
	 * en pantalla los números del 1 al 100, sustituyendo los múltiplos de 3 por el
	 * palabro “CD” y, a su vez, los múltiplos de 5 por “mon”. Para los casos que,
	 * al tiempo, son múltiplos de 3 y 5, utiliza el combinado “CDmon”.
	 */
	public void showNumbers() {
		StringBuffer sb;
		
		for (int i = 1; i < 101; i++) {
			sb = new StringBuffer();
			
			// Si es múltimo de 3 mostrar CD
			if (i % 3 == 0)
				sb.append("CD");
			
			// Si es múltimo de 5 mostrar mon
			if (i % 5 == 0)
				sb.append("mon");
			
			// Si es múltiple de ambos se mostrará CDmon
			
			// En caso que no haya coincidido con ser múltimo de 3 o 5 
			// muestro el número
			if (sb.length() == 0)
				sb.append(i);
			
			// Muestro el resultado final
			System.out.println(sb);
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CDmon cdmon = new CDmon();
		
		cdmon.showNumbers();
		

	}

}
