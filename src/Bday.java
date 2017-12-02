import javax.swing.JOptionPane;

public class Bday {
public static void main(String[] args) {
	String bday = JOptionPane.showInputDialog("please state your birthday");
	if(bday.equals("12/3")){
		System.out.println("HAPPY BDAY");
	}
	else {
		System.out.println(" HAPPY UNbday");
	}
}
}

