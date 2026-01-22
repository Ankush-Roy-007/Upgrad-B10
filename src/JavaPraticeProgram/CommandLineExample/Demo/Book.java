package JavaPraticeProgram.CommandLineExample.Demo;

abstract class Book {
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book{

    void setTitle(String s){
        this.title = s;
    }

}
