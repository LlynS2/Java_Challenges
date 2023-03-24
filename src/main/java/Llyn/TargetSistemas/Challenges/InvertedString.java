package Llyn.TargetSistemas.Challenges;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;
@Getter
@Setter
public class InvertedString {
    private String prohibited;
    private String exit;
    public void executeTheInversion() {

        Scanner stringInsert = new Scanner(System.in);
        System.out.println("Write a word below \uD83D\uDC47");

        setProhibited(stringInsert.next());
        setExit("");

        for( int word = prohibited.length() - 1; word >= 0; word -- ){
             setExit(getExit() + getProhibited().charAt(word));
        }
        System.out.println("Answer \uD83E\uDD14 : " + getExit());
    }
}