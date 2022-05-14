public class Main {
    public static void main(String[] args){
        int a = 100;
        int b =400;
        float c = 32.3f;
        double d = 7809.67;
        char e = 'c';
        byte f = 32;
        String s = "Hello";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(s);

        String str = "My Name is Sreelal";
        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }
        if (str.startsWith("My")){
            System.out.println("The string starts with my");
        }
    }
}
