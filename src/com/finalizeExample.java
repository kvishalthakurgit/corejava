package com;

public class finalizeExample {
	
	
public static void main(String[] args) {
        MyObject obj = new MyObject();
        obj = null;
        System.gc();
    }

    static class MyObject {
        @Override
        protected void finalize() throws Throwable {
            try {
                System.out.println("Finalizing MyObject");
            } finally {
                super.finalize();
            }
        }
    }
}
