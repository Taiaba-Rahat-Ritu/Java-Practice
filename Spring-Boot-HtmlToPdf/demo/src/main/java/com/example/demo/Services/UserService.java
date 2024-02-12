package com.example.demo.Services;

import com.example.demo.Model.User;
import com.example.demo.Repo.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class UserService {
    private UserRepo userRepo;

    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;
    }
    public List<User> getAll() throws FileNotFoundException, DocumentException {
        List<User> user=userRepo.findAll();

        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("invoice.pdf"));

        document.open();

        Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
        for (var bk : user) {
            String userInfo = "ID: " + bk.getUserID() + " "+" Name: " + bk.getUserName() +" Email: "+bk.getUserEmail();
            Paragraph paragraph = new Paragraph(userInfo, font);
            document.add(paragraph);
        }
        document.close();

        return user;
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
