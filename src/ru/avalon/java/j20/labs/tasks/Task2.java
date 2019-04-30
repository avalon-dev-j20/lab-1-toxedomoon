package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Point;

/**
 * Задание №2.
 *
 * <p>Тема: "Создание обобщённых классов".
 */
public class Task2 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {

        Point<Float> floatPoint = new Point<>((float)(Math.random() * 10), (float)(Math.random() * 10));
        Point<Integer> integerPoint = new Point<>((int)(Math.random() * 10), (int)(Math.random() * 10));

        double distance = floatPoint.distanceTo(integerPoint);

        // Проверка
        System.out.print("\nTASK 2.\nТочка 1 ( " + floatPoint.getX() + " ; " + floatPoint.getY() + " )\t");
        System.out.print("\nТочка 2 ( " + integerPoint.getX() + " ; " + integerPoint.getY() + " )\t");
        System.out.println("\nДистанция между точками: " + distance);

        /*
         * TODO(Студент): Выполнять задание №2
         *
         * 1. Выполнить обобщение класса Point с использованием
         *    шаблона так, чтобы в качестве координат точки
         *    можно было использовать любые числовые типы данных.
         *
         * 2. Создать  экземпляр типа Point:
         *
         *    - Создать точку, использующую для описания координат
         *      значения типа float.
         *
         *    - Создайте точку, использующую для описания координат
         *      значение типа int.
         *
         * 3. Вычислите дистанцию между точками.
         *
         * 4. С использованием отладчика проверьте корректность
         *    работы программы.
         */


    }
}
