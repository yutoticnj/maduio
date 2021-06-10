/*
break 和 continue关键字的应用

break： 在switch-case 结构中
        在循环结构中              结束当前循环

continue：在循环结构中             结束当次循环

关键字后面不能声明语句
 */


public class BreakContinueTest {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            if (i % 4 == 0) {
                //break;  1 2 3
                continue; //1 2 3 5 6 7 9 10
            }
            System.out.print(i);
        }
        System.out.println();
        System.out.println();
        //*********************
        label: for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 11; j++) {
                if (j % 4 == 0) {
                    //break; //跳出包裹此关键字最近的一层循环 123  123   123
                    //continue;
                    //break label;// 结束指定标识的一层循环
                    continue label;//结束指定标识的这一次循环
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
