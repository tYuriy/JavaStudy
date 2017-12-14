//package Other.test.LHTv3;
//
//import Other.test.LHT.LHT2;
//
//import javax.swing.*;
////import java.awt.*;
//import java.awt.*;
//import java.util.ArrayList;
//
//public class ProgGUI {
//    public void go(){
//        JFrame frame = new JFrame("LHT v_2.0");
//
//        JLabel label = new JLabel("Let's start!");
//        JButton button = new JButton("Start!");
//        ArrayList textFields = new ArrayList<JTextField>();
//
//        JPanel mainPanel = new JPanel();
//        JPanel topPanel = new JPanel();
//        JPanel bottomPanel = new JPanel();
//
//        frame.add(topPanel, BorderLayout.NORTH);
//        frame.add(bottomPanel,BorderLayout.SOUTH);
//        frame.add(mainPanel,BorderLayout.CENTER);
//
//        //topPanel.setBackground(Color.BLUE);
//        //bottomPanel.setBackground(Color.CYAN);
//        //mainPanel.setBackground(Color.DARK_GRAY);
//
//        mainPanel.setLayout(new GridBagLayout());
//        topPanel.add(label);
//        button.addActionListener(new LHT3.ButtonListerner());
//        bottomPanel.add(button);
//
//        int count =0;
//        int gridx =0;
//        int gridy =0;
//
//        for (int i =0;i<52;i++){
//            JTextField textField = new JTextField();
//            textField.setText((i+1+""));
//            textField.setHorizontalAlignment(JTextField.RIGHT);
//            textField.setEditable(false);
//
//            mainPanel.add(textField, new GridBagConstraints(gridx++,gridy,1,1,0.0,0.0,
//                    GridBagConstraints.NORTHWEST,GridBagConstraints.HORIZONTAL,
//                    new Insets(5,5,5,5), 0,0));
//            textFields.add(textField);
//            count++;
//            if (count==10) {
//                count = 0;
//                gridx = 0;
//                gridy += 1;
//            }
//
//        }
//
//
//        frame.setBounds(400,200,500,500);// устанавливаем координаты верхнего левого угла при открытии и размеры окна
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);
//        try {textFieldsColorChange();} catch (Exception ex){ex.printStackTrace();}
//    }
//}
