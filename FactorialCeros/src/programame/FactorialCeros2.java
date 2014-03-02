
package programame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author quiquerojo
 *
 */
public class FactorialCeros2 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n5 = 0;
		
		int nLineas = 0;
		int num = 0;
		
		try {
			nLineas = Integer.parseInt(br.readLine());
			for (int i = 0; i < nLineas; i++) {
				num = Integer.parseInt(br.readLine());
				n5 = numeroDe5(num);
				System.out.println(n5);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static int numeroDe5(int n){
		int total = 0;
		//contamos 1 por cada m�ltiplo de 5
		total = n/5;
		//sumamos las potencias de 5. 5^2 sumar�amos 2, pero como ya hemos sumado 1, sumamos n-1
		for (int i = 25,  exp =2; i <= n; i*=5,exp++){
			total += exp -1;
		}
		
		return total;	
	}
	

}
