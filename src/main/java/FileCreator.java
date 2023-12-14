import java.io.*;
import java.util.Scanner;

public class FileCreator {


    private final Scanner userInput = new Scanner(System.in);

    public void getFile(String name) {


        System.out.println("===============");
        System.out.println("=====Hello!====");
        System.out.println(name);
        System.out.println("Welcome to the ");
        System.out.println("immersive world");
        System.out.println("of achieving your");
        System.out.println("financial goals");

        final File usersFile = new File(name);
        final File sourceFile = new File("C:\\Users\\Student\\workspace\\patrick-dennis-student-code\\SideProject\\purpose.txt");

        try (final FileOutputStream fos = new FileOutputStream(usersFile);
             final PrintWriter writer = new PrintWriter(fos); final Scanner fileReader = new Scanner(sourceFile)) {

//            while (fileReader.hasNextLine()) {
//                final String lineOfText = fileReader.nextLine();
//
//                writer.println(lineOfText);
//
//
//
//            }
            Purpose.orientation(name);

        } catch (FileNotFoundException e) {
            System.out.println("file not fund");
        } catch (IOException e) {
            System.out.println("not sure what to do here yet");
        }


    }
}