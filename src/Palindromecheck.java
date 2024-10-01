import java.util.Scanner;

public class Palindromecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n=str.length();
        int count=0,count1=0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //System.out.print(ch);
            if(str.charAt(i)==str.charAt(n-1-i)){
                count++;

            }
            else{
                count1++;
            }
        }
        if(count1>1){
            System.out.println("Not palindrome");
        }
        else{
            System.out.println("Palindrome");
        }

    }
}
