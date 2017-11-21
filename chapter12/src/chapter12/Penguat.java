package chapter12;
public class Penguat {
    int turunankedaun, turunandariinduk;
    boolean penguatDisini;
    public simpulpohonbiner root;
    public Penguat(){}
    public Penguat(int dariinduk){
        turunandariinduk = dariinduk;
    }
    @Override
    public String toString(){
        return penguatDisini + " " + turunankedaun + " " + turunandariinduk;
    }
    public void insert(int id){
        simpulpohonbiner newsimpul = new simpulpohonbiner();
        newsimpul.element = id;
        if(root == null)
            root = newsimpul;
        else{
            simpulpohonbiner current = root;
            simpulpohonbiner parent;
            while(true){
                parent = current;
                if(id < current.element){
                    current = current.anakkiri;
                    if(current == null){
                        parent.anakkiri = newsimpul;
                        return;
                    }
                }
                else{
                    current = current.anakkanan;
                    if(current == null){
                        parent.anakkanan = newsimpul;
                        return;
                    }
                }
            }
        }
    }
    public void tempatPenguat(simpulpohonbiner x){
        Penguat elementX = (Penguat) x.element;
        elementX.turunankedaun = 0;
        simpulpohonbiner y = x.anakkiri;
        if(y != null){
            Penguat elementY = (Penguat) y.element;
            int toleransi = 2;
            int degradasi = elementY.turunankedaun + elementY.turunandariinduk;
            if(degradasi > toleransi){
                elementY.penguatDisini = true;
                elementX.turunankedaun = elementY.turunandariinduk;
            }
            else
                elementX.turunankedaun = degradasi;
        }
        y = x.anakkanan;
        if(y != null){
            Penguat elementY = (Penguat) y.element;
            int toleransi = 2;
            int degradasi = elementY.turunankedaun + elementY.turunandariinduk;
            if(degradasi > toleransi){
                elementY.penguatDisini = true;
                degradasi = elementY.turunandariinduk;
            }
            elementX.turunankedaun = Math.max(elementX.turunankedaun, degradasi);
        }
    }
}
