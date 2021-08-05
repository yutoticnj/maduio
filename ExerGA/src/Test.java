public class Test extends Problem{
    public Test(int geneSize) {
        super(geneSize);
    }

    public static void main(String[] args) {

        City[] cities = new City[10];
        for (int i = 0; i < cities.length; i++) {
            cities[i] = new City();
        }
        Airport[] airports = new Airport[5];
        for (int i = 0; i < airports.length; i++) {
            airports[i] = new Airport();
        }
        Chromosome chro = new Chromosome(5);

        Test test =new Test(5);
        test.init(cities,airports);
        test.copy(chro,airports);
        test.buildPunishCost(cities,airports);
        for (int i = 0; i < airports.length; i++) {
            System.out.print(airports[i].getBuild() + " ");
        }
        System.out.println("总成本是：" + test.allCost(cities,airports));

        test.caculte();



    }
}
