import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class TypeSpeed {
   public static void play() throws InterruptedException {

       String words[] = {"ocean","birds","forest","sunset","music","smile","sleep","laugh","cloud","over"};
       String typeWords;

      System.out.println();
   
       System.out.println("        3");
       TimeUnit.SECONDS.sleep(1);
       System.out.println();
       System.out.println("        2");
       TimeUnit.SECONDS.sleep(1);
       System.out.println();
       System.out.println("        1");
       TimeUnit.SECONDS.sleep(1);
       System.out.println();

       Random r = new Random();


       for(int i=0;i<=9;i++){
           System.out.print(words[r.nextInt(10)]+" ");
       }
       System.out.println();
       System.out.println();
       double start = LocalTime.now().toNanoOfDay();
       Scanner sc = new Scanner(System.in);
       typeWords = sc.nextLine();
       double end = LocalTime.now().toNanoOfDay();
       double elapsedtimed = end - start;
       double seconds = elapsedtimed / 1000000000.0;


       int wpm = (int) ((((double)typeWords.length() / 5 ) / seconds ) * 60);
       System.out.println();
       System.out.print("Your typing speed is " +wpm+ " words per minute");
       System.out.println(); 
       System.out.println();
       System.out.println("PROJECT MADE BY GROUP 10 ");
       System.out.println("-------------------------------------------------");
       System.out.println();

       sc.close();
   }
}


class Speed {
 public static void main(String[] args) {
        try {
            TypeSpeed.play();
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
    }
}