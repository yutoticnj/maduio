/*
九九乘法表
1*1=1
2*1=2 2*2=4
3*1=3 3*2=6 3*3=9
.........
 */
public class NineNineTableTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {//控制行数
            for (int j = 1; j <= i; j++) {//控制列数
                System.out.print(i + "*" + j + "=" + i * j +" ");
            }
            System.out.println();
        }
    }
}
