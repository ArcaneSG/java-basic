package class1;

public class ClassStart4 {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 18;
        student1.grade = 90;
        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        for (Student student : students) {
            System.out.println("이름 : " + student.name + " 나이 : " + student.age + " 성적 : " + student.grade);
            System.out.println("student = " + student);
            student.age = student.age + 1;
        }

        // 참조 주소 값만 저장!!
        System.out.println("이름 : " + student1.name + " 나이 : " + student1.age + " 성적 : " + student1.grade);
        System.out.println("이름 : " + student2.name + " 나이 : " + student2.age + " 성적 : " + student2.grade);
        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
    }
}
