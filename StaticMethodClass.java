//stativ method 
interface FunctionalStaticInterface{  
    void interfaceMethod();  
}  
public class StaticMethodClass {  
    //my static method
    public static void staticMethodFunction(){  
        System.out.println("calling this static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        FunctionalStaticInterface fInterfaceObj = StaticMethodClass::staticMethodFunction;  
        // Calling interface method  
        fInterfaceObj.interfaceMethod();  
    }  
}  