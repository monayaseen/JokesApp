package com.example.jokeprovide;

import java.util.ArrayList;
import java.util.Random;

public class MyClass {
   private static ArrayList<String>jokerList;
   public MyClass(){
       jokerList=new ArrayList<>();

       jokerList.add("I invented a new word!\n" + "Plagiarism!");

       jokerList.add("Did you hear about the mathematician who’s afraid of negative numbers?\n" +
               "He’ll stop at nothing to avoid them.");

       jokerList.add("Wife: Honey..... What are You Looking for?\n" +
               "Husband : Nothing.\n" +
               "Wife : Nothing...?? U've been reading our marriage certificate 4 an hour ??\n" +
               "Husband : I was just looking 4 the expiry date");

       jokerList.add("\n" +
               "When a man opens the door of his car for his wife, you\n" +
               "can be sure of one thing: either the car is new or the\n" +
               "wife is.\n" +
               "\n");
       jokerList.add("\n" +
               "Girl: When we get married, I want to share all your worries, troubles and\n" +
               "lighten your burden.\n" +
               "Boy: It's very kind of you, darling, But I don't have any worries or\n" +
               "troubles.\n" +
               "Girl: Well that's because we aren't married yet.");

       jokerList.add("\n" +
               "Father to son after exam: \"let me see your report card.\"\n" +
               "Son: \"My friend just borrow! ed it. He wants to scare his parents.\"\n" +
               "\n");
       jokerList.add("\n" +
               "man said his credit card was stolen but he decided\n" +
               "not to report it because the thief was spending less\n" +
               "than his wife did.\n");

       jokerList.add("\n" +
               "?\" JACK: \"Would you punish me for something I didn't do\n" +
               "\" TEACHER:\" Of course not.\n" +
               ".\" JACK: \"Good, because I haven't done my homework ..\n" +
               "\n");

       jokerList.add("\n" +
               "Two boys were arguing when the teacher entered the room.\n" +
               "The teacher says, \"Why are you arguing?\"\n" +
               "One boy answers, \"We found a ten dollar bill and decided to give it to whoever tells the biggest lie.\"\n" +
               "\"You should be ashamed of yourselves,\" said the teacher, \"When I was your age I didn't even know what a lie was.\"\n" +
               "The boys gave the ten dollars to the teacher");

       jokerList.add("I'm so good at sleeping. I can do it with my eyes closed.");
       jokerList.add("My boss told me to have a good day.. so I went home.");

   }
   public String getJoke(){
       Random random=new Random();
       return jokerList.get(random.nextInt(jokerList.size()));
   }
}
