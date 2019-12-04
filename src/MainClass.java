import libs.Libs;

import static libs.Libs.sum;

public class MainClass {
    public static void main(String arg[]) {
        System.out.println("Hello, world!");
        int var1;
        int var2 = 10;
        int rez;
        var1 = 5;


        //  rez = var1 + var2;
        //System.out.println("Rezult = " + rez);
        sum(var1, var2);

        int var3 = 45;
        // int rez1 = var2 + var3;
        // System.out.println("Rezult 1 = " + rez1);
        //int result = lib.sum(var2, var3);
        sum(var2, var3);


        String result4 = "test" + 4;
        int test1 = sum("3456", 5) + 555;
        //sum ("3456" , 5);
        System.out.println(sum("34a5", 5));

        System.out.println("---End---");


        Libs objectLibs;
        objectLibs = new Libs();

        objectLibs.mult(5, 6);
        objectLibs.mult(68, 89);

        int[] month = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        System.out.println("Array element 2 = " + month[1]);
        System.out.println("Array element 3 = " + month[2]);

        int[] month2 = new int[12];

        for (int i = 0; i < month2.length; i++) {
            month2[i] = i + 1;
            System.out.println("Array element = " + month[i]);
        }

        Libs objectLibs1;
        objectLibs1 = new Libs();

        objectLibs1.del(40, 2);
        objectLibs1.del(12, 3);


        //Вывести в Цикле в консоль:
        //Если элемент массива меньше 10, то значение и фразу "Элемент меньше 10Э
        //Если равен - значение и фразу "Элемент равен 10"
        //Если больше - значение и фразу "Элемент больше 10"

        for (int i = 0; i < 0; i++) {
            objectLibs.printArray(month, 10);
            objectLibs.printArray(month, 5);

            String var111 = "test";
            String var222 = "test";
            String var = new String("test");
            var.equals("test");
            String varString = new String("test");
            System.out.println(var.equals(varString));
            System.out.println(var == varString);



        }

    }





}




