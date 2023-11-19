
import java.util.Scanner;

/*
t.[ADVANCED] Caesar encryption.

a)Encrypt a message by using “Caesar encryption”. It consist in move each letter 1 position. For example, the A would be B, the B would be C, and so on. The Z would be A.

b)Modify it to ask the user by the number of letters to move (with 2, the A would be C now).
 */
public class Challenge3_16t {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a message to codify: ");
        String message = keyboard.nextLine();
        String messageLower = message.toLowerCase();
        System.out.println("How many movements in the message you want: ");
        int movements = keyboard.nextInt();
        String abecedario = "abcdefghijklmnñopqrstuvwxyz";
        String messageEncript = "";
        for (int i = 0; i <= message.length() - 1; i++) {
            int posicionAbecedario = abecedario.indexOf(messageLower.charAt(i));
            if ((movements + posicionAbecedario) < 27){
            messageEncript = messageEncript + abecedario.charAt(posicionAbecedario + movements);
            }else{
            messageEncript = messageEncript + abecedario.charAt((posicionAbecedario + movements)% 27);   
            }
        }
        System.out.println(messageEncript);
    }
}
