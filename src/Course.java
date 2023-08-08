public enum Course {
    JAVA("Курсы джава"),
    JAVASCRIPT("Курсы джаваскрипт");
    private String nameOfCourse;

    Course(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    @Override
    public String toString() {
        return "Course{" +
                "nameOfCourse='" + nameOfCourse + '\'' +
                '}';
    }
}
