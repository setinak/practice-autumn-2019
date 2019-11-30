package lesson05.part03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Чтение файла
 * 1. Считать с консоли имя файла.
 * 2. Вывести в консоль(на экран) содержимое файла.
 * 3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна считывать c консоли имя файла.
 * 2. Программа должна выводить на экран содержимое файла.
 * 3. Поток чтения из файла (FileInputStream) должен быть закрыт.
 * 4. BufferedReader также должен быть закрыт.
 */

public class Task18 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();

        FileInputStream input = new FileInputStream(fileName);

        while (input.available() > 0) {
            char data = (char) input.read();
            System.out.print(data);
        }

        input.close();
        reader.close();
    }
}