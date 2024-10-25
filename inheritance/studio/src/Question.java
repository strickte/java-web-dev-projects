public abstract class Question {
    //field to store if answer was correct

    private boolean isCorrectlyAnswered;

    //still need constructor


    public boolean isCorrectlyAnswered() {
        return isCorrectlyAnswered;
    }

    public void setCorrectlyAnswered(boolean correctlyAnswered) {
        isCorrectlyAnswered = correctlyAnswered;
    }
}
