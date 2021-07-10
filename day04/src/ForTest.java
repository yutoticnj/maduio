/*
For循环的使用
循环结构的四个要素
1、初始化条件
2、循环条件
3、循环体
4、迭代条件

for(;;){
}
 */


public class ForTest {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("HelloWorld");
        }

        int num = 1;
        for (System.out.print("a");num <= 3; System.out.print("c"),num++) {
            System.out.print("b");
        }

        //输出100以内的偶数,并且求和，记录偶数的个数
        int sum = 0, count = 0;
        for (int i = 1; i <101 ; i++) {
            if (i % 2 ==0) {
                //System.out.println(i);
                sum += i;
                count++;
            }
        }
        System.out.println("总和是：" + sum);
        System.out.println("个数是：" + count);
    }
}

/*
编写程序从1-150,每行打印一个值
并且若是3的倍数则在后面加上  333
若是5的倍数则在后面加上  555
若是7的倍数则在后面加上  777
 */
class ForTest1 {
    public static void main(String[] args) {
        for (int i = 1; i <151 ; i++) {
            System.out.print(i + "  ");
            if (i % 3 ==0) {
                System.out.print("333 ");
            }
            if (i % 5 ==0) {
                System.out.print("555 ");
            }
            if (i % 7 ==0) {
                System.out.print("777");
            }
            System.out.println();

        }
    }
}
