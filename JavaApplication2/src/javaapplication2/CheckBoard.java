package javaapplication2;
public class CheckBoard {
    public static void main(String[] args){
        int i=1, j;
        while(i <= 8){
            j = 1; 
            while(j <= 8){
                System.out.print(i%2==1 ? "* " : " *");
                ++j;
            }
            System.out.println();
            i++;
        }
    }
}
