package Other.test.LHT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static Other.test.LHT.LHT.getArrayNum;

/**
 * Created by user on 11.04.2017.
 */
public class LHT2 {
    ArrayList<Integer> arr1;
    JFrame frame;
    JButton button;
    JLabel label;
    ArrayList<JTextField> textFields;
    public static void main(String[] args) {

        LHT2 gui = new LHT2();
        gui.go();
    }
    public void go(){
        frame = new JFrame("LHT v_2.0");

        label = new JLabel("Let's start!");
        button = new JButton("Start!");
        textFields = new ArrayList<JTextField>();

        JPanel mainPanel = new JPanel();
        JPanel topPanel = new JPanel();
        JPanel bottomPanel = new JPanel();

        frame.add(topPanel,BorderLayout.NORTH);
        frame.add(bottomPanel,BorderLayout.SOUTH);
        frame.add(mainPanel,BorderLayout.CENTER);

        //topPanel.setBackground(Color.BLUE);
        //bottomPanel.setBackground(Color.CYAN);
        //mainPanel.setBackground(Color.DARK_GRAY);

        mainPanel.setLayout(new GridBagLayout());
        topPanel.add(label);
        button.addActionListener(new ButtonListerner());
        bottomPanel.add(button);

        int count =0;
        int gridx =0;
        int gridy =0;

        for (int i =0;i<52;i++){
            JTextField textField = new JTextField();
            textField.setText((i+1+""));
            textField.setHorizontalAlignment(JTextField.RIGHT);
            textField.setEditable(false);

            mainPanel.add(textField, new GridBagConstraints(gridx++,gridy,1,1,0.0,0.0,
                    GridBagConstraints.NORTHWEST,GridBagConstraints.HORIZONTAL,
                    new Insets(5,5,5,5), 0,0));
            textFields.add(textField);
            count++;
            if (count==10) {
                count = 0;
                gridx = 0;
                gridy += 1;
            }

        }


        frame.setBounds(400,200,500,500);// устанавливаем координаты верхнего левого угла при открытии и размеры окна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        try {textFieldsColorChange();} catch (Exception ex){ex.printStackTrace();}
    }
    public void textFieldsColorChange() throws Exception {
        int waitInterval = 25;
        for (int i = 0; i < textFields.size(); i++) {

            Color color1=new Color(238,238,238);
            Color color2=Color.GRAY;
            Color color3=Color.DARK_GRAY;

            sleep(waitInterval);
            textFields.get(i).setBackground(color3);

            if (i > 0) {
                sleep(waitInterval);
                textFields.get(i - 1).setBackground(color2);
            }
            if (i > 1) {
                sleep(waitInterval);
                textFields.get(i - 2).setBackground(color1);
            }
            if (i ==textFields.size()-1) {
                sleep(waitInterval);
                textFields.get(i - 1).setBackground(color1);
                sleep(waitInterval);
                textFields.get(i).setBackground(color2);
                sleep(waitInterval);
                textFields.get(i).setBackground(color1);
            }
        }
    }
    public void sleep(int time) throws Exception{
        Thread.sleep(time);
        //try {Thread.sleep(time);} catch (Exception ex) {ex.printStackTrace();}
    }
    public class ButtonListerner implements ActionListener{
        public void actionPerformed (ActionEvent event){
            arr1 = new ArrayList<Integer>();
            ArrayList<Integer> cmpltArray = getArrayNum(arr1);
            Font selectedFont = new Font("sanserif",Font.BOLD,12);
            Font nonSelectedFont = new Font("sanserif",Font.PLAIN,12);
            //textFieldsColorChange();

            for (int i=0; i<textFields.size(); i++){
                for (int j = 0; j< cmpltArray.size(); j++){
                    //System.out.println(textFields.get(i).getText());

                    if (Integer.parseInt(textFields.get(i).getText()) == cmpltArray.get(j)){
                        textFields.get(i).setBackground(Color.black);
                        textFields.get(i).setForeground(Color.white);
                        textFields.get(i).setFont(selectedFont);
                        i++;
                    } else {
                        textFields.get(i).setBackground(new Color(238,238,238));
                        textFields.get(i).setForeground(Color.gray);
                        textFields.get(i).setFont(nonSelectedFont);
                    }
                }
            }

            //button.setBackground(Color.BLACK);
        }
    }

}
