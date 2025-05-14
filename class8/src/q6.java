public class q6 {
    public static void main(String[] args) {
        int unit = 549;
        double u100 = 420, u200= 1020, u400 = 2620;
        double amt = 0.0;
        if (unit > 0 && unit <= 100){
            amt = unit * 4.2;
        } else if (unit > 100 && unit <= 200) {
            amt = u100 + (unit - 100) * 6;
        } else if (unit > 200 && unit <= 400) {
            amt = u200 + (unit - 200 ) * 8;
        }else{
            amt = u400 + (unit - 400) *13;
        }
        System.out.println(amt);
    }
}
