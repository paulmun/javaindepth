class StudentTest {
    public static void main(String[] args) {
        int[] studentIds = new int[]{1000, 1001, 1002};

        Student student1 = new Student(studentIds[0], "Joan");
        student1.gender = "male";

        Student student2 = new Student(studentIds[1], "Raj");
        student2.gender = "male";

        Student student3 = new Student(studentIds[2], "Anita");
        student3.gender = "female";

        System.out.println("Name of student1: " + student1.name);
        System.out.println("Name of student2: " + student2.name);
        System.out.println("Name of student3: " + student3.name);

        student1.updateProfile("John");
        System.out.println("Name of student1: " + student1.name);
    }
}