package AnimalRescue;

public class Veterinarian extends Human{
    private String vetName;
    private String vetSpecialization;



    public void checkHeartBeat() {
        System.out.println("Ba boom Ba bump");
    }


    //Tema Lab12: encapsulation
    //private String vetName
    public void setVetName(String vetName) {
        this.vetName = vetName;
    }
    public String getVetName() {
        return vetName;
    }

    //private String vetSpecialization
    public void setVetSpecialization(String vetSpecialization) {
        this.vetSpecialization = vetSpecialization;
    }
    public String getVetSpecialization() {
        return vetSpecialization;
    }


    @Override
    public void hugPet() {
        System.out.println("The doctor hugs the animal and pats it on the head");
    }

    @Override
    public void caressPet() {
        System.out.println("The doctor is touching the pet gently...");
    }
}


