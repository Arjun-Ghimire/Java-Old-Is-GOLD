

public class inheritance_example {
    
    public static void main(String[] args){
        isee i=new isee();
        
        i.food();
        i.speak();
        i.walk();
        
    }
}

// note that java support multilevel inheritance but java doesn't support multiple inheritance, 
// multiple inheritance means we can't do like: class ikkaa extends iskaa,isee. that is not possible, they have to use interface for that.


// ikkaa is the original name
class ikkaa{
    void food(){
        System.out.println("I eat food");
    }
}

class iskaa extends ikkaa{
    void walk(){
        System.out.println("I can walk");
    }
}

class isee extends iskaa{
    void speak(){
        System.out.println("I can speak what ever I wish!");
    }

}
