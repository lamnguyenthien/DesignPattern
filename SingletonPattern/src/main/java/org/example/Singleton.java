package org.example;

public class Singleton {
    private int index;
    private static Singleton instance = null;
    private Singleton(int index) {
        this.index = index;
    }

    public static Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class)
            {
                if(instance == null) {
                    int randomNumber = (int) (Math.random() * 9) + 1;
                    instance = new Singleton(randomNumber);
                }
            }
        }
        return instance;
    }

    public void sayHi() {
        System.out.println("WTF " + index);
    }
}
