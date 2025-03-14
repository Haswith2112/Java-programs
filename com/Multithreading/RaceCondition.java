package com.Multithreading;

class MicrosoftOffice2 extends Thread{
   @Override
   public void run() {
       if(Thread.currentThread().getName().equals("typing")) {
           typing();
       }
       else if(Thread.currentThread().getName().equals("spellCheck")) {
           spellCheck();
       }
       else {
           save();
       }
   }
 //Primary Operation
   private void typing() {
       try {
       for(int i=0;i<5;i++) {
           System.out.println("typing");
           Thread.sleep(4000);
       }
       }
       catch (Exception e) {
           e.printStackTrace();
       }
   }
//Secondary Operation
   private void spellCheck() {
       try {
           for(;;) {//infinite loop
               System.out.println("spellCheck");
               Thread.sleep(4000);
           }
           }
           catch (Exception e) {
               e.printStackTrace();
           }
       
   }
 //Secondary Operation
   private void save() {
       try {
           for(;;) {//infinite loop
               System.out.println("saving");
               Thread.sleep(4000);
           }
           }
           catch (Exception e) {
               e.printStackTrace();
           }
       
   }
}
public class   RaceCondition {
   public static void main(String[] args) throws InterruptedException {
       MicrosoftOffice2 ms1 = new MicrosoftOffice2();
       MicrosoftOffice2 ms2 = new MicrosoftOffice2();
       MicrosoftOffice2 ms3 = new MicrosoftOffice2();
       
       ms1.setName("typing");
       ms2.setName("spellCheck");
       ms3.setName("save");
       
       ms2.setDaemon(true);//Activate Daemon
       ms3.setDaemon(true);//Activate Daemon
       
       ms2.setPriority(8);//Set priority more than 7 for secondary operation
       ms3.setPriority(9);//Set priority more than 7 for secondary operation
       
       ms1.start(); 
       ms2.start();
       ms3.start();
   }
}







 
