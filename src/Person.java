public class Person {
    /**
     *  We probably won't use all of these on account of most of our people
     *  will probably be born.
     * @param age
     * @param alignment
     * @param education
     * @param health
     * @param height
     * @param housed
     * @param hunger
     * @param married
     * @param name
     * @param occupation
     * @param religion
     * @param sex
     * @param thirst
     * @param weight
     */
    public Person(int age, 
            int     alignment, 
            int     education, 
            int     health,
            double  height, 
            boolean housed, 
            int     hunger, 
            boolean married,
            String  name, 
            String  occupation, 
            String  religion, 
            boolean sex,
            int     thirst, 
            double  weight) {
        super();
        this.age = age;
        this.alignment = alignment;
        this.education = education;
        this.health = health;
        this.height = height;
        this.housed = housed;
        this.hunger = hunger;
        this.married = married;
        this.name = name;
        this.occupation = occupation;
        this.religion = religion;
        this.sex = sex;
        this.thirst = thirst;
        this.weight = weight;
    }
    
    public Person(){
        // Nothing for now, eventually maybe we will have a default for children
        // and another for like... traders or... something
    }
    private int     age        = 0;
    private int     alignment  = 0;
    private int     education  = 0;
    private int     health     = 0;
    private double  height     = 0;
    private boolean housed     = false;
    private int     hunger     = 0;
    private boolean married    = false;
    private String  name       = "";
    private String  occupation = "";
    private String  religion   = "";
    private boolean sex        = false;
    private int     thirst     = 0;
    private double  weight     = 0;
    
    // We could categorize these into civilization types, ex: make 'Smith' 
    // become more popular when artisan smiths are available
    private String[] maleFirstName   = {"Aaron", "Adam", "Brandon", "Brian"};
    private String[] femaleFirstName = {"Amanda", "Ashley", "Bailey", "Britt"};
    private String[] lastName        = {"Arman", "Askinov", "Brooks", "Brown"};
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAlignment() {
        return alignment;
    }

    public void setAlignment(int alignment) {
        this.alignment = alignment;
    }

    public int getEducation() {
        return education;
    }

    public void setEducation(int education) {
        this.education = education;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isHoused() {
        return housed;
    }

    public void setHoused(boolean housed) {
        this.housed = housed;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
}
