package geekbrains.HomeWork8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {

    public MyWindow(){
        setVisible(true);

        setTitle("First_window_in_java"); // "Название" окна
        setLocation(350, 300);  // Начальная точка "окна"
        setSize(500, 500);  // ширина и высота "окна"

        setDefaultCloseOperation(EXIT_ON_CLOSE);  // назначить "крестику" закрытие окна

        JPanel panel = new JPanel(new GridLayout(1, 2)); // разметка онка (1 строка и 2 столбца) - панель

        JButton btn1 = new JButton("Выход"); // создаем кнопку "btn1"

        ActionListener listener = new CloseActionListener();

        btn1.addActionListener(listener);  // поведение книпки "btn1" - закрытие окна

        panel.add(btn1); // добавляем кнопку "btn1"

        JButton btn2 = new JButton("Кнопка2");
        panel.add(btn2);

        add(panel, BorderLayout.SOUTH); // добавляем панель "panel" на Юг онка

    }

}
