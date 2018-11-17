package org.chain.responsibility.services;

import org.chain.responsibility.models.students.AbstractStudent;
import org.chain.responsibility.models.students.ChemStudent;
import org.chain.responsibility.models.students.MathStudent;
import org.chain.responsibility.models.students.MusicStudent;

import java.util.ArrayList;
import java.util.List;

public class StudentFactory {
    public static List<AbstractStudent> getStudents() {
        AbstractStudent mathStudent = new MathStudent("Bolek Pandzioch");
        AbstractStudent chemStudent = new ChemStudent("Karol Kanbera");
        AbstractStudent musicStudent = new MusicStudent("Kasia Moloch");

        chemStudent.setNextStudent(musicStudent);
        musicStudent.setNextStudent(mathStudent);
        mathStudent.setNextStudent(chemStudent);

        List<AbstractStudent> list = new ArrayList<>();
        list.add(mathStudent);
        list.add(chemStudent);
        list.add(musicStudent);

        return list;
    }
}
