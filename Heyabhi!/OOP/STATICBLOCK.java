package OOP;
class STATICBLOCK {
    static int a=4;
    static int b;

    static {
        System.out.println("I am a static block");
        b+=a*5;
    }

    public static void main(String[] args) {
        STATICBLOCK obj=new STATICBLOCK();
        System.out.println(STATICBLOCK.a+" "+STATICBLOCK.b);
        STATICBLOCK.b*=3;
        System.out.println(STATICBLOCK.a+" "+STATICBLOCK.b);
    }

}
