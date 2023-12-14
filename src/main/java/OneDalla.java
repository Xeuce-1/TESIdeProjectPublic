import java.util.Scanner;

public class OneDalla {

    private final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        OneDalla oneDalla = new OneDalla();
        oneDalla.run();
    }

    public void run() {
        FileCreator fileCreator = new FileCreator();


        System.out.println("please enter your first name");
        final String nameFile = userInput.nextLine();
        fileCreator.getFile(nameFile);






    }
}
