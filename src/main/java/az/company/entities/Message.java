package az.company.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Message {
    private String name;

    public void print() {
        System.out.println(name);
    }
}
