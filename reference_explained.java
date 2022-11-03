// Using Child Reference, and child object
class Father {
    int property = 100; 
    private int fixedDeposit = 60; 

    void respectElder(){
        System.out.println("One should respect elder");
    }  

    int business(){
     return property * 2;
    }  
    
    void whoAmI(){
        System.out.println("I am a Parent...");
    }
    
    void showProperty(){
        int propertyInHand;         
        propertyInHand =business();
        System.out.println("I have "+propertyInHand);;
    }

    void hasFixedDeposit(){        
        System.out.println("Yes ...");
  }


}


class Children extends Father{
 private  int stipend = 5;
 
  void getStipend(){        
        System.out.println("I am a getting stipend..." +stipend);
  }

 int business(int stipend){
     return property * 2 + this.stipend;
    }
 
    void whoAmI(){
        System.out.println("I am a Child...");
  }

    void showProperty(){
        int propertyInHand;         
        propertyInHand =business(this.stipend);
        System.out.println("I have "+propertyInHand);;
    }


}
class TestSuper1{
public static void main(String[] args) {
        Children s1 = new Children();
        s1.respectElder();
        s1.whoAmI();
        s1.getStipend();
        s1.showProperty();
       
       //function access is available to child
        //s1.hasFixedDeposit();
        
        //Error : fixedDeposit has private access in Father
        //System.out.println(s1.fixedDeposit);
     }    
}



