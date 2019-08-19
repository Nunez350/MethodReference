interface MyInstanceInterface{
    void interfaceMethod();
}
public class InstanceMethodReference{
    public  void classMethod(){
        System.out.println("My class method");
    }
    public static void main(String[] args) {  
        InstanceMethodReference inMeRefObj = new InstanceMethodReference();
        //Referring non-static method using reference 
        System.out.println("using reference"); 
        MyInstanceInterface Myint = inMeRefObj::classMethod;
        Myint.interfaceMethod();
        
        // Referring non-static method using anonymous object  
        System.out.println("using anonymous object"); 
        MyInstanceInterface obj3 = new InstanceMethodReference()::classMethod;
        obj3.interfaceMethod();
       
     
    }
}
