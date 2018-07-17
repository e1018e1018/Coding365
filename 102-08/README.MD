# 102-08. 

費氏數列 Fibonacci number 

請用迴圈撰寫。  
輸入一個整數n，輸出 Fibonacci number。  

F(1) = 1 ; F(2) = 1;  
F( n ) = F(n-1) + F(n-2) ;n > 2  

並請檢查使用者輸入是否符合規定  
不能使用遞迴和陣列  

輸入說明：  

每一組一個正整數，輸入-1結束所有輸入。  
數字代表第幾個數列的數字 1~100  
不合法的輸入則輸出Error。  

輸出說明：  

費氏數列的值。  

--------------------- 

Sample Input:  

31  
39  
-1  

Sample Output:  

1346269  
63245986  

--------------------- 

Sample Input:  

31  
1.101  
-1  

Sample Output:  

1346269  
Error  

--------------------- 

Sample Input:  

.11$  
1.-  
31  
-1  

Sample Output:  

Error  
Error  
1346269  
