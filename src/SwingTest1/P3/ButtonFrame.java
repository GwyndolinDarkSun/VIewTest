package SwingTest1.P3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame extends JFrame{
    private JPanel buttonPanel;
    private static final int DEFAULT_WINDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public ButtonFrame(){
        setSize(DEFAULT_WINDTH,DEFAULT_HEIGHT);

        var yellowButton = new JButton("yellow");
        var blueButton = new JButton("blue");
        var redButton = new JButton("red");

        buttonPanel = new JPanel();

        buttonPanel.add(yellowButton);
        buttonPanel.add(blueButton);
        buttonPanel.add(redButton);

        add(buttonPanel);//这对象已经创建好了

        var yellowAction = new ColorAction(Color.YELLOW);
        var blueAction = new ColorAction(Color.BLUE);
        var redAction = new ColorAction(Color.RED);

        yellowButton.addActionListener(yellowAction);
        blueButton.addActionListener(blueAction);
        redButton.addActionListener(redAction);
    }

    private class ColorAction implements ActionListener{
        private Color backgroundColor;
        public ColorAction(Color c){
            backgroundColor = c;
        }

        public void actionPerformed(ActionEvent event){
            buttonPanel.setBackground(backgroundColor);
        }
    }
}
