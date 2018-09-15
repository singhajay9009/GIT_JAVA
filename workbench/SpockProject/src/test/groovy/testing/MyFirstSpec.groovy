package testing

import spock.lang.Specification

class MyFirstSpec extends Specification {
	def "Test_One" (){
		
				given:				
					def obj = new SpockMethodsPlaceholder()
					obj.returnAge(0) >> {throw new Exception("invalidAge")}
				when:
					1*obj.returnAge(0)
				then:
					Exception ex = thrown()
					ex.getMessage() == "invalidAge"
		
			}
		
		class SpockMethodsPlaceholder {
			def "returnAge" (int age){
				return age
			}
		}
		
	
}
