class INHERITANCE {
    public static void sum(int a , int b){
        int c=a+b;
        System.out.println(c);
    }
    public static void sum(float a, float b){
        float c=a+b;
        System.out.println(c);
    }
    public static void sum(int a,int b,int d){
        int c=a+b+d;
        System.out.println(c);
    }

    public static void main(String[] args) {
        sum(8,9);
        sum(880,980);
        sum(9,9,9);
    }
}