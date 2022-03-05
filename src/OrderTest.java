import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class OrderTest {

    /**
     JFrame f=new JFrame();

     JButton checkButton= new JButton("Check");
     checkButton.setBounds(50,900,100, 25);
     JButton addButton = new JButton("Add");
     addButton.setBounds(250, 900, 100, 25);
     JButton showButton = new JButton("Show");
     showButton.setBounds(450, 900, 100, 25);



     Object data[][]= {
     {1,"Jacket","Clothing","75", "In Magazine", "2020", "500",false},
     {2,"Red Jacket","Clothing","200","In Magazine","2021",  "200",false},
     {3,"Red Jacket Topolino","Clothing","30","In  Shipping","2021",  "200",false},
     {4,"Jacket","Clothing","75", "In Magazine", "2020", "500",false},
     {5,"Black Jacket","Clothing","200","In Magazine","2021",  "200", false},
     {6,"Black Jacket Topolino","Clothing","30","In  Shipping","2021",  "200", false},
     {7,"Jacket","Clothing","75", "In Magazine", "2020", "500",false},
     {8,"Blue Jacket","Clothing","200","In Magazine","2021",  "200",false},
     {9,"Blue Jacket Topolino","Clothing","30","In  Shipping","2021",  "200",false},
     {10,"Jacket","Clothing","75", "In Magazine", "2020", "500",false},
     {11,"White Jacket","Clothing","200","In Magazine","2021",  "200",false},
     {12,"White Jacket Topolino","Clothing","30","In  Shipping","2021",  "200",false},
     };
     Object []column={"Description","Type","Capacity","Processing","Year","Price"};
     f.setDefaultCloseOperation(EXIT_ON_CLOSE);
     f.setLayout(new BorderLayout());
     DefaultTableModel model = new DefaultTableModel(data, column);
     JTable jt = new JTable(model) {
     public Class getColumnClass(int column) {
     //return Boolean.class
     return getValueAt(0, column).getClass();
     }
     };
     jt.setBounds(30,40,900, 180);
     JPanel panel = new JPanel();
     panel.setBorder(BorderFactory.createLineBorder(Color.red));
     panel.setLayout(new BoxLayout(panel, 1));
     panel.add(jt);
     f.setResizable(false);
     JScrollPane scrollPane = new JScrollPane(panel);
     f.getContentPane().add(scrollPane);
     f.setTitle("OrderTest/Forward");
     f.add(checkButton);
     f.add(addButton);
     f.add(showButton);
     f.setSize(1000,1000);
     f.setLayout(null);
     f.setVisible(true);
     */
    public static void main(String []args){
        System.out.println("Now it surely works");
    }
}
