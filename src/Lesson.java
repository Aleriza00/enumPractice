public enum Lesson  {
    ALGEBRA("алгебра"),
    GEOMETRY("геометрия "),
    CHEMISTRY("химия"),
    ENGLISH("английский ");

    private String  nameOfLesson;

    Lesson(String nameOfLesson) {
        this.nameOfLesson = nameOfLesson;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "nameOfLesson='" + nameOfLesson + '\'' +
                '}';
    }
}
