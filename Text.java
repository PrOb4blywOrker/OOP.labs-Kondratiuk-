public class Text {
    Sentence[] text;
    public Text(){
        text=new Sentence[0];
    }
    public Text(Sentence[] a){
        text=a;
    }
    void print(){
        for(int i=0;i<text.length;i++){
            text[i].print();
        }
    }
}
