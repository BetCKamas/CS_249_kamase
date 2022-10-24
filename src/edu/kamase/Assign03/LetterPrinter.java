package edu.kamase.Assign03;

import java.util.*;

public class LetterPrinter {
    public static Letterhead askForLetterheadData(Scanner input){
        Letterhead businessInfo = new Letterhead();
        
        System.out.println("Enter a business name:");
        businessInfo.setName(input.nextLine());
        System.out.println("Enter boundary character:");
        String boundCh = input.nextLine();
        businessInfo.setBoundaryChar(boundCh.charAt(0));
        String [] sloganLines = new String[4];
        System.out.println("Enter slogan (max 4 lines):");
        businessInfo.setSlogan(sloganLines);
        for(int i = 0; i < 4; i++){
            sloganLines[i] = input.nextLine();
            }
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
