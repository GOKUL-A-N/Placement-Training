public class DigitManipulation {

    //  finding even numbers from a given number
    public static void main(String[] args) {
        // Construcion (right construction , left construction) 
        // extraction  (right extraction , left extraction)
        int val = 45672;
        int pv = 1;
        while(val/pv != 0){
            pv *= 10;
        }
        while(pv!=1){
            pv /= 10;
            int res = (val / pv) % 10;
            if(res % 2 == 0){
                System.out.println(res);
            }
        }
    }
}       
// 6829

    // for extraction  formula : (digit / pv) % 10