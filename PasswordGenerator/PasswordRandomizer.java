
import java.util.Random;

public class PasswordRandomizer {
    private Random random;
    private int number;

    public PasswordRandomizer(int length) {
        this.number=length;
        random =new Random();
    }

    public String createPassword() {
        
        String word=" ";
       for(int i=0;i<this.number;i++){
         char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(this.random.nextInt(26));
        word +=symbol;
       
    }
    return word;
}
}
