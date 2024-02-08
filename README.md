Binary Search
It is a fundamental algorithm used to efficiently locate a target value within a sorted array. It follows a divide-and-conquer approach, reducing the search space by half in each iteration.
1 :-  Initialization:
                     Start with the entire sorted array.
                     Set pointers for the leftmost (low or start) and rightmost (high or end) indices.
2 :- Search Process:
                    Calculate the middle index: mid = (low + high) / 2
                    Compare the value at mid with the target:If target==mid then return target found.
                    If target<mid then mid=mid-1;(means move left side from mid position)
                    If target > mid then mid=mid+1;(move right side from mid position)
                    repeat this process until low<=hig


