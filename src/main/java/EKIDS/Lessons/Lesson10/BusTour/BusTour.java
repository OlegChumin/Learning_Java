package EKIDS.Lessons.Lesson10.BusTour;

import java.util.Scanner;

/**Автобусный тур по Европе прошел очень успешно. В связи с увеличением количества людей, желающих отправиться
 * на экскурсию, туристическая компания решила увеличить высоту автобуса. Новая высота автобуса составляет ровно
 * N сантиметров.

 Но маршрут тура пролегает под множеством мостов, и есть вероятность, что автобус врежется в один из этих мостов.
 Можете ли вы узнать, произойдет ли это?

 Первая строка входа содержит высоту автобуса и количество мостов, под которыми проходит автобус. Вторая линия содержит
 высоты этих мостов.

 Вы должны вывести «Не рухнет», если все будет в порядке; в противном случае выведите «Врежется в мост i» (где i —
 номер моста), в который врежется автобус. Если высота моста равна высоте автобуса, автобус разобьется.

 Пример входных данных 1:

 234 8
 465 453 981 463 1235 871 475 981
 Пример выходных данных 1:

 Will not crash
 Пример входных данных 2:

 211 5
 871 205 123 871 1681
 Пример выходных данных 2:

 Will crash on bridge 2
 * */

public class BusTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        int[] bridgesHeightArray = new int[numberOfBridges];
        boolean checkFlag = false;

        for (int i = 0; i < bridgesHeightArray.length; i++) {
            bridgesHeightArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < bridgesHeightArray.length; i++) {
            if(busHeight >= bridgesHeightArray[i]) {
                System.out.println("Will crash on bridge " + (i+1));
                checkFlag = false;
                break;
            } else {checkFlag = true;}
        }
        if(checkFlag) {
            System.out.println("Will not crash");
        }
    }
}
