
import javax.swing.JFrame;


class iHungryBurgerShop extends JFrame{
    public iHungryBurgerShop(){
        setTitle("iHungryBurgerShop");
        setSize(700,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    //main method
    public static void main(String args[]){
        new iHungryBurgerShop();
    }
}