class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
public class StudentList {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("Lokesh", 85);
        students[1] = new Student("Aman", 92);
        students[2] = new Student("Raj", 78);
        students[3] = new Student("Praharsh", 89);
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].marks > students[j + 1].marks) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        System.out.println("Students sorted by marks:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " - " + students[i].marks);
        }
    }
}
