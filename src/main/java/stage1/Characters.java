package stage1;

public class Characters {

    public static void main(String[] args){
        String string = new String("Hello world!");
        char[] helloArray = string.toCharArray();
        int count = 0;

        for(int i = 0; i<string.length(); i++){
            for(int j = i+1; j<string.length(); j++){
                if(helloArray[i] == helloArray[j]){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
