
//refering a constructor using the new keyword with the help of an interface
@FunctionalInterface
interface ConstructorInterface{
    MyConstruct getIt(String m);
}  
class MyConstruct{
    MyConstruct(String m){   
         System.out.println("Get "+m);
    }
} 
public class ReferenceWConstructor{  
    public static void main(String args[]){
        ConstructorInterface ConObj = MyConstruct::new;
        ConObj.getIt("It!");
        ConObj.getIt("got!");
    }

}