package org.example;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Data
public class PackageVariable {
    String packageName;
    int noOfGuest;
    int freeNoOfChild;
    int maxChildAge;
    String reportingPlace;
    String reportingTime;

}
