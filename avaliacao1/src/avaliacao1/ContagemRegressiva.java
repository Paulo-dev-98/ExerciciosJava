package avaliacao1;

import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.JOptionPane;

public class ContagemRegressiva {
	
	 public static void main(String args[]) {
		    Rectangle r1 = new Rectangle();
		    r1.setSize(new Dimension(100, 100));
		    Rectangle r2 = r1;
		    r2.setSize(new Dimension(200, 200));
		    System.out.println(r1);
		    System.out.println(r2);
		  }

}
