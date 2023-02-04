public class Main {
    public static void main(String[] args) {
        System.out.print ("Hello world!");
        String a = "LongWallWidth";
        int e = 535;
        System.out.println(a);
        System.out.println(e);

        String b = "LongWallHeight";
        int f = 600;
        System.out.println(b);
        System.out.println(f);

        String c = "ShortWallWidth";
        int j = 822;
        System.out.println(c);
        System.out.println(j);

        String d = "ShortWallHeight";
        int h = 200;
        System.out.println(d);
        System.out.println(h);

        int LongWallArea = e*f;
        System.out.println(LongWallArea );
        int ShortWallArea = j*h;
        System.out.println(ShortWallArea);
        int RoomArea = LongWallArea + ShortWallArea * 2;
        System.out.print (RoomArea );
    }
}