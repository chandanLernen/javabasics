class TestSleepMethod1 extends Thread{  
 public void run(){  
  for(int i=1;i<5;i++){  
    try{
        Thread.sleep(500);
        }
    catch(InterruptedException e){
        System.out.println(e);
        }

    System.out.println(i);  
  }  
 }  
 public static void main(String args[]){  
  TestSleepMethod1 t1=new TestSleepMethod1();  
  TestSleepMethod1 t2=new TestSleepMethod1();  
   
  t1.start();  
  t2.start();  
 }  
}  

class TestCallRun1 extends Thread{  
 public void run(){  
   System.out.println("running...");  
 }  
 public static void main(String args[]){  
  TestCallRun1 t1=new TestCallRun1();  
  t1.run();//fine, but does not start a separate call stack  
 }  
}  


class TestCallRun2 extends Thread{  
 public void run(){  
  for(int i=1;i<5;i++){  
    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
    System.out.println(i);  
  }  
 }  
 public static void main(String args[]){  
  TestCallRun2 t1=new TestCallRun2();  
  TestCallRun2 t2=new TestCallRun2();  
   
  t1.run();  
  t2.run();  
 }  
}  


class TestJoinMethod1 extends Thread{  
 public void run(){  
  for(int i=1;i<=5;i++){  
   try{  
    Thread.sleep(500);  
   }catch(Exception e){System.out.println(e);}  
  System.out.println(i);  
  }  
 }  
public static void main(String args[]){  
 TestJoinMethod1 t1=new TestJoinMethod1();  
 TestJoinMethod1 t2=new TestJoinMethod1();  
 TestJoinMethod1 t3=new TestJoinMethod1();  
 t1.start();  
 try{  
  t1.join();  
 }catch(Exception e){System.out.println(e);}  
  
 t2.start();  
 t3.start();  
 }  
}  