package com.example.invoice.Services;

import com.example.invoice.Model.User;
import com.example.invoice.Repo.UserRepo;

import java.io.FileNotFoundException;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserService {
    private UserRepo userRepo;

    public UserService(UserRepo userRepo){

        this.userRepo = userRepo;
    }
    public List<User> getAll() {

        return (List<User>) userRepo.findAll();
    }

    public Optional<User> getUserById(int id) {

        return userRepo.findById(id);
    }

















    public User save(User user) {

        return userRepo.save(user);
    }

    public boolean existsById(int id) {

        return userRepo.existsById(id);
    }

    public void deleteUserID(int id) {

        userRepo.deleteById(id);
    }
}
