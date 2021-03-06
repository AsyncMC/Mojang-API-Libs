/*
 * Mojang API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OAS-api/OAS-codegen.git
 * Do not edit the class manually.
 */

/**
 * A security question requested by Mojang
 */
public class OASSecurityQuestion {
    /**
     * The possible IDs are these:\n  1  What is your favorite pet\'s name?\n  2  What is your favorite movie?\n  3  What is your favorite author\'s last name?\n  4  What is your favorite artist\'s last name?\n  5  What is your favorite actor\'s last name?\n  6  What is your favorite activity?\n  7  What is your favorite restaurant?\n  8  What is the name of your favorite cartoon?\n  9  What is the name of the first school you attended?\n  10 What is the last name of your favorite teacher?\n  11 What is your best friend\'s first name?\n  12 What is your favorite cousin\'s name?\n  13 What was the first name of your first girl/boyfriend?\n  14 What was the name of your first stuffed animal?\n  15 What is your mother\'s middle name?\n  16 What is your father\'s middle name?\n  17 What is your oldest sibling\'s middle name?\n  18 In what city did your parents meet?\n  19 In what hospital were you born?\n  20 What is your favorite team?\n  21 How old were you when you got your first computer?\n  22 How old were you when you got your first gaming console?\n  23 What was your first video game?\n  24 What is your favorite card game?\n  25 What is your favorite board game?\n  26 What was your first gaming console?\n  27 What was the first book you ever read?\n  28 Where did you go on your first holiday?\n  29 In what city does your grandmother live?\n  30 In what city does your grandfather live?\n  31 What is your grandmother\'s first name?\n  32 What is your grandfather\'s first name?\n  33 What is your least favorite food?\n  34 What is your favorite ice cream flavor?\n  35 What is your favorite ice cream flavor?\n  36 What is your favorite place to visit?\n  37 What is your dream job?\n  38 What color was your first pet?\n  39 What is your lucky number?
     * @return id
     */
    public Integer id { get; set; }

    /**
     * The question itself
     * @return question
     */
    public String question { get; set; }

    public static OASSecurityQuestion getExample() {
        OASSecurityQuestion securityQuestion = new OASSecurityQuestion();
          securityQuestion.id = 37;
          securityQuestion.question = 'What is your dream job?';
        return securityQuestion;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASSecurityQuestion) {           
            OASSecurityQuestion securityQuestion = (OASSecurityQuestion) obj;
            return this.id == securityQuestion.id
                && this.question == securityQuestion.question;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (question == null ? 0 : System.hashCode(question));
        return hashCode;
    }
}

