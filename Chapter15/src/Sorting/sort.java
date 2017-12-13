package Sorting;
public class sort {
    void printArray(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public void selection(int data[]){
        for(int i = 0; i < data.length-1; i++){
            int min_idx = i;
            for(int j = i+1; j < data.length; j++)
                if(data[j] < data[min_idx])
                    min_idx = j;
            int t = data[min_idx];
            data[min_idx] = data[i];
            data[i] = t;
        }
    }
    public void insertion(int data[]){
        for(int i = 0; i<data.length; i++){
            int key = data[i];
            int j = i-1;
            while(j>=0 && data[j] > key){
                data[j+1] = data[j];
                j = j-1;
            }
            data[j+1] = key;
        }
    }
    public void bubble(int data[]){
        for(int i = 0; i < data.length-1; i++){
            for(int j = 0; j < data.length-i-1; j++)
                if(data[j] > data[j+1]){
                    int t = data[j];
                    data[j] = data[j+1];
                    data[j+1] = t;
                }
        }
    }
}
