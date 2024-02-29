package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GuideVariable {
    private String included;

    public GuideVariable(String included) {
        this.included = included;
    }

}
