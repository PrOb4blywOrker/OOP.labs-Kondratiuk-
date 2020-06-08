public class Sentence {
    Word[] arr;
    symbols[] arr1;

    public Sentence() {
        arr = new Word[0];
        arr1 = new symbols[0];
    }

    public Sentence(Word[] a, symbols[] b) {
        if (a.length != b.length) {//ведь если предложение корректно то количесвто разделительных знаков учитывая точку в конце равно количеству слов
            System.out.println("Incorrect sentence");
        }
        arr = a;
        arr1 = b;
    }

    public Sentence(Sentence a) {
        arr=new Word[a.arr.length];
        arr1=new symbols[a.arr.length];
        for (int i = 0; i < a.arr.length; i++) {
            this.arr[i] = a.arr[i];
            this.arr1[i] = a.arr1[i];
        }
    }

    void print() {
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i].toString();
            s += arr1[i].symbol;
        }
        System.out.println(s);
    }
    public String toString(){
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i].toString();
            s += arr1[i].symbol;
        }
        return s;
    }

    int Length() {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i].Length();// добавляю длину каждого слова
            res++;//потому что символ всегда длины 1
        }
        return res;
    }
}
