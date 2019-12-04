package libs;

public class Libs {

    public static void sum(int slog1, int slog2) {
        int tempRes = slog1 + slog2;
        System.out.println("Result from method = " + tempRes);

    }

    public static int sum(String var1, int var2) {
        try {

            //String.format("Hello %d %d", var2, var2);
            // "34a5" -> 34
            int tempResult = var2 + Integer.parseInt(var1);
            System.out.println("Result String + int =  " + tempResult);
            return tempResult;
        } catch (NumberFormatException e) {
            System.out.println("Error " + e);
            return 88888;
        } catch (Exception e) {
            System.out.println("Error " + e);
            return 99999;
        }

    }

    public int mult(int mnojitel1, int mnojitel2) {
        int tempRes = mnojitel1 * mnojitel2;
        System.out.println("Result String + int =  " + tempRes);
        return tempRes;
    }

    public int del(int delitel1, int delitel2) {
        int tempRes = delitel1 / delitel2;
        System.out.println("Result String + int =  " + tempRes);
        return tempRes;

    }
    public void printArray(int[] tempArray, int value) {
        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i] < value) {
                System.out.println(tempArray[i] + " Элемент меньше value");
            } else if (tempArray[i] == value) {
                System.out.println(tempArray[i] + " Элемент равен value");
            } else if (tempArray[i] > value) {
                System.out.println(tempArray[i] + " Элемент больше value");
            }

        }
    }
ssssssssss
}

