package stage1;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любые 2 слова или фразу: ");
        String string = in.nextLine();
        int count = 0;
        char[] array = string.toCharArray();
        for(int i = 0; i<(string.length()/2); i++){
           if(array[i] != array[string.length()-i-1]){
               count++;
               break;
           }
        }
        if(count>0){
            System.out.println("Это не палиндром");
        }
        else{
            System.out.println("Это палиндром");
        }
    }
}
