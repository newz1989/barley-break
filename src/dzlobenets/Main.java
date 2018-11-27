package dzlobenets;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        panel.setSize(500, 500);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));

        JFrame frame = new JFrame("barley-Break");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        frame.setVisible(Boolean.TRUE);
    }
}