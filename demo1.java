class demo1 {
    int add(){
        int a=10;
        int b=20;
        int sum=a+b;
        return sum;

    }
    demo1(){
        System.out.println("This is constructor");
    }
    public static void main(String[] args) {
        Hello h1=new Hello();
        int sum=h1.add();
        System.out.println(sum);
    }
    
}
