package org.example;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Data
public class PackageVariable {
    String packageName = "Cox's Bazar";
    int noOfGuest = 2;
    int freeNoOfChild = 2;
    int maxChildAge = 5;
    String reportingPlace = "Dhaka";
    String reportingTime = "10:00 AM";

}
