package fr.imt.coffee.machine.component;

public class Tank {
    private final double maxVolume;
    private final double minVolume;
    private double actualVolume;
    private Exception ExceptionTank;

    /**
     * Réservoir d'eau de la cafetière.
     * @param initialVolume Volume à mettre dans le réservoir à sa création
     * @param minVolume Volume minimal du réservoir
     * @param maxVolume Volume maximal du réservoir
     */
    public Tank(double initialVolume, double minVolume, double maxVolume){
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.actualVolume = initialVolume;
    }

    /**
     * Réduit le volume de matière dans le réservoir
     * @param volumeToDecrease Volume de matière à enlever dans le réservoir
     */
    public void decreaseVolumeInTank(double volumeToDecrease){
        double aV=this.getActualVolume();
        if (aV-volumeToDecrease>this.getMinVolume()) {
            this.actualVolume -= volumeToDecrease;
        }
        else this.actualVolume=this.minVolume;
    }

    /**
     * Augmente le volume de matière dans le réservoir
     * @param volumeToIncrease Volume de matière à ajouter dans le réservoir
     */
    public void increaseVolumeInTank(double volumeToIncrease){
        double aV=this.getActualVolume();
        if (aV+volumeToIncrease<this.getMaxVolume()) {
            this.actualVolume += volumeToIncrease;
        }
        else this.actualVolume=this.maxVolume;
    }

    public double getMaxVolume() {
        return maxVolume;
    }

    public double getMinVolume() {
        return minVolume;
    }

    public double getActualVolume() {
        return actualVolume;
    }
}
