public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }

    public void enterMainMenu() {
        boolean isFlag = true;
        do {
            System.out.println("*******客户信息管理软件*******");
            System.out.println();
            System.out.println("\t" + "1 添 加 用 户");
            System.out.println("\t" + "2 修 改 用 户");
            System.out.println("\t" + "3 删 除 用 户");
            System.out.println("\t" + "4 用 户 列 表");
            System.out.println("\t" + "5 退       出");
            System.out.println();
            System.out.println("\t" + "请选择（1-5）：" );

            int menu = CMUtility.readMenuSelection();
            switch (menu) {
                case '1' -> addNewCustomer();
                case '2' -> modifyCustomer();
                case '3' -> deleteCustomer();
                case '4' -> listAllCustomers();
                default -> {
                    System.out.print("确认是否退出(Y/N)：");
                    char exit = CMUtility.readConfirmSelection();
                    if (exit == 'Y') {
                        isFlag = false;
                    }
                }
            }
        } while (isFlag);

    }

    private void addNewCustomer() {
        System.out.println("*********修添加客户*********");
        System.out.print("姓名：");
        String name = CMUtility.readString(5);
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String phone = CMUtility.readString(15);
        System.out.print("邮箱：");
        String email = CMUtility.readString(20);

        Customer cust = new Customer(name,gender,age,phone,email);
        boolean flag = customerList.addCustomer(cust);
        if (flag) {
            System.out.println("---------------------添加完成---------------------");
        } else {
            System.out.println("人数已达上限，添加失败！");
        }
    }

    private void modifyCustomer() {
        System.out.println("*********修改客户*********");
        Customer customer;
        int index;
        for (;;) {
            System.out.print("请选择待修改客户编号(-1退出)：");
            index = CMUtility.readInt();
            if (index == -1) {
                // break;//不能使用break
                return;
            }
            // 对于用户来讲，我们让index 默认从1开始。
            customer = customerList.getCustomer(index - 1);
            if (customer == null) {
                System.out.println("无法找到指定客户！");
            } else {
                break;
            }
        }
        System.out.print("姓名：(" + customer.getName() + "):");
        String name = CMUtility.readString(5,customer.getName());

        System.out.print("性别：(" + customer.getGender() + "):");
        char gender = CMUtility.readChar(customer.getGender());

        System.out.print("年龄：(" + customer.getAge() + "):");
        int age = CMUtility.readInt(customer.getAge());

        System.out.print("电话：("  + customer.getPhone() + "):");
        String phone = CMUtility.readString(15,customer.getPhone());

        System.out.print("邮箱：(" + customer.getEmail() + "):");
        String email = CMUtility.readString(20,customer.getEmail());

        Customer cust = new Customer(name,gender,age,phone,email);
        boolean flag = customerList.replaceCustomer(index - 1, cust);
        if (flag) {
            System.out.println("---------------------修改完成---------------------");
        } else {
            System.out.println("---------------------修改失败---------------------");
        }
    }

    private void deleteCustomer() {
        System.out.println("*********删除客户*********");
        Customer customer;
        int index;
        for (;;) {
            System.out.print("请选择待删除客户编号(-1退出)：");
            index = CMUtility.readInt();
            if (index == -1) {
                return;
            }
            // 对于用户来讲，我们让index 默认从1开始。
            customer = customerList.getCustomer(index - 1);
            if (customer == null) {
                System.out.println("无法找到指定客户！");
            } else {
                break;
            }
        }
        System.out.println("请确认是否删除：（Y/N）");
        char c = CMUtility.readConfirmSelection();
        boolean flag;
        if (c == 'Y') {
            flag = customerList.deleteCustomer(index - 1);
        }else {
            flag = false;
        }
        if (flag) {
            System.out.println("---------------------删除完成---------------------");
        } else {
            System.out.println("---------------------删除失败---------------------");
        }
    }

    private void listAllCustomers() {
        System.out.println("---------------------------客户列表---------------------------");
        Customer[] customers = customerList.getAllCustomers();
        if (customers.length == 0) {
            System.out.println("没有任何客户记录！");

        } else {
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
            for (int i = 0; i < customers.length; i++) {
                Customer cust = customers[i];
                // 方式一：
                // System.out.println((i + 1) + "\t" + cust.getName() + "\t"
                // + cust.getGender() + "\t" + cust.getAge() + "\t"
                // + cust.getPhone() + "\t\t" + cust.getEmail());
                // 方式二：
                System.out.println((i + 1) + "\t" + cust.getInfo());

            }
        }
        System.out
                .println("-------------------------客户列表完成-------------------------");
    }


}
