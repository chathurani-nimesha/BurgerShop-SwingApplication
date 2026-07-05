
import java.awt.*;
import javax.swing.*;

public class BurgerShop extends JFrame {

    public BurgerShop() {

        setTitle("iHungry Burger Shop");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblTitle = new JLabel("iHungry Burger Shop");
        lblTitle.setBounds(180, 20, 350, 40);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 28));
        lblTitle.setForeground(Color.RED);
        add(lblTitle);

        JButton btnPlace = new JButton("Place Order");
        btnPlace.setBounds(250, 90, 200, 40);
        btnPlace.addActionListener(e -> placeOrder());
        add(btnPlace);

        JButton btnBest = new JButton("Search Best Customer");
        btnBest.setBounds(250, 140, 200, 40);
        add(btnBest);

        JButton btnOrder = new JButton("Search Order");
        btnOrder.setBounds(250, 190, 200, 40);
        add(btnOrder);

        JButton btnCustomer = new JButton("Search Customer");
        btnCustomer.setBounds(250, 240, 200, 40);
        add(btnCustomer);

        JButton btnView = new JButton("View Orders");
        btnView.setBounds(250, 290, 200, 40);
        add(btnView);

        JButton btnUpdate = new JButton("Update Order");
        btnUpdate.setBounds(250, 340, 200, 40);
        add(btnUpdate);

        JButton btnExit = new JButton("Exit");
        btnExit.setBounds(250, 390, 200, 40);
        btnExit.addActionListener(e -> System.exit(0));
        add(btnExit);

        setVisible(true);
    }

    public void placeOrder() {

        JFrame frame = new JFrame("Place Order");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        JLabel lblTitle = new JLabel("PLACE ORDER");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 22));
        lblTitle.setBounds(150, 20, 250, 30);
        frame.add(lblTitle);

        JLabel lblOrderId = new JLabel("Order ID");
        lblOrderId.setBounds(40, 80, 120, 25);
        frame.add(lblOrderId);

        JTextField txtOrderId = new JTextField("O001");
        txtOrderId.setBounds(170, 80, 200, 25);
        txtOrderId.setEditable(false);
        frame.add(txtOrderId);

        JLabel lblCustomerId = new JLabel("Customer ID");
        lblCustomerId.setBounds(40, 120, 120, 25);
        frame.add(lblCustomerId);

        JTextField txtCustomerId = new JTextField("C001");
        txtCustomerId.setBounds(170, 120, 200, 25);
        txtCustomerId.setEditable(false);
        frame.add(txtCustomerId);

        JLabel lblName = new JLabel("Customer Name");
        lblName.setBounds(40, 160, 120, 25);
        frame.add(lblName);

        JTextField txtName = new JTextField();
        txtName.setBounds(170, 160, 200, 25);
        frame.add(txtName);

        JLabel lblQty = new JLabel("Burger Quantity");
        lblQty.setBounds(40, 200, 120, 25);
        frame.add(lblQty);

        JTextField txtQty = new JTextField();
        txtQty.setBounds(170, 200, 200, 25);
        frame.add(txtQty);

        JLabel lblStatus = new JLabel("Order Status");
        lblStatus.setBounds(40, 240, 120, 25);
        frame.add(lblStatus);

        String status[] = {"PREPARING", "DELIVERED", "CANCELLED"};

        JComboBox cmbStatus = new JComboBox(status);
        cmbStatus.setBounds(170, 240, 200, 25);
        frame.add(cmbStatus);

        JLabel lblTotal = new JLabel("Net Total : Rs. 0.00");
        lblTotal.setBounds(170, 280, 200, 25);
        frame.add(lblTotal);

        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.setBounds(40, 330, 120, 35);
        frame.add(btnCalculate);

        JButton btnSave = new JButton("Save");
        btnSave.setBounds(180, 330, 90, 35);
        frame.add(btnSave);

        JButton btnBack = new JButton("Back");
        btnBack.setBounds(290, 330, 90, 35);
        frame.add(btnBack);

        btnCalculate.addActionListener(e -> {

            String qtyText = txtQty.getText();

            if (qtyText.equals("")) {
                JOptionPane.showMessageDialog(frame, "Enter Burger Quantity");
                return;
            }

            for (int i = 0; i < qtyText.length(); i++) {

                if (!Character.isDigit(qtyText.charAt(i))) {
                    JOptionPane.showMessageDialog(frame, "Quantity must be numeric");
                    return;
                }

            }

            int qty = Integer.parseInt(qtyText);

            if (qty <= 0) {
                JOptionPane.showMessageDialog(frame, "Quantity must be greater than 0");
                return;
            }

            double total = qty * 500;

            lblTotal.setText("Net Total : Rs. " + total);

        });

        btnSave.addActionListener(e -> {

            JOptionPane.showMessageDialog(frame,
                    "Order Saved Successfully!");

        });

        btnBack.addActionListener(e -> frame.dispose());

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new BurgerShop();
    }
}
