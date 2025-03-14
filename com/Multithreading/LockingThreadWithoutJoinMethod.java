 package com.Multithreading;

class MicrosoftOffice1 extends Thread{
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

    private void spellCheck() {
        try {
            for(int i=0;i<5;i++) {
                System.out.println("spellCheck");
                Thread.sleep(4000);
            }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        
    }

    private void save() {
        try {
            for(int i=0;i<5;i++) {
                System.out.println("saving");
                Thread.sleep(4000);
            }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        
    }
}
public class LockingThreadWithoutJoinMethod  {
    public static void main(String[] args) throws InterruptedException {
        MicrosoftOffice1 ms1 = new MicrosoftOffice1();
        MicrosoftOffice1 ms2 = new MicrosoftOffice1();
        MicrosoftOffice1 ms3 = new MicrosoftOffice1();
        
        ms1.setName("typing");
        ms2.setName("spellCheck");
        ms3.setName("save");
        
        ms1.start(); 
        ms2.start();
        ms3.start();
    }
}
 



 

