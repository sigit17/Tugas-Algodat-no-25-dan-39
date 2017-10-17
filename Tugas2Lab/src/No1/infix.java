package No1;
    public class infix{
        public node top;
        public infix(){
            top = null;
        }
        public boolean isEmpty(){
            return top == null;
        }
        public boolean full(){
            return false;
        }
        public void push(Object e){
            node tmp = new node(e);
            tmp.next = top;
            top = tmp;
        }
        public Object pop(){
            Object e = top.data;
            top = top.next;
            return e;
        }
        public Object peek(){
            Object e = top.data;
            return e;
        }
        public int priority(Object x){
            if(x.equals('+')||x.equals('-'))
                return 1;
            else if(x.equals("*")||x.equals("/"))
                return 2;
            else
                return 0;
        }
        public void postfix(String x){
            String output = "";
            infix S = new infix();
            for(int i = 0; i < x.length(); i++){
                char c = x.charAt(i);
                if(c==('+')||c==('*')||c==('-')||c==('/')){
                    while(!S.isEmpty()&&priority(S.peek()) >= priority(c))
                        output+=S.pop();
                        S.push(c);
                }
                else if(c == '('){
                    S.push(c);
                }
                else if(c == ')'){
                    while(!S.peek().equals('('))
                        output+=S.pop();
                        S.pop();
                }
                else
                    output+=c;
            }
            while(!S.isEmpty())
                output+=S.pop();
                System.out.println("notasi postfix : "+output);
        }
    }
    

