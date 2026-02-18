package human;

public class child extends parent {
public  child (){
    super();

    System.out.println("child constructor called ");
}
    public void childmethodcalled (){
    super.parentmethodcalled();
        System.out.println("child method called ");
    }


}
