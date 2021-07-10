//一个数恰好等于他的因子之和  这个数就称为完数   6=1+2+3
//找出1000以内的所有完数
public class WanShuExer {
    public static void main(String[] args) {
        int factor = 0;
        for (int i = 1; i < 1001; i++) {
            for (int j = 1; j <= i/2; j++) {
                if (i % j == 0) {
                    factor += j;
                }
            }
            if (i == factor) {
                System.out.println(i);
            }
            factor = 0;
        }
    }
}
