# 102-11.方程式計算 

(此題不使用陣列) 

寫一個 function 輸入 XY 座標系統的兩個座標 (x1, y1), (x2, y2)；  
輸出兩個座標經過的 XY 方程式 y=mx+b;  

m=(y1-y2)/(x1-x2)  
b=(x2y1-x1y2)/(x2-x1)  

寫一個 function 輸入 XY 座標系統的兩個座標 (x1, y1), (x2, y2)；  
輸出兩個座標經過的 XY 方程式 y=m1/m2x+b1/b2;  

m1=(y1-y2), m2=(x1-x2),  
b1=(x2y1-x1y2), b2=(x2-x1),  

------------- 
輸入說明:  
XY的兩個座標 x1, y1, x2, y2，均為整數。 

輸出說明:  
(1) y=mx+b,  
m, b 計算至小數第二位。 

(2) y=mx+b  
m, b 以分數表達。 

=>方程式有可能沒有 x 項，或沒有 y 項。  
=>沒有 x 項則 y=b，沒有 y 項則 x = -b/m。  
=>若m,b為整數，則使用整數表達。 

------------- 
輸入範例:  
3 4 -3 0 

輸出範例:  
y=0.67x+2  
y=2/3x+2 
