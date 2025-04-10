package com.mycompany.exercicio24;

import javax.swing.JOptionPane;

public class Exercicio24 {

    public static void main(String[] args) {

        int i = 12;
        do {
            JOptionPane.showMessageDialog(null, "Números pares: " + i);
            i += 2;
        } while (i <= 22);

    }
}
