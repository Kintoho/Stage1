package stage1;

public class HelloWorldChar {

    public static void main(String[] args){
        String string = new String("Hello world!");
        char[] helloArray = string.toCharArray();
        for(int i = 0; i<string.length(); i++){
            System.out.println(helloArray[i] + " " + i);
        }
    }
}
