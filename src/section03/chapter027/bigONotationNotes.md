Big O 
    
    ==> Scalability of the code
    ==> A measure for RATE at which runtime will grow as input size grows
    ==> Helps to assess the performance of a code independant of the computer that it runs
    ==> Can be used to measure the memory used as well (Space Complexity)    
    
Different Big O notations 
    
    ==> O(1)        : Constant     ; NO Loops
    ==> O(log n)    : Logarithmic  ;  
    ==> O(n)        : Linear       ; loops which scans all inputs
    ==> O(n log n)  : Log Linear   ; Sorting operations 
    ==> O(n^2)      : Quadratic    ; Two nested Loops 
    ==> O(2^n)      : Exponential  ; Recursice Algorithms
    ==> O(n!)       : Fractional   ; You are adding a loop for every element
    
Interesting points :
 
    ==> Iterating half a collection is still O (n)
    ==> Two separate collection O(a * b)
    
What causes time in a function ? 

    ==> Operations 
    ==> Comparisons 
    ==> Looping 
    ==> Outside function call


Rule Book

    Rule 1: Always worst Case
    Rule 2: Remove Constants
    Rule 3: Different inputs should have different variables. O(a+b). 
            A and B arrays nested would be O(a*b)  
            + for steps in order
            * for nested steps
    Rule 4: Drop Non-dominant terms
    
What causes Space complexity?

        Variables
        Data Structures
        Function Call
        Allocations     