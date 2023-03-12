package com.example.limitsservice;
import lombok.*;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LimitsConfiguration {
    private int maximum;
    private int minimum;

}
