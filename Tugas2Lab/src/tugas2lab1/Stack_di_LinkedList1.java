/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2lab1;

import tugas2lab1.Stack_di_LinkedList;

/**
 *
 * @author Sigit Wicaksono
 */
public class Stack_di_LinkedList1 implements Stack_di_LinkedList{
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
    public node head;
    public int size;
    public Stack_di_LinkedList1(){
        head = null;
        size = 0;
    }
    @Override
    public boolean empty(){
        return head == null;
    }
    @Override
    public int size(){
        return size;
    }
    @Override
    public Object head(){
        if(empty())
            throw new IndexOutOfBoundsException();
        return head.element;
    }
    @Override
    public Object delete(){
        Object element = head.element;
        head = head.next;
        size--;
        return element;
    }
    @Override
    public void add(Object E){
        head = new node(E, head);
    }
     @Override
    public String toString(){
        StringBuffer s = new StringBuffer("[");
        node saatIni = head;
        while(saatIni != null){
            if(saatIni.element == null)
                s.append("null, ");
            else
                s.append(saatIni.element.toString() + ", ");
            saatIni = saatIni.next;
        }
        if(size > 0)
            s.delete(s.length() - 2, s.length());
        s.append("]");
        return new String(s);
    }
    
}
