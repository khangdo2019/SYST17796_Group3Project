package SoftwareFinalCode;

/**
 * A class that creates one question object.
 *
 * @author Sunha
 * @modifier HsiaoHsienKuo
 */
public class Question {

    private String question = null; // A String data field save question 
    private String opt1, opt2, opt3 = null; // A String data field save answers 
    private String userChoice = null; // A String data field save user choice 

    /**
     * A default constructor of this class.
     */
    public Question() {
    }

    /**
     * A constructor to create a car brand question object.
     *
     * @param question
     * @param opt1
     * @param opt2
     */
    public Question(String question, String opt1, String opt2) {
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.question = question;
    }

    /**
     * A constructor to create a creating car brand question object.
     *
     * @param question
     * @param opt1
     * @param opt2
     * @param opt3
     */
    public Question(String question, String opt1, String opt2, String opt3) {
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.question = question;
    }

    /**
     * An accessor method that reads the question data field.
     *
     * @return question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Sets a question
     *
     * @param question the question to set
     * @throws IllegalArgumentException when questions is null or empty
     */
    public void setQuestion(String question) throws IllegalArgumentException {
        if ((question != null) && !(question.trim().equals(""))) {
            this.question = question;
        } else {
            throw new IllegalArgumentException("The question can not be nothing"
                    + ", please enter again > ");
        }
    }

    /**
     * An accessor method that reads the opt1 data field and return it.
     *
     * @return opt1
     */
    public String getOpt1() {
        return opt1;
    }

    /**
     * An accessor method that reads the opt2 data field and return it.
     *
     * @return opt2
     */
    public String getOpt2() {
        return opt2;
    }

    /**
     * An accessor method that reads the opt3 data field and return it.
     *
     * @return opt3
     */
    public String getOpt3() {
        return opt3;
    }

    /**
     * A mutator method that sets the opt1 data field.
     *
     * @param opt1
     * @throws IllegalArgumentException when opt1 is null or empty
     */
    public void setOpt1(String opt1) throws IllegalArgumentException {
        if ((opt1 != null) && !(opt1.trim().equals(""))) {
            this.opt1 = opt1;
        } else {
            throw new IllegalArgumentException("The option can not be nothing, "
                    + "please enter again > ");
        }
    }

    /**
     * A mutator method that sets the opt2 data field.
     *
     * @param opt2
     * @throws IllegalArgumentException when opt2 is null or empty
     */
    public void setOpt2(String opt2) throws IllegalArgumentException {
        if ((opt2 != null) && !(opt2.trim().equals(""))) {
            this.opt2 = opt2;
        } else {
            throw new IllegalArgumentException("The option can not be nothing, "
                    + "please enter again > ");
        }
    }

    /**
     * A mutator method that sets the opt3 data field.
     *
     * @param opt3
     * @throws IllegalArgumentException when opt3 is null or empty
     */
    public void setOpt3(String opt3) throws IllegalArgumentException {
        if ((opt3 != null) && !(opt3.trim().equals(""))) {
            this.opt3 = opt3;
        } else {
            throw new IllegalArgumentException("The option can not be nothing, "
                    + "please enter again > ");
        }
    }

    /**
     * An accessor method that reads the userChoice data field and return it.
     *
     * @return userChoice
     */
    public String getUserChoice() {
        return userChoice;
    }

    /**
     * A mutator method that sets the userChoice data field.
     *
     * @param userChoice
     * @throws IllegalArgumentException when userChoice is null or empty
     */
    public void setUserChoice(String userChoice) throws 
            IllegalArgumentException {
        if ((userChoice != null) && !(userChoice.trim().equals(""))) {
            this.userChoice = userChoice;
        } else {
            throw new IllegalArgumentException("The option can not be nothing, "
                    + "please enter again > ");
        }
    }

}
