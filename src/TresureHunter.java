import java.util.Scanner;
public class TresureHunter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Hunt:");
        int totalHunt = sc.nextInt();
        System.out.println("Enter Ben percentage:");
        int benPercentage = sc.nextInt();
        System.out.println("Enter Blackbeard percentage:");
        int blackbeardPercentage = sc.nextInt();

        int benHunt=(benPercentage*totalHunt)/100;
        System.out.println("Ben Hunt:"+benHunt);

        int nextTotal=totalHunt-benHunt;
        int blackbeardHunt=(blackbeardPercentage*nextTotal)/100;
        System.out.println("Blackbeard Hunt:"+blackbeardHunt);

        int secondnexttotal=nextTotal-blackbeardHunt;
        int remainingHunt=secondnexttotal/3;
        System.out.println("Remaining Hunt:"+remainingHunt);

    }
}
