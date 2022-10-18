import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) throws FileNotFoundException {
         File file = new File("Sber.txt");
         List<String> str = new ArrayList<String>();
         Scanner sc = null;
         int mx = 0;
         int num = 0;
         try {
             sc = new Scanner(file);
             while (sc.hasNextLine()) {
                 str = List.of(sc.nextLine().split(";"));
                 List<String> str1 = new ArrayList<String>(str);
                 if (str1.size() == 5) {
                     str1.add("Неизвестно");
                 }
                 if (Integer.parseInt(str1.get(4)) > mx) {
                     mx = Integer.parseInt(str1.get(4));
                     num = Integer.parseInt(str1.get(0));
                 }
             }
             City city = new City(num,mx);
             city.Output();
         }
         catch (FileNotFoundException e) {
             e.printStackTrace();
         }
         finally {
             sc.close();
         }
    }
}
