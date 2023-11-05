package SolarSystem;

public class main {

    public static void main(String[] args) {

        solarSystemBasics solarNew = new solarSystemBasics();
        solarNew.Sun = "1";
        solarNew.Moon = "2";
        solarNew.Planets = "2";
        solarNew.Stars = "10";

        FeatureSun sunFeature = new FeatureSun();
        sunFeature.color = "red";
        sunFeature.name = "panther";
        sunFeature.temp = "-124342342";

        FeaturePlanet planetFeature = new FeaturePlanet();
        planetFeature.num = "8";
        planetFeature.names.add("Mercury");
        planetFeature.names.add("Venus");
        planetFeature.names.add("Earth");
        planetFeature.names.add("Mars");
        planetFeature.names.add("Jupiter");
        planetFeature.names.add("Saturn");
        planetFeature.names.add("Uranus");
        planetFeature.names.add("Neptune");

        Planet1 pl1 = new Planet1();
        pl1.name = "Pluto";
        pl1.color = "red";
        pl1.radius = "1234.5";
        pl1.temp = "243242352";

    }
}
