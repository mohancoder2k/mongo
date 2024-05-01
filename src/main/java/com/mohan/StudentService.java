package com.mohan;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(String id) {
        return studentRepository.findById(id);
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(String id, Student student) {
        student.setId(id); // Ensure the provided student object has the same ID as the one being updated
        return studentRepository.save(student);
    }

    public void deleteStudentById(String id) {
        studentRepository.deleteById(id);
    }
}
