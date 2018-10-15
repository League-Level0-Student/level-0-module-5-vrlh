
public class forLoopGauntlets {
public static void main(String[] args) {
	for(int i=0; i < 101; i++) {
		System.out.println(i);
	}
	for (int a=100; a>-1; a -=1) {
		System.out.println(a);
	}
	for (int b=0; b <101; b++) {
		if (b%2==0) {
			System.out.println(b);
		}
	}
	for (int c=0; c<101; c++) {
		if (c%2==1) {
			System.out.println(c);
		}
	for (int d=0; d<501; d++) {
		if(d%2==0) {
			System.out.println(d + " even");
		}
		else if (d%2==1) {
			System.out.println(d + " odd");
		}
	}
	for (int e=0; e<778; e+=7) {
		System.out.println(e);
	}
	for (int f=2004; f<2019; f++) {
		int g = f-2004;
		
		System.out.println("In " + f + " i was " + g + " years old" );
	}
	}
}
}
