package exercises.CollectionsDataFlows;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPrac {

    public static void main(String[] args) {
        HashMap<Integer, String> gradeBook = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Enter student name and ID or ENTER to finish");
        do {
            System.out.println("Name: ");
            name = input.nextLine();
            if (!name.equals("")){
                System.out.println("ID#: ");
                Integer id = Integer.parseInt(input.nextLine());
                gradeBook.put(id, name);
            }
        } while (!name.equals(""));
        System.out.println("Class Roster: ");
        for (Map.Entry<Integer, String> student : gradeBook.entrySet()) {
            System.out.println("ID#: "+student.getKey()+" Name: "+student.getValue());
        }
    }
}
