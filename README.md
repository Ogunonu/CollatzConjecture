# CollatzConjecture
Basic Collatz Conjecture Analysis
For now it only iterates up to 100,000. Can be manually changed in line 19 to go higher however it will break due to int being unable to process numbers
that big. It could be manually changed to long values to accomodate for bigger values however the problem is that the compilation time will increase
exponentially. My observation of the current code is that it runs at roughly O(n^n) which will take too long at high n values.
Later on im planning on implementing binary search and an algorithm to reduce the time-complexity to a best-case of O(logn) and worst-case of O(n^n) hopefully which
will allow for faster and larger values to be evaluated.
