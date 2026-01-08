public class Box {
    private int length , breath,height;
    public void setDimension(int l , int b , int h){
        length = l;
        breath = b;
        height = h;
    }
    public void showDimension(){
        System.out.println("length:- "+length);
        System.out.println("breath:- "+breath);
        System.out.println("height:- "+height);
    }
}

class Explain{
    public static void main(String[] args) {
        Box smallBox = new Box();
        smallBox.setDimension(9,7,10);
        smallBox.showDimension();
    }
}