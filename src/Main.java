public class Main {

    public static void testChainOfResponsibility(){
        String topTitle;
        DivideCategory comedy = new DivideCategory("Comedy");
        comedy.setTopCategoryTitle("Ghost World");

        DivideSubCategory comedyChildrens =
                new DivideSubCategory(comedy, "Childrens");

        DivideSubSubCategory comedyChildrensAquatic =
                new DivideSubSubCategory(comedyChildrens, "Aquatic");
        comedyChildrensAquatic.setTopSubSubCategoryTitle(
                "Sponge Bob Squarepants");


        System.out.println("");
        System.out.println("Getting top comedy title:");
        topTitle = comedy.getTopTitle();
        System.out.println("The top title for " +
                comedy.getAllCategories() +
                " is " + topTitle);


        System.out.println("");
        System.out.println("Getting top comedy/childrens title:");
        topTitle = comedyChildrens.getTopTitle();
        System.out.println("The top title for " +
                comedyChildrens.getAllCategories() +
                " is " + topTitle);


        System.out.println("");
        System.out.println(
                "Getting top comedy/childrens/aquatic title:");
        topTitle = comedyChildrensAquatic.getTopTitle();
        System.out.println("The top title for " +
                comedyChildrensAquatic.getAllCategories() +
                " is " + topTitle);
    }
    public static void testCommand(){
        DvdName jayAndBob =
                new DvdName("Jay and Silent Bob Strike Back");
        DvdName spongeBob =
                new DvdName("Sponge Bob Squarepants - " +
                        "Nautical Nonsense and Sponge Buddies");
        System.out.println("as first instantiated");
        System.out.println(jayAndBob.toString());
        System.out.println(spongeBob.toString());

        CommandAbstract bobStarsOn =
                new DvdCommandNameStarsOn(jayAndBob);
        CommandAbstract bobStarsOff =
                new DvdCommandNameStarsOff(jayAndBob);
        CommandAbstract spongeStarsOn =
                new DvdCommandNameStarsOn(spongeBob);
        CommandAbstract spongeStarsOff =
                new DvdCommandNameStarsOff(spongeBob);


        bobStarsOn.execute();
        spongeStarsOn.execute();
        System.out.println(" ");
        System.out.println("stars on");
        System.out.println(jayAndBob.toString());
        System.out.println(spongeBob.toString());


        spongeStarsOff.execute();
        System.out.println(" ");
        System.out.println("sponge stars off");
        System.out.println(jayAndBob.toString());
        System.out.println(spongeBob.toString());
    }

    public static void main(String[] args) {
        testChainOfResponsibility();
        System.out.println("############################################");
        testCommand();

    }
}

