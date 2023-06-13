public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Mustafa", "Çetindağ", "123", "AA", 85);
        Student st2 = new Student("Patika", "Dev", "2321", "BB", 110);
        Student st3 = new Student("Kodluyoruz", "Java102", "12312", "CC", 50);

        st2.setNote(100);
        System.out.println(st2.getNote());

        Instructor teacher = new Instructor("Mahmut", "Çetindağ", "CENG");

        Course mat = new Course("MAT101", "MAT", teacher);
        System.out.println(mat.getInstructor().getName());

        Student[] stu = {st1, st2, st3};
        mat.calcAvarage(stu);

        System.out.println("Ortalama: " + mat.calcAvarage(stu));

    }
}
