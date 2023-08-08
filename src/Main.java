public class Main {
    public static void main(String[] args) {
        School school = new School(1,"A",Lesson.ALGEBRA);
        School school1 = new School(2,"B",Lesson.ENGLISH);
        School school2 = new School(3,"C",Lesson.GEOMETRY);
        School[] schools = {school,school1, school2};
        for (School school3 : schools) {
            System.out.println(school3);
        }

        Student student = new Student(11,"D","DD",18,Course.JAVA);
        Student student1 = new Student(22,"F","FF",19,Course.JAVASCRIPT);

        Student[] students = {student,student1};
        for (Student student2 : students) {
            System.out.println(student2);
        }


    }
}