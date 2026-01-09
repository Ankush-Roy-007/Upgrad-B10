package production.upgradClass;

public class overloading {
    public int twoNum(int n1 , int n2){
        if(n1>n2) return n1;
        else return n2;
    }
    public int twoNum(int n1 , int n2,int n3){
        if(n1>n2){
            if(n1>n3) return n1;
            else return n3;
        }
        else {
            if(n2>n3) return n2;
            else return n3;
        }
    }
}
