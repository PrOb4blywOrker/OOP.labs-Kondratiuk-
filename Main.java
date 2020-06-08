import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Letter [] arr=new Letter[6];//массив букв
        arr[0]=new Letter('a');
        arr[1]=new Letter('n');
        arr[2]=new Letter('d');
        arr[3]=new Letter('r');
        arr[4]=new Letter('e');
        arr[5]=new Letter('w');
        Letter [] arr1=new Letter[5];//массив букв
        arr1[0]=new Letter('a');
        arr1[1]=new Letter('n');
        arr1[2]=new Letter('t');
        arr1[3]=new Letter('o');
        arr1[4]=new Letter('n');
        symbols[] arr2=new symbols[2];
        arr2[0]=new symbols(',');
        arr2[1]=new symbols('.');
        Word andrew=new Word(arr);
        Word anton=new Word(arr1);
        Word[] arr3=new Word[2];
        arr3[0]=andrew;
        arr3[1]=anton;
        Sentence sen=new Sentence(arr3,arr2);
        Word[] arr4=new Word[3];
        Letter[] arr5=new Letter[6];
        arr5[0]=new Letter('v');
        arr5[1]=new Letter('i');
        arr5[2]=new Letter('c');
        arr5[3]=new Letter('t');
        arr5[4]=new Letter('o');
        arr5[5]=new Letter('r');
        symbols[] arr6=new symbols[3];
        arr6[0]=new symbols(',');
        arr6[1]=new symbols(',');
        arr6[2]=new symbols('.');
        arr4[0]=andrew;
        arr4[1]=anton;
        arr4[2]=new Word(arr5);
        Sentence sen1=new Sentence(arr4,arr6);
        Sentence[] arr7=new Sentence[2];
        arr7[0]=sen;
        arr7[1]=sen1;
        Text txt=new Text(arr7);
        txt.print();
        boolean result=Change.change(txt);
        txt.print();
        System.out.println("Indicator of correctness: "+(result));
    }
}
