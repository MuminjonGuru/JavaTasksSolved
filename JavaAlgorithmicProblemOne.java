import java.util.Scanner;

public class JavaAlgorithmicProblemOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = Long.parseLong(sc.next());
		long q=1, w=0, i=2, j=0, t=a, f;
		int h=0;
		long aa[] = new long[10000];
		while(h < 10000) {
			f = 2;
			while(f <= Math.sqrt(i)) {
				if(i % f == 0) {
					w = 1;
					break;
				}
				f++;
			}
			if(w == 0) {
				aa[h] = i; 
				h++;
			}
			w = 0;
			i++;
		}
		h = 0;
		while((aa[h] <= Math.sqrt(t)) && (a != 1)) {
			if((a % aa[h] == 0)) {
				a = a / aa[h];
				w=1;
				j++;
			} else {
				if(w == 1) 
					q = q * (j+1);
				j = 0;
				w = 0;
				h++;
			}
		}
		if(w == 1) 
			q = q * (j + 1);
		if(t == 1)
			System.out.println(1);
		else if(q == 1)
			System.out.println(2);
		else
			System.out.println(q);
		
		sc.close();
			
	}

}




















