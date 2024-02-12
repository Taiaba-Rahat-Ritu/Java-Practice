package com.example.invoice.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user-details")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int userID;
    String userName;

    int phone;
    String userEmail;
    LocalDate checkin;
    LocalDate checkout;

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public int getPhone() {
        return phone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }
}

