
import java.awt.*;
import javax.swing.*;



class iHungryBurgerShop extends JFrame{
    public iHungryBurgerShop(){
        setTitle("iHungryBurgerShop");
        setSize(700,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //title
        JLabel title=new JLabel("Welcome to Burgers"); 
        title.setFont(new Font("Arial",Font.BOLD,26));
        title.setForeground(Color.RED);
        title.setBounds(190,20,350,40);
        add(title);

        

        setVisible(true);
    }

    //main method
    public static void main(String args[]){
        new iHungryBurgerShop();
    }
}