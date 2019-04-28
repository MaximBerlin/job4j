package ru.job4j.loop;
public class Board {
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int a = 0; a < height; a++ ) {
            for (int b = 0; b < width; b++ ) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if(a % 2 != 0) {
                    if (b % 2 != 0) {
                        screen.append("X");
                    } else {
                        screen.append(" ");
                    }
                } else {
                    if (b % 2 == 0) {
                        screen.append("X");
                    } else {
                        screen.append(" ");
                    }
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}