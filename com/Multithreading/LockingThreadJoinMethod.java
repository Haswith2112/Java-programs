package com.Multithreading;

class MicrosoftOffice extends Thread{
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
                System.out.println("spellCHeck");
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
public class LockingThreadJoinMethod {
    public static void main(String[] args) throws InterruptedException {
        MicrosoftOffice ms1 = new MicrosoftOffice();
        MicrosoftOffice ms2 = new MicrosoftOffice();
        MicrosoftOffice ms3 = new MicrosoftOffice();
        
        ms1.setName("typing");
        ms2.setName("spellCheck");
        ms3.setName("save");
        
        ms1.start();
        ms1.join();
        ms2.start();
        ms1.join();
        ms3.start();
    }
}
 


