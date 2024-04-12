package EX_02_PizzaCalories_04;

public class Dough {
    //-	flourType: String
    private String flourType;
    //-	bakingTechnique: String
    private String bakingTechnique;
    //-	weight: double
    private double weight;
    //+ 	Dought (String, String, double)

    public Dough(String flourType, String bakingTechnique, double weight) {
        setWeight(weight);
        setBakingTechnique(bakingTechnique);
        setFlourType(flourType);
    }

    //-	setWeight(double): void

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 200) {
            this.weight = weight;
        } else {
            String message = "Dough weight should be in the range [1..200].";
            throw new IllegalArgumentException(message);
        }
    }

    //-	setFlourType(String): void
    //•	White – 1.5;
    //•	Wholegrain – 1.0;

    private void setFlourType(String flourType) {
        if (flourType.equals("White") || flourType.equals("Wholegrain")) {
            this.flourType = flourType;
        } else {
            String message = "Invalid type of dough.";
            throw new IllegalArgumentException(message);
        }
    }

    //-	setBakingTechnique(String): void
    //•	Crispy – 0.9;
    //•	Chewy – 1.1;
    //•	Homemade – 1.0;
    private void setBakingTechnique(String bakingTechnique) {
        if (bakingTechnique.equals("Crispy") || bakingTechnique.equals("Chewy") || bakingTechnique.equals("Homemade")) {
            this.bakingTechnique = bakingTechnique;
        } else {
            String message = "Invalid type of dough.";
            throw new IllegalArgumentException(message);
        }
    }

    //+	calculateCalories (): double
    //•	White – 1.5;
    //•	Wholegrain – 1.0;
    public double calculateCalories (){

        double flourTypeCoefficient = 0;
        double bakingTechniqueCoefficient = 0;

        if(this.flourType.equals("White")){
            flourTypeCoefficient = 1.5;
        } else if (this.flourType.equals("Wholegrain")) {
            flourTypeCoefficient = 1.0;
        }
        //•	Crispy – 0.9;
        //•	Chewy – 1.1;
        //•	Homemade – 1.0;
        if(this.bakingTechnique.equals("Crispy")){
            bakingTechniqueCoefficient = 0.9;
        } else if (this.bakingTechnique.equals("Chewy")) {
            bakingTechniqueCoefficient = 1.1;
        } else if (this.bakingTechnique.equals("Homemade")) {
            bakingTechniqueCoefficient = 1.0;
        }
        return (this.weight * 2) * flourTypeCoefficient * bakingTechniqueCoefficient ;
    }
}
