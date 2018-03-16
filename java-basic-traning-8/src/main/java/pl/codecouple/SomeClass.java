package pl.codecouple;

public class SomeClass {

    void someMethod1 (int value ) throws CheckedExepction {
        throw new CheckedExepction("vlad");
        //try caatch
        //throws
    }

    void  someMethod2 (int value)  {
        throw new UncheckedException();
    }

    void someMethod3 () {
        try {
            someMethod1(10);
        } catch (CheckedExepction checkedExepction) {
            //error bo cos tam
        }

    }

}
