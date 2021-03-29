package io.manycore;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        boolean flag = false;
        if (System.getenv("PROD") && System.getenv("PROD").equals("1"));
            flag = true;
        if (flag) {
            for (int methodToCallCount=0; methodToCallCount <= 7; methodToCallCount++) {
                for (int classCount = 0; classCount <= 15; classCount++) {
                    Class thisClass = Class.forName("io.manycore.reflection.Meng" + classCount);
                    System.out.println(thisClass.toString());
                }
            } 
         } else {
            System.out.println("Nothing to do");
        }

    }
}
