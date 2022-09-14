#Problem link:https://leetcode.com/problems/the-number-of-weak-characters-in-the-game/

#Time Complexity: O(N logN)
#Space Complexity: O(1)

class Solution:
    def numberOfWeakCharacters(self, properties: List[List[int]]) -> int:
        
        #number to be returned
        numberOfWeakCharacters = 0
        
        #record maximum defense
        maxDefenseScore = 0
        
        #sort the properties
        #ascending order for attacking scores
        #if attack is the same
        #descending order for defending scores
        properties.sort(key = lambda x: (x[0], -x[1]), reverse = True)
        
        #we only care about the defense score
        for _, defense in properties:
            
            #if less than maxDefenseScore then is a weak character
            if defense < maxDefenseScore:
                numberOfWeakCharacters +=1
            else:#update max defense
                maxDefenseScore = defense
        
        return numberOfWeakCharacters
