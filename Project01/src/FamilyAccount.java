public class FamilyAccount {
    public static void main(String[] args) {

        boolean isFlag = true;
        //用于记录用户的支出收入详情
        String details = "";
        int balance = 0;

        while (isFlag) {

            System.out.println("---------------家庭收支记账软件---------------\n");
            System.out.println("                 1 收支明细");
            System.out.println("                 2 登记收入");
            System.out.println("                 3 登记支出");
            System.out.println("                 4 退   出\n");
            System.out.print("               请选择（1-4）： ");
            //获取用户的选择
            char selection = Utility.readMenuSelection();
            switch (selection) {

                case '1':
                    System.out.println("---------------当前收支明细记录---------------");
                    System.out.println("收支"+ "\t" + "账户余额" + "\t\t" + "收支金额" + "\t\t" + "说明");
                    System.out.println(details);
                    System.out.println("-------------------------------------------");
                    break;
                case '2':
                    System.out.print("本次收入金额：");
                    int addMoney = Utility.readNumber();
                    System.out.print("本次收入说明：");
                    String addInfo = Utility.readString();

                    //处理balance
                    balance += addMoney;
                    //处理details
                    details += "收入\t" + balance + "\t\t" + addMoney + "\t\t" + addInfo + "\n";
                    System.out.println("---------------登记完成---------------\n");
                    break;
                case '3':
                    System.out.print("本次支出金额：");
                    int minusMoney= Utility.readNumber();
                    System.out.print("本次支出说明：");
                    String  minusInfo= Utility.readString();
                    //处理balance
                    balance -= minusMoney;
                    //处理details
                    details += "支出\t" + balance + "\t\t" + minusMoney + "\t\t" + minusInfo + "\n";
                    System.out.println("---------------登记完成---------------\n");
                    break;
                case '4':
                    System.out.print("确认是否退出（Y/N）: ");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
            }
        }
    }
}
