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
	 * Escribe, en el lenguaje de programaci�n que desees, un programa que muestre
	 * en pantalla los n�meros del 1 al 100, sustituyendo los m�ltiplos de 3 por el
	 * palabro �CD� y, a su vez, los m�ltiplos de 5 por �mon�. Para los casos que,
	 * al tiempo, son m�ltiplos de 3 y 5, utiliza el combinado �CDmon�.
	 */
	public void showNumbers() {
		StringBuffer sb;
		
		for (int i = 1; i < 101; i++) {
			sb = new StringBuffer();
			
			// Si es m�ltimo de 3 mostrar CD
			if (i % 3 == 0)
				sb.append("CD");
			
			// Si es m�ltimo de 5 mostrar mon
			if (i % 5 == 0)
				sb.append("mon");
			
			// Si es m�ltiple de ambos se mostrar� CDmon
			
			// En caso que no haya coincidido con ser m�ltimo de 3 o 5 
			// muestro el n�mero
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
