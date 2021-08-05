import java.util.Random;

public class Problem extends GeneticAlgorithm{
    private double punish = 50000;
    private double buildCost = 1000;
    private double allCost = 0;
    private double openCost = 2000;

    public Problem(int geneSize) {
        super(geneSize);
    }

    public double getBuildCost() {
        return buildCost;
    }

    public double getAllCost() {
        return allCost;
    }

    public double getOpenCost() {
        return openCost;
    }

    public double getPunish() {
        return punish;
    }

    //将遗传算法的基因放置机场是否建设中
    public double copy(Chromosome chro, Airport[] airports){
        for (int i = 0; i < chro.gene.length; i++) {
            airports[i].setBuild(chro.gene[i]);
            if (airports[i].getBuild()) {
                allCost += openCost;
            }
        }
        return allCost;
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
//            airports[i].setBuild(getRandomBoolean());
        }
        System.out.println();
    }

    //机场分配并计算其成本

    public double buildPunishCost(City[] cities,Airport[] airports){
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < airports.length; j++) {
                if (airports[j].getBuild()) {
                    if (airports[j].getAbility() >= cities[i].getDemand()) {
                        cities[i].setAirportIndex(j + 1);
                        airports[j].setAbility(airports[j].getAbility() - cities[i].getDemand());
                    }
                }
            }
            if (cities[i].getAirportIndex() == 0) {
                allCost += punish;
            }
            System.out.print(cities[i].getAirportIndex() + " ");
        }
        return allCost;
    }

    //成本计算
    public double allCost(City[] cities,Airport[] airports){
        for (int i = 0; i < airports.length; i++) {
            if (airports[i].getBuild()) {
               allCost += buildCost;
            }
        }
        return allCost;
    }



    public boolean getRandomBoolean() {

        Random random = new Random();
        return random.nextBoolean();
    }


}
