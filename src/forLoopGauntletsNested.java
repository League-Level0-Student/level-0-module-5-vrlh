import org.omg.Messaging.SyncScopeHelper;

public class forLoopGauntletsNested {
public static void main(String[] args) {
	for (int i = 0; i<3; i++) {
		for (int a = 0; a<3; a++) {
			System.out.println(i + " " + a);
		}
	}
	
	for(int row = 1; row < 10; row+=3) {
		System.out.print(row + " ");
		for(int col = 1; col < 3; col++) {
			System.out.print(row+col + " ");
		}
		System.out.println();
	}
	for(int rowa = 1; rowa < 100; rowa+=10) {
		System.out.print(rowa + " ");
		for(int cola = 1; cola < 10; cola++) {
			System.out.print(rowa+cola + " ");
		}
		System.out.println();
	}
		for (int b = 0; b < 7; b++) {
			String s = "*";
			for (int c = 0; c < b; c++) {
			System.out.print(s);
			}
			System.out.println();
		}
		for (int d = 0; d < 101; d++) {
			System.out.println(100-d);
		}
		
	
}
}
