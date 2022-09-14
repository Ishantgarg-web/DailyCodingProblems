#Problem link:https://leetcode.com/problems/bag-of-tokens/

#Time Complexity O(N*log(N)) - N = tokens length
#Space Complexity O(1)

class Solution:
    def bagOfTokensScore(self, tokens: List[int], power: int) -> int:
        
        #score - current score
        #max_score = maximum score
        score = max_score = 0 
        tokens.sort()
        queue = collections.deque(tokens)

        while queue:
            if power >= queue[0]:#if we have enough power, increase the score
                power -= queue.popleft()    # pop the smallest power from left
                score += 1
                max_score = max(max_score, score)#check if we have a new max score
            elif score >= 1:#if we don't have enough power, increase the power
                power += queue.pop()        # pop the biggest power from right
                score -= 1
            else:
                queue.popleft()
        
        return max_score
