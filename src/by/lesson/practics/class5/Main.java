package by.lesson.practics.class5;



public class Main {
    public static void main(String[] args) {
        CoffeMachine coffeMachine1 = new CoffeMachine("LG", "Кофемашина",123,true);
        CoffeMachine coffeMachine2 = new CoffeMachine("Delongy", "американо",123,true);


        Fridge fridge1 = new Fridge("LG", "R1222", 12, true);

        Stiralka stiralka1 = new Stiralka("RT", "Q4567", 123.12, false);

        Pilesos pilesos1 = new Pilesos("erer", "T67777", 12777.566, true);

        Electropribori[] electropriboris = {coffeMachine1, coffeMachine2, fridge1, pilesos1, stiralka1};


        for (Electropribori el : electropriboris){
            el.work();
        }


        KitchenTecnika[] kitchenTecnikas = {fridge1, stiralka1};

        for (KitchenTecnika kt : kitchenTecnikas) {
            kt.work();
        }
    }

}