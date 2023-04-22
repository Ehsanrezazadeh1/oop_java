package com.codewithehsan;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        var textBox1 = new TextBox();
        textBox1.setText("textBox 1");
        System.out.println(textBox1.text);

        var textBox2 = new TextBox();
        textBox2.setText("textBox2");
        System.out.println(textBox2.text.toLowerCase());
    }
}