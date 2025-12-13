import java.util.Scanner;

public class Q3 {
    public static String isLuckyTicket (String ticket){
        int count = 0;
        char [] tick = ticket.toCharArray();
        char [] digit = {'0','1','2','3','4','5','6','7','8','9'};
        for (int i=0; i<tick.length; i++){
            for (int j=0; j<digit.length; j++){
                if (tick[i]==digit[j]) {
                    count++;
                    break;
                }
            }
        }

        if (tick.length %2 != 0 || count != tick.length){
            return "Invalid Ticket Number";
        }

        int midpoint = tick.length/2;
        int firstSum = 0;
        int secondSum = 0;
        for (int i=0; i<midpoint; i++){
            firstSum += Integer.parseInt (String.valueOf(tick[i]));
        }
        for (int j= midpoint; j<tick.length; j++){
            secondSum += Integer.parseInt (String.valueOf(tick[j]));
        }
        if (firstSum == secondSum){
            return "lucky";
        }else{
            return "Unlucky";
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter ticket number: ");
        System.out. printf ("%n%s", isLuckyTicket(scanner.nextLine()));
    }
}
