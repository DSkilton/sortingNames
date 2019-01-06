import java.util.Arrays;

public class App {

    public static void main(String[] args) {
         String[] actualNames = new String[]{
                "Jonhson", "Wilson",
                "Wilkinson", "Abraham", "Dagobert"};
        Arrays.sort(actualNames);
        for (final String name : actualNames){
            System.out.println(name);
        } // end of sort and print
    } // end of main
}
