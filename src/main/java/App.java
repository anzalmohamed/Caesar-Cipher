import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Sc=scanner
        Scanner mySc = new Scanner(System.in);

        boolean doesCipherRun=true;
        while (doesCipherRun) {

            System.out.println("Welcome to Caesar's Cipher");

            System.out.println("Enter message to; \n1. encipher \t2. decipher \t3. exit or end to end the session");
            String choice = mySc.nextLine();

            if (choice.equals("encipher")) {
                System.out.println("Enter the message to be enciphered :");
                String encipheredMessage = mySc.nextLine();

                System.out.println("Enter the key to shift to");
                int encipheredKey = mySc.nextInt();

                Encipher cipher = new Encipher(encipheredMessage,encipheredKey);
                String enciphered = Encipher.encipher(cipher);

                System.out.println("Enciphered message: " + enciphered);

            } else if (choice.equals("decipher")) {
                System.out.println("Enter the message to be deciphered");
                String decipheredMessage = mySc.nextLine();


                System.out.println("Enter the key to shift to");
                int decipheredKey = mySc.nextInt();

                Decipher cipher = new Decipher(decipheredMessage,decipheredKey);
                String deciphered = Decipher.decipher(cipher);

                System.out.println("Deciphered message: " + deciphered);

            } else if (choice.equals("exit")) {
                doesCipherRun = false;
            }
        }
    }
}
