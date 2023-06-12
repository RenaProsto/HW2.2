public class Griffindor extends Hogwards {
    private int nobility;

    private int honor;

    private int bravery;


    @Override
    public String toString() {
        return " Гриффиндор: " + super.toString() +
                " Благородство - " + nobility +
                " Честь - " + honor +
                " Храбрость - " + bravery;
    }

    @Override
    public int checkingSpecificSkills() {
        return this.nobility + this.honor + this.bravery;
    }



    public Griffindor(String studentsName, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(studentsName, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

}
