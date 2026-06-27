package by.lesson.practics.class9;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text = "Сериализация объектов - это процесс сохранения состояния объектов в виде последовательности байтов, " +
                "а также процесс восстановления в дальнейшем из этих байтов \"живых\" объектов. " +
                "Java Serialization API предоставляет разработчикам Java стандартный механизм управления сериализацией объектов. " +
                "API мал и легок в применении, а его классы и методы просты для понимания.";

        String relativePath = "relative.txt";
        String absolutePath = "C:\\Users\\aleksandr.filanovich\\Desktop\\text.txt"; // замени на свой абсолютный путь
        String fermaFile = "fermas.bin";

        try {
            writeText(relativePath, text);
            writeText(absolutePath, text);

            String fromRelative = readText(relativePath);
            String fromAbsolute = readText(absolutePath);

            System.out.println("Текст из первого файла:");
            System.out.println(fromRelative);

            System.out.println("\nТекст из второго файла:");
            System.out.println(fromAbsolute);

            Ferma f1 = new Ferma("Ферма 1", 12, "Витебск");
            Ferma f2 = new Ferma("Ферма 2", 25, "Минск");

            serializeFermas(fermaFile, f1, f2);
            deserializeFermas(fermaFile);

            System.out.println("\nПотоки через Thread:");
            for (int i = 1; i <= 5; i++) {
                new AverageThread("Thread-" + i).start();
            }

            System.out.println("\nПотоки через Runnable:");
            for (int i = 1; i <= 5; i++) {
                new Thread(new AverageRunnable(), "Runnable-" + i).start();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void writeText(String path, String text) throws IOException {
        try (Writer writer = new FileWriter(path)) {
            writer.write(text);
        }
    }

    private static String readText(String path) throws IOException {
        try (Reader reader = new FileReader(path)) {
            StringBuilder sb = new StringBuilder();
            char[] buffer = new char[1024];
            int len;
            while ((len = reader.read(buffer)) != -1) {
                sb.append(buffer, 0, len);
            }
            return sb.toString();
        }
    }

    private static void serializeFermas(String fileName, Ferma... fermas) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            for (Ferma ferma : fermas) {
                out.writeObject(ferma);
            }
        }
    }

    private static void deserializeFermas(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            Ferma first = (Ferma) in.readObject();
            Ferma second = (Ferma) in.readObject();

            System.out.println("\nДесериализованные фермы:");
            System.out.println(first);
            System.out.println(second);
        }
    }
}