package TheObserverPattern.LifeChangingApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShouldIDoIt {
    JFrame frame;

    public static void main(String[] args) {
        ShouldIDoIt app = new ShouldIDoIt();
        app.go();
    }

    public void go() {
        frame = new JFrame();
        JButton button = new JButton("Should I do it ?!");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setVisible(true);
    }

    class AngelListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don’t do it, you might regret it!");
        }
    }

    class DevilListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Come on, do it!");
        }
    }
}
