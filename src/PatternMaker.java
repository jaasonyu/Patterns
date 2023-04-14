public class PatternMaker {
    public static void main(String[] args) {
        //instance of pattern maker
        PatternMaker stripes = new PatternMaker();
    }

    public PatternMaker() {
        //here is a constructor
        System.out.println("HI Pattern Maker");
        pattern1();
        pattern2();
        pattern3();
        pattern5();
        pattern6();
        pattern7();
        pattern8();
        pattern9();
        pattern12();
    }

    public void pattern1() {
        for (int x = 0; x < 6; x++) {
            //for(int y = 0; y<5;y++) {
            System.out.println(x * 5);
            //}
        }
    }

    public void pattern2() {
        for (int x = 0; x < 6; x++) {
            System.out.println(x * 5 + 2);
        }
    }

    public void pattern3() {
        for (int w = 21; w > 0; w = w - 4) {
            System.out.print(w + "\t");
            //print only makes everything on one line not separate in print1n
        }
    }

    public void pattern5() {
        for (int z = 1; z < 5; z++) {
            System.out.println();
            for (int c = 1; c < 5; c++) {
                System.out.print(c + "\t");
            }
        }
    }

    public void pattern6() {
        System.out.println();
        for (int p = 0; p < 5; p++) {
            for (int z = 0; z < p; z++) {
                System.out.print(" ");
            }
            System.out.println(p + 1);
        }
    }

    public void pattern7() {
        for (int z = 1; z < 6; z++) {
            System.out.println();
            for (int c = 1; c < 7 - z; c++) {
                System.out.print(z + "\t");
            }
        }
    }

    public void pattern8() {
        for (int z = 1; z < 6; z++) {
            System.out.println();
            for (int c = 1; c < z; c++) {
                System.out.print(" ");
            }
            for (int c = 1; c < 7 - z; c++) {
                System.out.print("*");
            }
        }
    }

    public void pattern9() {
        System.out.println();
        for (int o = 0; o < 6; o++) {
            for (int z = 0; z < o; z++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public void pattern12() {
        System.out.println();
            for (int o = 1; o < 6; o++) {
                System.out.println();
                for (int i = 1; i < o; i++) {
                    System.out.print("#");
                }
                for (int i = 1; i < 7 - o; i++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }





