package question2;

public class Main {   public static void main(String[] args) {
    Teacher teacher1 = new Teacher(1, "Alice", 5000);
    Teacher teacher2 = new Teacher(2, "Bob", 7000);

    Student student1 = new Student(1, "Charlie", 4);
    Student student2 = new Student(2, "David", 12);

    School school = new School();
    school.addTeacher(teacher1);
    school.addTeacher(teacher2);

    school.addStudent(student1);
    school.addStudent(student2);

    student1.payFees(15000);
    student2.payFees(30000);

    teacher1.receiveSalary(5000);
    teacher2.receiveSalary(7000);

    System.out.println("Total money earned by school: " + School.getTotalMoneyEarned());
    System.out.println("Total money spent by school: " + School.getTotalMoneySpent());
}
}


