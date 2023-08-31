public class Substance {
    private double temperature;

    public void setTemperature(double temp){
        this.temperature = temp;
    }

    public double getTemperature(){
        return this.temperature;
    }

    public Substance(){
    }

    public Substance(double temp){
        this.temperature = temp;
    }

    public boolean isEthylFreezing(){
        if(this.temperature <= -173){
            return true;
        }
        return false;
    }
    public boolean isEthylBoiling(){
        if(this.temperature >= 172){
            return true;
        }
        return false;
    }
    public boolean isOxygenFreezing(){
        if(this.temperature <= -362){
            return true;
        }
        return false;
    }
    public boolean isOxygenBoiling(){
        if(this.temperature >= -306){
            return true;
        }
        return false;
    }
    public boolean isWaterFreezing(){
        if(this.temperature <= 32){
            return true;
        }
        return false;
    }
    public boolean isWaterBoiling(){
        if(this.temperature >= 212){
            return true;
        }
        return false;
    }
}
