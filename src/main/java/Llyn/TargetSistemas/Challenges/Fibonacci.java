package Llyn.TargetSistemas.Challenges;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Fibonacci {

    private Integer valueOne = 0;
    private Integer valueTwo = 1;
    private Integer result   = 0;

    public void questionSequence(){
        System.out.println("Throw your number and I'll tell you if you're part of the Fibonacci' Sequence \uD83E\uDD2F");
    }
    public void executeFibonacciSequence(int insertNumber) {

        Boolean valueInsert = false;

        while (getValueOne() <= insertNumber ) {

            if (getValueOne() == insertNumber) {
                valueInsert = true;
            }

            setResult(getValueTwo());
            setValueTwo(getValueOne() + getValueTwo());
            setValueOne(getResult());
        }
        String message = valueInsert ? "belongs" : "doesn't belong";

        System.out.println("Answer \uD83E\uDD13 : The number " + insertNumber + " " + message + " the Fibonacci' Sequence");
        }
}