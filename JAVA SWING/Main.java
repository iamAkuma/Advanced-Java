import java.awt.*;
import javax.swing.*;
// import javax.swing.border.Border;

public class Main {
    public static void main(String[] args) {
        // Border border = BorderFactory.createLineBorder(Color.green, 3);
        ImageIcon icon = new ImageIcon("thumbsup.png");
        JFrame frame = new JFrame();
        frame.setSize(750, 750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);

        // Create Panel
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        frame.add(redPanel);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        frame.add(bluePanel);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        frame.add(greenPanel);
        greenPanel.setLayout(new BorderLayout());

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        redPanel.add(label);
        label.setVerticalAlignment(0);

        // frame.getContentPane().setBackground(new Color(255, 255, 255));
        // // frame.setLayout(null);

        // JLabel label = new JLabel();
        // label.setText("Hello Bro!");
        // ImageIcon image = new ImageIcon("square.png");
        // label.setIcon(image);

        // label.setHorizontalTextPosition(JLabel.CENTER);
        // label.setVerticalTextPosition(JLabel.TOP);
        // label.setForeground(new Color(0x00FF00)); // set Font color
        // label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // set font of text
        // label.setIconTextGap(20); // text gap
        // label.setBackground(Color.black); // set background color
        // label.setOpaque(true); // display bg color
        // label.setVerticalAlignment(JLabel.CENTER); // set vertial position of
        // icon+text within label
        // label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of
        // icon+text within label
        // // label.setBounds(100, 100, 250, 250); // set x and y position within frame
        // as
        // // well as dimension
        // label.setBorder(border);

        // frame.add(label);

    }
}
