package com.kodilla.abstracts.homework;

public class JobApplication {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Person person = new Person("Wojciech",30, doctor);
        person.showResponsibilities();

        Teacher teacher = new Teacher();
        Person person1 = new Person("Magdalena", 33, teacher);
        person1.showResponsibilities();

        QAEngineer qaEngineer = new QAEngineer();
        Person person2 = new Person("Karolina", 33, qaEngineer);
        person2.showResponsibilities();
    }
}
