/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No1;
public class node{
        public Object data;
        public node next;
        public node (){
            data = null;
            next = null;
        }
        public node(Object val){
            data = val;
            next = null;
        }
    }