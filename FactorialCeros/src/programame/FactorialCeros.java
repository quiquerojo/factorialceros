
package programame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author quiquerojo
 *
 */
public class FactorialCeros {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n5 = 0;
		
		int nLineas = 0;
		int num = 0;
		
		try {
			nLineas = Integer.parseInt(br.readLine());
			for (int i = 0; i < nLineas; i++) {
				num = Integer.parseInt(br.readLine());
				n5 = numDe5(num);
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
	
	public static int numDe5(int n){
		int total = 0;
		for (int i = 5; i <= n; i+=5){//de 5 en 5
			total += num5(i);
		}
		
		return total;	
	}
	
public static int num5(int n){//calcula el número de factores 5 que tiene
	int c = 0;
	while (n >= 5){
		c++;
		n = n/5;
	}
	return c;
	
	}

}
