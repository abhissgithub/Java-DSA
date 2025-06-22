package STRING;

public class STRINGBUILDERDELETECHAR {
    public static void main(String[] args) {
        StringBuilder SB=new StringBuilder("abhishek");
//        System.out.println(SB);
//        SB.setCharAt(0,'B');
//        SB.insert(3,"K");
//        System.out.println(SB);
        SB.delete(0,4);
        System.out.println(SB);

    }
}
