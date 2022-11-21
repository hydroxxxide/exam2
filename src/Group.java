import java.util.Arrays;

public class Group {
    private Integer id;
    private String name;
    private String[] students = new String[5];
    private final Group[] groups = new Group[5];


    public Group(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Group(String[] students) {

        this.students = students;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getStudents() {
        return students;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }


    public void addStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                System.out.println(student + " добавлен в группу " + getName());
            }else {
                System.out.println("Группа переполнена! Студент " + student + " не добавлен");
            }
            return;

        }
    }

    public static void searchGroupByName(Group[] groups, String name){
        for (Group value : groups) {
            if (value != null && value.getName().equals(name)) {
                System.out.println("Группа найдена, вот её студенты: " + Arrays.toString(value.students));
            } else {
                System.out.println("Группа не найдена");
            }
            return;
        }
    }

    public static void showGroups(Group[] groups){
        for (Group value : groups) {
            if (value != null ) {
                System.out.println(value);

            }
        }
    }

    @Override
    public String toString() {
        return "[" +
                "ID группы - " + id +
                ", Название - '" + name + '\'' +
                ", Студенты - " + Arrays.toString(students) +
                ']';
    }

}
