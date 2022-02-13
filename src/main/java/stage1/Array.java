package stage1;

public class Array {

    public static void main(String[] args){
        int[] array = new int[30];
        for(int i = 0; i<30; i++ ){
            array[i] = 1+i;
        }
        int count = 0;
        for(int i = 1; i<=3; i++){
            for (int j = count;j<10+count;j++) {
                System.out.print(array[j] + " ");
            }
            System.out.print("\n");
            count = count+10;
        }

    }
}
