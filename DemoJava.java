
public class DemoJava {

    public static void main(String[] args) {
        OddEvenPatern();
        System.out.println("");
        SecondProgram();
        System.out.println("");        
        ThirdProgram();
    }

    private static void OddEvenPatern() {
        int k = 4;
        for (int i = 1; i <= 5; i++) {
            int lastJCount = 0;
            for (int j = 0; j < k; j++) {
                System.out.print("*");
                lastJCount = j;
            }
            if(lastJCount ==0 & i % 2 != 0){
                lastJCount = -1;
            }
            for (int a = lastJCount + 1; a < 5; a++) {
                if (i % 2 == 0) {
                    System.out.print("E");
                } else {
                    System.out.print("O");
                }
            }
            k--;
            System.out.println();
        }
    }

    public static void SecondProgram() {

        for (int x = 1; x <= 5; x++) {
            if (x % 2 == 0) {
                for (int y = 1; y <= 5; y++) {
                    if (y == 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            } else {
                for (int y = 1; y <= 6; y++) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

    public static void ThirdProgram() {

        boolean odd,even;        

        for (int x = 1; x <= 5; x++) {
            if (x % 2 == 0) {                
                even = false;
                for (int y = 1; y <= 6; y++) {
                    if (even == true) {
                        System.out.print("E");
                        if (y % 2 == 0) {
                            even = false;
                        }
                    } else {
                        System.out.print("*");
                        if (y % 2 == 0) {
                            even = true;
                        }
                    }
                }
            } else {
                odd = false;
                for (int y = 1; y <= 6; y++) {
                    if (odd == true) {
                        System.out.print("*");
                        if (y % 2 == 0) {
                            odd = false;
                        }
                    } else {
                        System.out.print("0");
                        if (y % 2 == 0) {
                            odd = true;
                        }
                    }
                }
            }
            System.out.println("");

        }
    }

}
