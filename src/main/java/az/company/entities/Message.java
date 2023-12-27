package az.company.entities;

import lombok.Data;
import lombok.Getter;

@Data
public class Message {
    private String name;

    public void print() {
        System.out.println(name);
    }
}
