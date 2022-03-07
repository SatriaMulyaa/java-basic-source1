import java.util.Arrays;

public class Trainingz {
    public static void main(String[] args) {
        String kataString = "hallo";
        char[]kataChar = {'h','a','l','l','o'};
        // Show String
        System.out.println("show String");
        System.out.println(kataString);
        System.out.println(Arrays.toString(kataChar));

        // Access component String
        System.out.println("Access component String and Array");
        System.out.println( kataString.charAt(0));
        System.out.println(kataChar[0]);

        // Change component
        System.out.println("change directly");
        kataChar[0] = 'c';
        System.out.println(Arrays.toString(kataChar));

        System.out.println("change indirectly");
//        print("kataString",kataString);
        print("kataString",kataString);
        kataString = "c" + kataString.substring(1,5);
        System.out.print("\n");


        // print
        // membandingkan alamat address dengan si cello ini
        System.out.println("address kataString & tes1");
        print("kataString",kataString);
        String tes1 = "cello";
        print("tes1", tes1);

        // memory String
        String stringA = "hallo";
        String stringB = "test";
        String stringC = "testing";
        print("StringA",stringA);
        print("StringB",stringB);
        print("StringC",stringC);

        // kita coba apakah sama memorynya dengan yang String B
        stringC = stringC.substring(0,4);
        print("string_C",stringC);

        // CONTOH PENGGUNAAN LAIN SELAIN METHOD SUBSTRING
        String x = new String("hallo");
        print("X", x);
        String z = "hallo";
        print("z", z);
        z = "lacasto";
        print("z", z);

    }

    private static void print(String name, String data){
        int address  = System.identityHashCode(data);
        System.out.println(name + " = "+ data + " || " + Integer.toHexString(address));
    }
}
