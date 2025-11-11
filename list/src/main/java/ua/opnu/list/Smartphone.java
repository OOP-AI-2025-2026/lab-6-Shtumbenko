package ua.opnu.list;

class Smartphone implements GPS, Cellular {

    private String model;

    public Smartphone(String model) {
        this.model = model;
    }

    public Smartphone() {

    }

    @Override
    public double[] getCoordinates() {
        return new double[]{46.4825, 30.7233};
    }

    @Override
    public void makeCall() {
        System.out.println(model + ": Телефонуємо...");
    }

    @Override
    public void receiveCall() {
        System.out.println(model + ": Приймаємо дзвінок...");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
