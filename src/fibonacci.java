
public class fibonacci {
public static void main(String[] args) {
	int a = 0;
	int b = 1;
	System.out.println(a);
	for (int i = 0; i<12; i++){
	a=a+b;
	int temp = 0;
	temp = a;
	a=b;
	b=temp;
	System.out.println(a);
	}
}
}
