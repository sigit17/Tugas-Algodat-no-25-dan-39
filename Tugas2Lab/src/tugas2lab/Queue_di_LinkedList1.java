package tugas2lab;
public class Queue_di_LinkedList1 {
    public class node{
        Object element;
        node next;
        node(){}
        node(Object element){
            this.element  = element;
        }
        node(Object element, node next){
            this.element = element;
            this.next = next;
        }
    }
    public node first,last;
    int n = 0;
    Queue_di_LinkedList1(){
        first = null;
        last = null;
        //
    }
    public boolean isEmpty(){
        return first == null;
    }
    public int size(){
        return n;
    }
    public Object head(){
        if(isEmpty())
            throw new IndexOutOfBoundsException();
        return first.element;
    }
    public boolean add(Object E){
        node p = new node(E, null);
        if(isEmpty() == true){
            first = last = p;
        }
        else{
            last.next = p;
            last = p;
        }
        n++;
        return false;    
    }
    public Object delete(){
        if(isEmpty())
            return null;
        else if(first == last){
            Object x = (Object) first.element;
            first = last = null;
            return x;
        }
        Object x = (Object) first.element;
        first = first.next;
        return x;
    }
    @Override
    public String toString(){
        if(first == null)
            return null;
        if(first == last)
            return first.element.toString();
        StringBuffer sb = new StringBuffer();
        node saatIni = first;
        while(saatIni != last){
            sb.append(saatIni.element.toString()+",\t");
            saatIni = saatIni.next;
        }
        sb.append(last.element.toString());
        return sb.toString();
    }
}
