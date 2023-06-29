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

    ProductService product = ProductService.getInstace();
    
    JFrame frame = null;
    JLabel label = null;
    Container c = null;
    
	public void run() {
        frame = new JFrame("상품 주문");

        c = frame.getContentPane();

        label = new JLabel("상품 주문 현황");
        c.add(label);
        
        label.setFont(new Font(null, 0, 32));
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.setLocation(1000, 200);
        frame.setPreferredSize(new Dimension(500, 200));
        frame.pack();
		
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void retext() {
		for (int i = 0; i < product.order.size(); i++) {
	        
			productDTO dto = (productDTO) product.order.get(i)[0];
			int count = (int) product.order.get(i)[1];
			int price = dto.getPrice();

	        label.setText((i + 1) + ". " + dto.getpName() + " 상품, " + count + " 개 : " + (count * price) + " 원\n");
		}
	}
}
