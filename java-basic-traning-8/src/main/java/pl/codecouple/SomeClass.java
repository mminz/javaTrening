package pl.codecouple;

public class SomeClass {

    void someMethod1 (int value ) throws CheckedExepction {
        throw new CheckedExepction();
        //try caatch
        //throws
    }

    void  someMethod2 (int value) throws UncheckedException {
        throw new UncheckedException();
    }

    void someMethod3 () {
        try{
            throw new CheckedExepction();
        } catch ( CheckedExepction  e){
            // logika
            System.out.println("cos");
        }
    }

}
