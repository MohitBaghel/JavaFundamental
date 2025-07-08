
public class InnerCls {

    public static void main(String[] args) {
        OuterClass outer= new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();

        System.out.println(inner.y + outer.x);

    }

    
}



// outer
class OuterClass{
    int x = 30;


// inner
    class InnerClass{
        int y = 40;
    }
}



