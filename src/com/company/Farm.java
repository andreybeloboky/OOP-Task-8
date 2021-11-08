package com.company;

public class Farm {

    private Cat[] cats;
    private Dog[] dogs;
    private Cow[] cows;
    private int totalAgeCats;
    private int totalAgeDogs;
    private int totalAgeCows;
    private int addAnimal;
    private int numbersAddAnimals = 0;

    /**
     * @param cats - array cats from ages and names;
     * @param dogs - array dogs from ages and names;
     * @param caws - array caws from ages and names;
     */
    public Farm(Cat[] cats, Dog[] dogs, Cow[] caws) {
        this.cats = cats;
        this.dogs = dogs;
        this.cows = caws;
        this.totalAgeCats = this.calculateAgeAnimal(cats);
        this.totalAgeDogs = this.calculateAgeAnimal(dogs);
        this.totalAgeCows = this.calculateAgeAnimal(cows);
    }

    public int countAnimals() {
        return cats.length + dogs.length + cows.length + 1;
    }

    public int calculateMiddleAge() {
        return (totalAgeCats + totalAgeDogs + totalAgeCows + addAnimal) / (cats.length + dogs.length + cows.length + numbersAddAnimals);
    }

    /**
     * @param cat - add cat;
     */
    public void addCat(Cat cat) {
        addAnimal(cats, cat);
    }

    /**
     * @param dog - add dog;
     */
    public void addDog(Dog dog) {
        addAnimal(dogs, dog);
    }

    /**
     * @param cow - add cow;
     */
    public void addCow(Cow cow) {
        addAnimal(cows, cow);
    }

    /**
     * @return - count age animals;
     */
    private int calculateAgeAnimal(Animal[] animals) {
        int age = 0;
        for (Animal empl : animals) {
            age += empl.getAge();
        }
        return age;
    }

    /**
     * @param animals - array from cat, dog or cow;
     * @param animal - add animal;
     */
    private void addAnimal(Animal[] animals, Animal animal) {
        Animal[] newAnimal = new Animal[animals.length + 1];
        System.arraycopy(animals, 0, newAnimal, 0, animals.length);
        newAnimal[newAnimal.length - 1] = animal;
        this.addAnimal += newAnimal[newAnimal.length - 1].getAge();
        this.numbersAddAnimals += 1;
    }
}
