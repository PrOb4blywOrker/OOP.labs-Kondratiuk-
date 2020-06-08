public class symbols {
    char symbol;

    public symbols(){
        symbol='.';
    }
    public symbols(char a){
        if(!(a=='.'||a==','||a=='!'||a=='?'||a=='('||a==')'||a==' ')){
            System.out.println("Entered character is not a symbol");
        }
        else symbol=a;
    }
}
