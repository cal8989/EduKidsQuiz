package com.paradeeez.truequiz;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {

    private static List<QuestionsList> alphabetQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();


        final QuestionsList questionsList1 = new QuestionsList("What is the items that started with letter 'd'?", "Dice", "Yogurt", "Umbrella", "Key","Dice", "");
        final QuestionsList questionsList2 = new QuestionsList("What is the items that started with letter 'i'?", "Vase", "Ice", "Zip", "Paper","Ice", "");
        final QuestionsList questionsList3 = new QuestionsList("What is the items that started with letter 'a'?", "Rice", "Cup", "Axe", "Gem","Axe", "");
        final QuestionsList questionsList4 = new QuestionsList("What is the items that started with letter 'h'?", "Gem", "Sun", "Table", "House","House", "");
        final QuestionsList questionsList5 = new QuestionsList("What is the items that started with letter 'm'?", "Paper", "Milk", "Water", "Fan","Milk", "");
        final QuestionsList questionsList6 = new QuestionsList("What is the items that started with letter 'l'?", "Log", "Net", "Net", "Oil","Log", "");
        final QuestionsList questionsList7 = new QuestionsList("What is the items that started with letter 'c'?", "Ball", "Axe", "Rice", "Cup","Cup", "");
        final QuestionsList questionsList8 = new QuestionsList("What is the items that started with letter 'e'?", "Xray", "Queen", "Earth", "Zip","Earth", "");


        questionsLists.add(questionsList1);
        questionsLists.add(questionsList2);
        questionsLists.add(questionsList3);
        questionsLists.add(questionsList4);
        questionsLists.add(questionsList5);
        questionsLists.add(questionsList6);
        questionsLists.add(questionsList7);
        questionsLists.add(questionsList8);

        return questionsLists;
    }

    private static  List<QuestionsList> numberQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();


        final QuestionsList questionsList1 = new QuestionsList("What is the number '1' called?", "One", "Three", "Five", "Seven","One", "");
        final QuestionsList questionsList2 = new QuestionsList("What is the number '3' called?'", "Two", "Five", "Three", "Eleven","Three", "");
        final QuestionsList questionsList3 = new QuestionsList("What is the number '4' called?", "Three", "Four", "Nine", "Twelve","Four", "");
        final QuestionsList questionsList4 = new QuestionsList("What is the number '6' called?", "Five", "Seven", "Thirteen", "Six","Six", "");
        final QuestionsList questionsList5 = new QuestionsList("What is the number '8' called?", "One", "Four", "Eight", "Fifteen","Eight", "");
        final QuestionsList questionsList6 = new QuestionsList("What is the number '10' called?", "Two", "Five", "Eleven", "Ten","Ten", "");
        final QuestionsList questionsList7 = new QuestionsList("What is the number '11' called?", "Eleven", "Twelve", "Four", "Nine","Eleven", "");
        final QuestionsList questionsList8 = new QuestionsList("What is the number '14' called?", "Eight", "Fourteen", "Ten", "Six","Fourteen", "");


        questionsLists.add(questionsList1);
        questionsLists.add(questionsList2);
        questionsLists.add(questionsList3);
        questionsLists.add(questionsList4);
        questionsLists.add(questionsList5);
        questionsLists.add(questionsList6);
        questionsLists.add(questionsList7);
        questionsLists.add(questionsList8);

        return questionsLists;
    }

    private static  List<QuestionsList> animalQuestion() {

        final List<QuestionsList> questionsLists = new ArrayList<>();


        final QuestionsList questionsList1 = new QuestionsList("what is the animal that eat grass and goes 'baa'?", "Goat", "Cat", "Armadillo", "Elephant","Goat", "");
        final QuestionsList questionsList2 = new QuestionsList("what is the animal that have whiskers and meows?", "Giraffe", "Rhino", "Goat", "Cat","Cat", "");
        final QuestionsList questionsList3 = new QuestionsList("what is the animal that run fast and neigh?", "Duck", "Horse", "Dog", "Chicken","Horse", "");
        final QuestionsList questionsList4 = new QuestionsList("what is the animal that roars and is called the King of the Jungle", "Rabbit", "Grasshopper", "Lion", "Snake","Lion", "");
        final QuestionsList questionsList5 = new QuestionsList("what is the animal swims fast", "Fish", "Lion", "Deer", "Dolphin","Dolphin", "");
        final QuestionsList questionsList6 = new QuestionsList("what is the animal can swing from trees to trees?", "Monkey", "Bear", "Gorilla", "Bat","Monkey", "");
        final QuestionsList questionsList7 = new QuestionsList("what is the animal that is tall and have long neck?", "Bear", "Cat", "Giraffe", "Rabbit","Giraffe", "");
        final QuestionsList questionsList8 = new QuestionsList("what is the animal that is a pet and have long ears", "Rabbit", "Fox", "Fish", "Bee","Rabbit", "");


        questionsLists.add(questionsList1);
        questionsLists.add(questionsList2);
        questionsLists.add(questionsList3);
        questionsLists.add(questionsList4);
        questionsLists.add(questionsList5);
        questionsLists.add(questionsList6);
        questionsLists.add(questionsList7);
        questionsLists.add(questionsList8);

        return questionsLists;
    }

    private static  List<QuestionsList> fruitQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();


        final QuestionsList questionsList1 = new QuestionsList("What is the fruit that is purple and oblong to round shape?", "Orange", "Apple", "Papaya", "Eggplant","Eggplant", "");
        final QuestionsList questionsList2 = new QuestionsList("What is the fruit that is green and thorny?", "Pomegranate", "Bananas", "Durian", "Muskmelon","Durian", "");
        final QuestionsList questionsList3 = new QuestionsList("What is the fruit that is yellow when ripe and grow in cluster?", "Lemon", "Banana", "Avocado", "Mangosteen","Banana", "");
        final QuestionsList questionsList4 = new QuestionsList("What is the fruit that is brownish green and furry?", "Lychee", "Kiwi", "Mangosteen", "Muskmelon","Kiwi", "");
        final QuestionsList questionsList5 = new QuestionsList("What is the fruit that have hard shell and grows in high trees?", "Orange", "Mango", "Pineapple", "Coconut","Coconut", "");
        final QuestionsList questionsList6 = new QuestionsList("What is the fruit that is pear-shaped and rough green outer skin?", "Apple", "Eggplant", "Avocado", "Pomegranate","Avocado", "");
        final QuestionsList questionsList7 = new QuestionsList("What is the fruit that is round, small and is called dragon's eye?", "Longan", "Lemon", "Kiwi", "Banana","Longan", "");
        final QuestionsList questionsList8 = new QuestionsList("What is the fruit that is red, scaly, leathery skinned and translucent flesh?", "Durian", "Orange", "Pineapple", "Lychee","Lychee", "");


        questionsLists.add(questionsList1);
        questionsLists.add(questionsList2);
        questionsLists.add(questionsList3);
        questionsLists.add(questionsList4);
        questionsLists.add(questionsList5);
        questionsLists.add(questionsList6);
        questionsLists.add(questionsList7);
        questionsLists.add(questionsList8);

        return questionsLists;
    }

    private static  List<QuestionsList> bodyPartQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();


        final QuestionsList questionsList1 = new QuestionsList("what is the name of the body part that is used to hear sounds?", "Ears", "Knees", "Eyes", "Mouth","Ears", "");
        final QuestionsList questionsList2 = new QuestionsList("what is the name of the body part that is used to smell?", "Hands", "Nose", "Fingers", "Shoulders","Nose", "");
        final QuestionsList questionsList3 = new QuestionsList("what is the name of the body part that is used to walk?", "Toes", "Ears", "Legs", "Head","Legs", "");
        final QuestionsList questionsList4 = new QuestionsList("what is the name of the body part that is used to hold things in hand?", "Eyes", "Nose", "Hands", "Fingers","Fingers", "");
        final QuestionsList questionsList5 = new QuestionsList("what is the name of the body part that is used to talk and eat?", "Mouth", "Knees", "Shoulders", "Ears","Mouth", "");
        final QuestionsList questionsList6 = new QuestionsList("what is the name of the body part that provides balance when walking?", "Toes", "Mouth", "Knees", "Ears","Toes", "");
        final QuestionsList questionsList7 = new QuestionsList("what is the name of the body part that houses the brain?", "Eyes", "Hands", "Fingers", "Head","Head", "");
        final QuestionsList questionsList8 = new QuestionsList("what is the name of the body part that is used as a joint to rotate arms?", "Shoulders", "Mouth", "Legs", "Ears","Shoulders", "");


        questionsLists.add(questionsList1);
        questionsLists.add(questionsList2);
        questionsLists.add(questionsList3);
        questionsLists.add(questionsList4);
        questionsLists.add(questionsList5);
        questionsLists.add(questionsList6);
        questionsLists.add(questionsList7);
        questionsLists.add(questionsList8);

        return questionsLists;
    }

    private static  List<QuestionsList> colourQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();


        final QuestionsList questionsList1 = new QuestionsList("what is the colour of paper?", "Gray", "Black", "Orange", "White","White", "");
        final QuestionsList questionsList2 = new QuestionsList("what is the colour of apple?", "Red", "Green", "Blue", "Pink","Red", "");
        final QuestionsList questionsList3 = new QuestionsList("what is the colour of chocolate?", "White", "Purple", "White", "Brown","Brown", "");
        final QuestionsList questionsList4 = new QuestionsList("what is the colour of the sky during the day?", "Black", "Orange", "Blue", "White","Blue", "");
        final QuestionsList questionsList5 = new QuestionsList("what is the colour of flamingo", "Red", "Pink", "Orange", "Green","Pink", "");
        final QuestionsList questionsList6 = new QuestionsList("what is the colour of leaves and grass?", "Green", "Green", "Black", "Red","Green", "");
        final QuestionsList questionsList7 = new QuestionsList("what is the colour of sunflower?", "Brown", "Pink", "Yellow", "Orange","Yellow", "");
        final QuestionsList questionsList8 = new QuestionsList("what is the colour of grapes?", "White", "Blue", "Black", "Purple","Purple", "");


        questionsLists.add(questionsList1);
        questionsLists.add(questionsList2);
        questionsLists.add(questionsList3);
        questionsLists.add(questionsList4);
        questionsLists.add(questionsList5);
        questionsLists.add(questionsList6);
        questionsLists.add(questionsList7);
        questionsLists.add(questionsList8);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "alphabet":
                return alphabetQuestions();
            case "number":
                return numberQuestions();
            case "animal":
                return animalQuestion();
            case "fruit":
                return fruitQuestions();
            case "bodyPart":
                return bodyPartQuestions();
            case "colour":
                return colourQuestions();
            default:
                return null;
        }
    }
}
