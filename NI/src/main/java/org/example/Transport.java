package org.example;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class Transport {
    int slotNumber;
    String route;
    String description;

}
