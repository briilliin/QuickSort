package cs.vsu.ru.bredikhina;

import cs.vsu.ru.util.SwingUtils;

import javax.swing.*;
import java.util.Locale;


public class Program {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.ROOT);
        SwingUtils.setDefaultFont("Microsoft Sans Serif", 18);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    }
}
