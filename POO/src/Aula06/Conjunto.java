package Aula06;

public class Conjunto {
    private int[] arr;

    public Conjunto(){
        arr = new int[0];
    }

    void insert(int n){

        if(!this.contains(n)){
            int[] arr2 = new int[arr.length+1];

            for (int i=0; i < arr.length; i++){
                arr2[i] = arr[i];
            }
            arr2[arr.length] = n;
            arr = arr2;
        }
    }

    boolean contains(int n){
        boolean test = false;

        for (int element : arr) {
            if (element == n) {
                test = true;
                break;
            }
        }
        return test;
    }

    void remove(int n){
        if(this.contains(n)){
            int[] copy = new int[arr.length-1];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (arr[i] != n) {
                    copy[j++] = arr[i];
                }
            }
            arr = copy;
        }
    }

    void empty(){
        arr = new int[0];
    }

    int size(){
        return arr.length;
    }

    Conjunto combine(Conjunto add){
        Conjunto unido = new Conjunto();

        for(int i = 0; i < this.size(); i++){
            unido.insert(this.arr[i]);
        }
        for(int j = 0; j < add.size(); j++){
            unido.insert(add.arr[j]);
        }
        return unido;
    }

    Conjunto subtract(Conjunto diff){
        Conjunto dif = new Conjunto();

        for(int i = 0; i < this.size(); i++){
            if(!diff.contains(this.arr[i])){
                dif.insert(this.arr[i]);
            }
        }
        // for(int j = 0; j < diff.size(); j++){
        //     dif.remove(diff.arr[j]);
        // }
        return dif;
    }

    Conjunto intersect(Conjunto inter){
        Conjunto inte = new Conjunto();

        for(int i = 0; i < this.size(); i++){
            if(inter.contains(this.arr[i])){
                inte.insert(this.arr[i]);
            }
        }
        
        return inte;
    }

    @Override
    public String toString(){
        // String[] strarr = new String[arr.length];
        String strarr = "";
        for(int i = 0; i < arr.length; i++){
            strarr += arr[i];
            strarr += " ";
        }
        return strarr;
    }


}
