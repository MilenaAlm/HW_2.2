public class Hogwarts {
    private String name;
    private String faculty;
    private int MagicPower;
    private int transgressionDistance;

    public Hogwarts(String name, String faculty, int magicPower, int transgressionDistance) {
        this.name = name;
        this.faculty = faculty;
        MagicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getMagicPower() {
        return MagicPower;
    }

    public void setMagicPower(int magicPower) {
        MagicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }
}
class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, String faculty, int magicPower, int transgressionDistance, int nobility,
                      int honor, int courage) {
        super(name, faculty, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
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

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }
}
class Hufflepuff extends Hogwarts {
    private int hardWorking;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String faculty, int magicPower, int transgressionDistance, int hardWorking,
                      int loyalty, int honesty) {
        super(name, faculty, magicPower, transgressionDistance);
        this.hardWorking = hardWorking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWorking() {
        return hardWorking;
    }

    public void setHardWorking(int hardWorking) {
        this.hardWorking = hardWorking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
class Kogtevran extends Hogwarts {
    private int smarty;
    private int wisdom;
    private int wit;
    private int fullOfCreative;

    public Kogtevran(String name, String faculty, int magicPower, int transgressionDistance, int smarty,
                     int wisdom, int wit, int fullOfCreative) {
        super(name, faculty, magicPower, transgressionDistance);
        this.smarty = smarty;
        this.wisdom = wisdom;
        this.wit = wit;
        this.fullOfCreative = fullOfCreative;
    }

    public int getSmarty() {
        return smarty;
    }

    public void setSmarty(int smarty) {
        this.smarty = smarty;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getFullOfCreative() {
        return fullOfCreative;
    }

    public void setFullOfCreative(int fullOfCreative) {
        this.fullOfCreative = fullOfCreative;
    }
}
class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, String faculty, int magicPower, int transgressionDistance, int cunning, int determination,
                     int ambition, int resourcefulness, int lustForPower) {
        super(name, faculty, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
}


