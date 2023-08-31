public class Temperature {
    /**
     * This class store a temperature in Fahrenheit in the field ftemp.
     * */
    //ftemp is a field containing the temperature in Fahrenheit.
    private double ftemp;
    /**
     * This the default constructor.
     * */
    public Temperature() {
    }
    /**
     * A constructor with one double parameter
     * @param ftemp double corresponding to the parameter in
     */
    public Temperature(double ftemp) {
        this.ftemp = ftemp;
    }
    /**
     * This method change the ftemp field by another double.
     * @param ftemp a temperature in Fahrenheit saved a double.
     * */
    public void setFahrenheit(double ftemp) {
        this.ftemp = ftemp;
    }
    /**
     * This method return the tempure save in the field ftemp as a temperature un Fahrenheit.
     * @return ftemp a double variable
     * */
    public double getFahrenheit() {
        return this.ftemp;
    }

    /**
     * This method return the temperature stored in ftemp as a temperature in Celsius.
     * @return a double coresponding to the temperature in ftemp converted to Celsius
     */
    public double getCelsius() {
        return (5/9) * (ftemp - 32);
    }
    /**
     * This method return the temperature stored in ftemp as a temperature in Kelvin.
     * @return a double coresponding to the temperature in ftemp converted to Kelvin
     */
    public double getKelvin() {
        return ((5/9) * (ftemp - 32)) + 273;
    }
}
