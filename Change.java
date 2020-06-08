public abstract class Change {
    // @param a- текст который нужно изменить
    static boolean change(Text a){
        boolean result=true;
        for(int i=0;i<a.text.length;i++){
            int initial=a.text[i].Length();
            Word temp=a.text[i].arr[a.text[i].arr.length-1];
            a.text[i].arr[a.text[i].arr.length-1]= a.text[i].arr[0];
            a.text[i].arr[0]=temp;
            if(initial!=a.text[i].Length()) result=false;
        }
        return result;
    }
}
