import javax.swing.*;
import java.awt.*;

public class BurgerShop extends JFrame {

    public BurgerShop() {

        setTitle("iHungry Burger Shop");
        setSize(700,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblTitle = new JLabel("iHungry Burger Shop");
        lblTitle.setBounds(180,20,350,40);
        lblTitle.setFont(new Font("Arial",Font.BOLD,28));
        lblTitle.setForeground(Color.RED);
        add(lblTitle);

        JButton btnPlace = new JButton("Place Order");
        btnPlace.setBounds(250,90,200,40);
        add(btnPlace);

        JButton btnBest = new JButton("Search Best Customer");
        btnBest.setBounds(250,140,200,40);
        add(btnBest);

        JButton btnOrder = new JButton("Search Order");
        btnOrder.setBounds(250,190,200,40);
        add(btnOrder);

        JButton btnCustomer = new JButton("Search Customer");
        btnCustomer.setBounds(250,240,200,40);
        add(btnCustomer);

        JButton btnView = new JButton("View Orders");
        btnView.setBounds(250,290,200,40);
        add(btnView);

        JButton btnUpdate = new JButton("Update Order");
        btnUpdate.setBounds(250,340,200,40);
        add(btnUpdate);

        JButton btnExit = new JButton("Exit");
        btnExit.setBounds(250,390,200,40);
        btnExit.addActionListener(e -> System.exit(0));
        add(btnExit);

        setVisible(true);
    }

    public static void main(String[] args) {
        new BurgerShop();
    }
}