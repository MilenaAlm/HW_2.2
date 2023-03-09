class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name,
                     String faculty,
                     int magicPower,
                     int transgressionDistance,
                     int cunning,
                     int determination,
                     int ambition,
                     int resourcefulness,
                     int lustForPower) {
        super(name, faculty, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }
    public void PrintSlytherin() {
        System.out.println ("Имя: " + getName() +
                ", Из факультета: " + getFaculty() +
                ", имеет свойства: cила магии = " + getMagicPower() +
                ", расстояние трансгресии = " + getTransgressionDistance() +
                ", хитрость  = " + getCunning()+
                ", решительность = " + getDetermination() +
                ", амбициозность = " + getAmbition() +
                ", находчивость = " + getResourcefulness() +
                ", жажда власти = " + getLustForPower());
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
    private int ability(){
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }
    public void compareSlytherin(Slytherin slytherin){
        int ability1 = ability();
        int ability2 = slytherin.ability();
        if (ability1 > ability2){
            System.out.printf("Слизеринец %s лучше, чем слизеринец %s: %d VS %d%n",
                    getName(),
                    slytherin.getName(),
                    ability1,
                    ability2
            );
        } else if ( ability2 > ability1) {
            System.out.printf("Слизеринец %s лучше, чем слизеринец %s: %d VS %d%n",
                    slytherin.getName(),
                    getName(),
                    ability2,
                    ability1
            );
        }else {
            System.out.printf("Слизеринец %s такой же, как слизеринец %s: %d VS %d%n",
                    slytherin.getName(),
                    getName(),
                    ability1,
                    ability2
            );
        }

    }
}
