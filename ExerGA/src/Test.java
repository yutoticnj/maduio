public class Test {
    public static void main(String[] args) {
        double cost = 0;
        double punish = 50000;


        City[] cities = new City[10];
        Airport[] airports = new Airport[5];
        Chromosome chro = new Chromosome(1);


        Test t =new Test();
        t.init(cities,airports);
        System.out.println("总成本是：" + t.calculate(cities,airports,cost,punish));
        //基因表示的十进制数
        chro.getNum();
        System.out.println(chro.getNum());
    }

    //初始化
    public void init(City[] cities,Airport[] airports){

        for (int i = 0; i < cities.length; i++) {
            cities[i] = new City();
            cities[i].setDemand(Math.random() * 7);
            cities[i].setAirportIndex(0);
        }

        for (int i = 0; i < airports.length; i++) {
            airports[i] = new Airport();
            airports[i].setCost(1000);
            airports[i].setAbility(Math.random() * 40);
            airports[i].setBuild((int) (Math.random() + 0.5));
            System.out.print(airports[i].isBuild());

        }
        System.out.println();
    }

    //机场分配

    public double punishCost(City[] cities,Airport[] airports,double cost,double punish){
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < airports.length; j++) {
                if (airports[j].isBuild() == 1) {
                    if (airports[j].getAbility() >= cities[i].getDemand()) {
                        cities[i].setAirportIndex(j + 1);
                        airports[j].setAbility(airports[j].getAbility() - cities[i].getDemand());
                    }
                }
            }
            if (cities[i].getAirportIndex() == 0) {
                cost += punish;}
            System.out.print(cities[i].getAirportIndex());
        }
        return cost;
    }

    //成本计算
    public double calculate(City[] cities,Airport[] airports,double cost,double punish){
        double openCost = 0;
        for (int i = 0; i < airports.length; i++) {
            if (airports[i].isBuild() == 1) {
                openCost += airports[i].getCost();
            }
        }
        return punishCost(cities,airports,cost,punish) + openCost;
    }

}
