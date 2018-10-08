import javax.swing.JOptionPane;

public class primeOrNot {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
String num = JOptionPane.showInputDialog(null, "Give me a random number");
int n = Integer.parseInt(num);
for (int i = 2; i < 4; i++) {
	int x = n%i;
	if (x == 0) {
		JOptionPane.showMessageDialog(null, n + " is not a prime number");
		break;
	}
	
	
}
JOptionPane.showMessageDialog(null, n + " is a prime number");
	
}
}
