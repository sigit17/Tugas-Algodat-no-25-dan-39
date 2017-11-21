package chapter12;
public class  simpulpohonbiner{
    //paket data terlihat anggota
    int element;
    simpulpohonbiner anakkiri;
    simpulpohonbiner anakkanan;
    //konstruktor
    public simpulpohonbiner(){}
    public simpulpohonbiner(int theElement){
        element = (int) theElement;
    }
    public simpulpohonbiner(int theElement, simpulpohonbiner theleftChild, simpulpohonbiner therightChild){
        element = (int) theElement;
        anakkiri = theleftChild;
        anakkanan = theleftChild;
    }

    public simpulpohonbiner getAnakkiri() {
        return anakkiri;
    }

    public simpulpohonbiner getAnakkanan() {
        return anakkanan;
    }

    public int getElement() {
        return element;
    }
    
}
