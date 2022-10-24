package edu.kamase.Assign03;

import java.util.*;

public class LetterPrinter {
    public static Letterhead askForLetterheadData(Scanner input){
        System.out.println("Enter a business name:");
        String name = input.nextLine();
        System.out.println("Enter boundary character:");
        String boundCh = input.nextLine();
        char boundaryChar = boundCh.charAt(0);
        String [] sloganLines = {"\n","\n","\n","\n"};
        System.out.println("Enter slogan (max 4 lines):");
        for(int i = 0; i < 4; i++){
            sloganLines[i] = input.nextLine();
        }
        Letterhead businessInfo = new Letterhead(name, sloganLines, boundaryChar);
        return businessInfo;
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        Letterhead header = askForLetterheadData(input);
        System.out.println("Your new letterhead:");
        System.out.println(header);

        input.close();
    }
}
