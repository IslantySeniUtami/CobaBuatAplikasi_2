package cobacoding;
import java.util.Scanner;
public class CobaCoding {
    public static void main(String[] args) {
        int jawaban;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Apakah dia suka sama kamu? 1:iya / 2:tidak");
        jawaban = keyboard.nextInt();
        
        if (jawaban == 1){
        System.out.println("tembak");
        }else {
            System.out.println("yag sabar yaa");
        
    }
    
}
}
