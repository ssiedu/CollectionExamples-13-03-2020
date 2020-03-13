class A{}
class B{}
class C{}

public class Trial {

    public Object getObject(int n){
        
        if(n==1){
            return new A();
        }else if(n==2){
            return new B();
        }else{
            return new C();
        }
    }
    
}
