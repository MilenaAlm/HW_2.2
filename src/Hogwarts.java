import java.time.Year;

public class Hogwarts {
    private String name;
    private String faculty;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name,
                    String faculty,
                    int magicPower,
                    int transgressionDistance) {
        this.name = name;
        this.faculty = faculty;
        this.magicPower = magicPower;
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
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    private int ability(){
        return magicPower + transgressionDistance;
    }
    public void compareHogwarts(Hogwarts hogwarts){
        int ability1 = ability();
        int ability2 = hogwarts.ability();
        if (ability1 > ability2){
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n",
                    getName(),
                    hogwarts.getName(),
                    ability1,
                    ability2
            );
        } else if ( ability2 > ability1) {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n",
                    hogwarts.getName(),
                    getName(),
                    ability2,
                    ability1
            );
        }else {
            System.out.printf("Студент %s такой же, как студент %s: %d VS %d%n",
                    hogwarts.getName(),
                    getName(),
                    ability1,
                    ability2
            );
        }

    }
}





