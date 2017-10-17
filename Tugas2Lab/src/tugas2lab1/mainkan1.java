package tugas2lab1;
public class mainkan1 {
    public static void main(String [] args){
        Stack_di_LinkedList1 z = new Stack_di_LinkedList1();
        z.add(1);
        z.add(2);
        z.add(3);
        z.add(4);
        z.add(5);
        System.out.println(z.toString());
        System.out.println(z.head());
        z.delete();
        System.out.println(z.toString());
    }
}
