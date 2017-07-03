package ThreadTest;

public class SynchronizedTest {
	/*private SynchronizedTest(){} 
    private static SynchronizedTest st;           //����ʽ����ģʽ���̲߳���ȫ����Ҫ��synchronizedͬ�� 
    public static SynchronizedTest getInstance(){ 
        if(st == null){ 
            st = new SynchronizedTest(); 
        } 
        return st; 
    }*/  
    /*private SynchronizedTest(){} 
    private static final SynchronizedTest st = new SynchronizedTest();  //����ʽ����ģʽ�������̰߳�ȫ 
    public static SynchronizedTest getInstance(){ 
        return st; 
    }*/  
      
    public static SynchronizedTest staticIn = new SynchronizedTest();   //��̬����  
      
     public synchronized void method1(){                                      //�Ǿ�̬����1  
         for(int i = 0;i < 10;i++){    
             System.out.println("method1 is running!");  
             try {  
                Thread.sleep(1000);  
            } catch (InterruptedException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
         }  
     }  
     public synchronized void method2(){                                   //�Ǿ�̬����2  
         for( int i = 0; i < 10 ; i++){  
             System.out.println("method2 is running!");  
             try {  
                Thread.sleep(1000);  
            } catch (InterruptedException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
         }  
     }  
    public synchronized static void staticMethod1(){                     //��̬����1  
        for( int i = 0; i < 10 ; i++){  
         System.out.println("static method1 is running!");  
         try {  
                Thread.sleep(1000);  
            } catch (InterruptedException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
     }  
    }  
    public synchronized static void staticMethod2(){                      //��̬����2  
        for( int i = 0; i < 10 ; i++){  
         System.out.println("static method2 is running!");  
         try {  
                Thread.sleep(1000);  
            } catch (InterruptedException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
     }  
    }  
}
