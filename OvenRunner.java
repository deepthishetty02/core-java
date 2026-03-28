class OvenRunner {

    public static void main(String[] args) {

        
        System.out.println(Oven.brandName);

        String brand = Oven.getBrandName();
        System.out.println(brand);

        int maxTemp = Oven.getMaxTemperature();
        System.out.println(maxTemp);

        boolean electric = Oven.getIsElectric();
        System.out.println(electric);

        double cap = Oven.getCapacity();
        System.out.println(cap);

        char grade = Oven.getEnergyGrade();
        System.out.println(grade);

        long model = Oven.getModelNumber();
        System.out.println(model);

        float wt = Oven.getWeight();
        System.out.println(wt);

    }

}