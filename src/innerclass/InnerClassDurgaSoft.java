package innerclass;

class OuterKlass {
    int i = 10;

    public void outClassMethod() {
        System.out.println("Outer method");
    }

    public class InnerClass {
        int i = 12;

        //Static members can only be for Top level class members or in static class
        public void method() {
            outClassMethod();
            System.out.println("Method in Inner class : " + OuterKlass.this.i);

            class ClassInsideMethod{
                int valueOfClassInsideMethod=132;

            }

        }

        class InnerInnerClass {
            public void innerInnerMethod() {
                System.out.println("Inner Inner Method");
            }
        }

    }


}


public class InnerClassDurgaSoft {
    public static void main(String[] args) {
		OuterKlass.InnerClass.InnerInnerClass innerInnerClass=new OuterKlass().new InnerClass().new InnerInnerClass();
		innerInnerClass.innerInnerMethod();

        OuterKlass.InnerClass outerClass=new OuterKlass().new InnerClass();

        outerClass.method();

        Integer integer;
    }
}