package org.mouse_cursor_v2;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class MouseCursorDemo {
    public static void main(String[] args) throws AWTException, InterruptedException {
        // Создаем объект Robot
        Robot robot = new Robot();

        // Определите координаты центров двух кругов
        int redCircleX = 300;
        int redCircleY = 300;
        int blueCircleX = 600;
        int blueCircleY = 300;

        // Размер и цвет кругов
        int circleRadius = 50;
        Color redColor = Color.RED;
        Color blueColor = Color.BLUE;

        // Функция для рисования круга
        drawCircle(robot, redCircleX, redCircleY, circleRadius, redColor);
        drawCircle(robot, blueCircleX, blueCircleY, circleRadius, blueColor);

        // Создаем отдельный поток для проверки завершения программы пользователем
        Thread exitThread = new Thread(() -> {
            try {
                Thread.sleep(5000); // Ожидаем 5 секунд
                System.out.println("Для закрытия программы нажмите Ctrl+C");
            } catch (InterruptedException e) {
                // Прерывание потока
            }
        });
        exitThread.start();

        // Перемещаем курсор мыши между кругами
        while (true) {
            robot.mouseMove(redCircleX, redCircleY);
            Thread.sleep(5000);
            robot.mouseMove(blueCircleX, blueCircleY);
            Thread.sleep(5000);
        }
    }

    private static void drawCircle(Robot robot, int x, int y, int radius, Color color) {
        robot.mouseMove(x, y);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        for (int i = 0; i < 360; i += 10) {
            double radians = Math.toRadians(i);
            int xOffset = (int) (Math.cos(radians) * radius);
            int yOffset = (int) (Math.sin(radians) * radius);
            robot.mouseMove(x + xOffset, y + yOffset);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        }
    }
}
