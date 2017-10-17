package No1;

import java.util.Scanner;
public class Driver {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        infix tampil = new infix();
        System.out.print("Inputkan notasi infix : ");
        String x = in.next();
        tampil.postfix(x);
    }
}
