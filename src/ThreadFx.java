import java.util.*;
import java.awt.*;
import javax.swing.*;

import product.*;

public class ThreadFx extends Thread {
	private static ThreadFx instance = null;
	private ThreadFx() {}
	public static ThreadFx getInstance() {
		if (instance == null) instance = new ThreadFx();
		return instance;
	}
	public static void delInstance() { instance = null; }
	
    private boolean flag = true;
    
	public void run() {
        ProductService product = ProductService.getInstace();
        
        JFrame frame = null;
        JLabel label = null;
        Container c = null;
        
		while (flag) {
            frame = new JFrame("상품 주문");

            c = frame.getContentPane();
            label = new JLabel("상품 주문 현황");

            // 반복문 추가
            c.add(label);
            label.setFont(new Font(null, 0, 32));
            label.setHorizontalAlignment(JLabel.CENTER);

            frame.setLocation(1000, 200);
            frame.setPreferredSize(new Dimension(500, 200));
            frame.pack();

            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
	
    public void setFlag(boolean flag) { this.flag = flag; }
<<<<<<< HEAD
}
=======
}
>>>>>>> c6957d120bd7acb673f9e83104868d236109399b
