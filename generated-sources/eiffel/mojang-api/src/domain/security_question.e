note
 description:"[
		Mojang API
 		No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
  		OpenAPI spec version: 2020-06-05
 	    

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class SECURITY_QUESTION 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    id: INTEGER_32 
      -- The possible IDs are these:   1  What is your favorite pet's name?   2  What is your favorite movie?   3  What is your favorite author's last name?   4  What is your favorite artist's last name?   5  What is your favorite actor's last name?   6  What is your favorite activity?   7  What is your favorite restaurant?   8  What is the name of your favorite cartoon?   9  What is the name of the first school you attended?   10 What is the last name of your favorite teacher?   11 What is your best friend's first name?   12 What is your favorite cousin's name?   13 What was the first name of your first girl/boyfriend?   14 What was the name of your first stuffed animal?   15 What is your mother's middle name?   16 What is your father's middle name?   17 What is your oldest sibling's middle name?   18 In what city did your parents meet?   19 In what hospital were you born?   20 What is your favorite team?   21 How old were you when you got your first computer?   22 How old were you when you got your first gaming console?   23 What was your first video game?   24 What is your favorite card game?   25 What is your favorite board game?   26 What was your first gaming console?   27 What was the first book you ever read?   28 Where did you go on your first holiday?   29 In what city does your grandmother live?   30 In what city does your grandfather live?   31 What is your grandmother's first name?   32 What is your grandfather's first name?   33 What is your least favorite food?   34 What is your favorite ice cream flavor?   35 What is your favorite ice cream flavor?   36 What is your favorite place to visit?   37 What is your dream job?   38 What color was your first pet?   39 What is your lucky number?
    question: detachable STRING_32 
      -- The question itself

feature -- Change Element  
 
    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name		
      end

    set_question (a_name: like question)
        -- Set 'question' with 'a_name'.
      do
        question := a_name
      ensure
        question_set: question = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass SECURITY_QUESTION%N")
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")    
        end  
        if attached question as l_question then
          Result.append ("%Nquestion:")
          Result.append (l_question.out)
          Result.append ("%N")    
        end  
      end
end


