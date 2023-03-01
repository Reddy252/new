interface Interface{
    void display();
    public static void display1(){
        System.out.println("Good");
    }
}
public class Sai implements Interface {
    public void display(){
        System.out.println("Happy");
    }
    public static void main(String args[])
    {
        Sai s=new Sai();
        System.out.println("SaiBaba");
        Interface.display1();
        s.display();

    }
}
