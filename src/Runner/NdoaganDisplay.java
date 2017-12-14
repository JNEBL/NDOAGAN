package Runner;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class NdoaganDisplay extends JFrame{
	
	
	
	public NdoaganDisplay() {
		setTitle("N'Doagan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920, 1080);
        JPanel root = new JPanel();
        setContentPane(root);
        setVisible(true);
        
        
	}
}
