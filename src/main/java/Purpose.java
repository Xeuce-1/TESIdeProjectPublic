import java.io.*;
import java.util.Scanner;

public class Purpose {

    private static final Scanner userInput = new Scanner(System.in);

    public static void orientation(String name) {
        final File sourceFile = new File("C:\\Users\\Student\\workspace\\patrick-dennis-student-code\\SideProject\\purpose.txt");
        final File usersFile = new File(name);
        final boolean APPENDMODE = true;
        try (final FileOutputStream fos = new FileOutputStream(usersFile, APPENDMODE);
             final PrintWriter writer = new PrintWriter(fos); final Scanner fileReader = new Scanner(sourceFile)) {
            while (fileReader.hasNextLine()) {
                final String lineOfText = fileReader.nextLine();
                String[] textArray = lineOfText.split("\\|");
                for (String s : textArray) {
                    if (!s.contains("$$##$")) {
                        System.out.println(s);
                    } else {
                        System.out.println(s.replace("$$##$", name));
                    }
                }
                final String dataMine = userInput.nextLine();
                writer.println(dataMine);
                System.out.println("Your answer: " + dataMine);
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            ;
        } catch (IOException e) {
            System.out.println("not sure what to do here still");
        }

    }
}
