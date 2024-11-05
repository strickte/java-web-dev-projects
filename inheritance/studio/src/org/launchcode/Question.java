package org.launchcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;



public abstract class Question {
    //field to store if answer was correct
//    private boolean isCorrectlyAnswered;
    //still need constructor
//    public boolean isCorrectlyAnswered() {
//        return isCorrectlyAnswered;
//    }
//    public void setCorrectlyAnswered(boolean correctlyAnswered) {
//        isCorrectlyAnswered = correctlyAnswered;
//    }

    private final String question;
    private final HashMap<Integer, Choice> choiceMap = new HashMap();
    private int maxResponses = 1;

    public Question(String question, Choice[] choiceArray) {
        this.question = question;
        createRandomizedChoiceMap(choiceArray);

    }

    public String getQuestion() {
        return question;
    }

    public HashMap<Integer, Choice> getChoiceMap() {
        return choiceMap;
    }

    public int getMaxResponses() {
        return maxResponses;
    }

    public void setMaxResponses(int maxResponses) {
        this.maxResponses = maxResponses;
    }
    @Override
    public abstract String toString();

    void createRandomizedChoiceMap(Choice[] choiceArray) {
        ArrayList<Choice> choiceList = new ArrayList<>();
        Collections.addAll(choiceList, choiceArray);
        Collections.shuffle(choiceList);
        for (int i=0; i < choiceList.size(); i++) {
            choiceMap.put(i+1, choiceList.get(i));
        }
    }

    String getFormattedChoices() {
        StringBuilder formattedChoices = new StringBuilder();
        String newline = System.lineSeparator();
        for (int choiceNum : choiceMap.keySet()) {
            String choice = "\t" + choiceNum + " - " + choiceMap.get(choiceNum) + newline;
            formattedChoices.append(choice);
        }
        return formattedChoices.toString();
    }

    public boolean isInvalid(String resp) {
        try {
            int resptInt = Integer.parseInt(resp);
            return resptInt < 0 || resptInt > choiceMap.size();
        } catch (NumberFormatException e) {
            return true;
        }
    }

}
