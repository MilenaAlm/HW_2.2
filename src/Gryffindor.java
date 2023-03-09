public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;
    public Gryffindor(String name,
                      String faculty,
                      int magicPower,
                      int transgressionDistance,
                      int nobility,
                      int honor,
                      int courage) {
        super(name, faculty, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }
    public void PrintGryffindor() {
        System.out.println ("Имя: " + getName()  +
                ", из факультета: " + getFaculty() +
                ", имеет свойства: cила магии = " + getMagicPower() +
                ", расстояние трансгресии = " + getTransgressionDistance() +
                ", благородство = " + getNobility()+
                ", честь = " + getHonor() +
                ", храбрость = " + getCourage());
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
    private int ability(){
        return nobility + honor + courage;
    }
    public void compareGryffindor(Gryffindor gryffindor){
        int ability1 = ability();
        int ability2 = gryffindor.ability();
        if (ability1 > ability2){
            System.out.printf("Гриффиндорец %s лучше, чем гриффиндорец %s: %d VS %d%n",
                    getName(),
                    gryffindor.getName(),
                    ability1,
                    ability2
            );
        } else if ( ability2 > ability1) {
            System.out.printf("Гриффиндорец %s лучше, чем гриффиндорец %s: %d VS %d%n",
                    gryffindor.getName(),
                    getName(),
                    ability2,
                    ability1
            );
        }else {
            System.out.printf("Гриффиндорец %s такой же, как гриффиндорец %s: %d VS %d%n",
                    gryffindor.getName(),
                    getName(),
                    ability1,
                    ability2
            );
        }

    }
}


