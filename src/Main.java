import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Group[] groups = new Group[5];
        Group group1 = new Group(1, "Java");
        Group group2 = new Group(2, "PHP");
        Group group3 = new Group(3, "Front-end");
        Group group4 = new Group(4, "Python");
        Group group5 = new Group(5, "C#");
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;
        groups[3] = group4;
        groups[4] = group5;




        System.out.println("Введите имя нового студента: ");
        group1.addStudent(scanner.next());

        System.out.println("____________________________________");

        System.out.println("Введите название группы для поиска: ");
        Group.searchGroupByName(groups, scanner.next());

        System.out.println("____________________________________");


        System.out.println("Вот список всех групп: ");
        Group.showGroups(groups);
    }
}