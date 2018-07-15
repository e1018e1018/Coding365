# 101-09. 判斷何種三角形  

當三個邊長能夠構成三角形時，再判斷該三角形為鈍角、銳角或是直角三角形，其判別方法如下：  
1. 直角三角形：其中有兩個邊的平方和等於第三邊的平方。  
2. 鈍角三角形：其中有兩個邊的平方和小於第三邊的平方。  
3. 銳角三角形：任兩邊的平方和大於第三邊的平方。  
輸入三個整數  

輸出：顯示直角三角形(Right Triangle)、鈍角三角形(Obtuse Triangle)、銳角三角形(Acute Triangle)或無法構成三角形(Not Triangle)。 

此題必須寫一個運算的function  

int compute(int a, int b, int c);  
a, b, b 為三角形三個邊  
回傳值  
0:Not Triangle  
1:Right Triangle  
2:Obtuse Triangle  
3:Acute Triangle  

測試資料：  

---
input  
5 12 13  

output  
Right Triangle  

---
input  
5 3 4  

output  
Right Triangle  

---
input  
1 2 3  

output  
Not Triangle 
