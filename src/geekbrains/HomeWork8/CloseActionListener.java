package geekbrains.HomeWork8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CloseActionListener implements ActionListener {  // класс CloseActionListener реализован от интерфейса ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
