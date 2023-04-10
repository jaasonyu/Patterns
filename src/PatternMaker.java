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
        for (int w = 21; w > 0; w=w-4) {
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
    }

