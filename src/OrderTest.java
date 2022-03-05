import javax.swing.*;

public class OrderTest {
    public static void main(String []args){
        JFrame f=new JFrame();

        JButton checkButton= new JButton("Check");
        checkButton.setBounds(50,900,100, 25);
        JButton addButton = new JButton("Add");
        addButton.setBounds(250, 900, 100, 25);
        JButton showButton = new JButton("Show");
        showButton.setBounds(450, 900, 100, 25);

        f.setTitle("OrderTest/Forward");
        f.add(checkButton);
        f.add(addButton);
        f.add(showButton);
        f.setSize(1000,1000);
        f.setLayout(null);
        f.setVisible(true);
    }
}
