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
class SECURITY_CHALLENGE 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    question: detachable SECURITY_QUESTION 
      
    answer: detachable SECURITY_ANSWER_ID 
      

feature -- Change Element  
 
    set_question (a_name: like question)
        -- Set 'question' with 'a_name'.
      do
        question := a_name
      ensure
        question_set: question = a_name		
      end

    set_answer (a_name: like answer)
        -- Set 'answer' with 'a_name'.
      do
        answer := a_name
      ensure
        answer_set: answer = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass SECURITY_CHALLENGE%N")
        if attached question as l_question then
          Result.append ("%Nquestion:")
          Result.append (l_question.out)
          Result.append ("%N")    
        end  
        if attached answer as l_answer then
          Result.append ("%Nanswer:")
          Result.append (l_answer.out)
          Result.append ("%N")    
        end  
      end
end


