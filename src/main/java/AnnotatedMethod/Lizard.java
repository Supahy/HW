package AnnotatedMethod;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Lizard {
    private String name;
    private String breed;
    private boolean hunting;

    @Execute(times = 5)
    public void hunt(String food){
        if (hunting = true) {
            System.out.println(name + " hunted and ate " + food);
            hunting = false;
        } else {
            System.out.println(name + " is not hungry and dont wanna hunt");
        }
    }

    @Execute(times = 3)
    public void clean(){
        System.out.println(name + " is cleaning himself");
    }


}
