# 銀行存款 

假設某人有兩個帳戶 A、B，  
帳戶 A 的金額預設 0、帳戶 B 的金額預設 0。  
設計一個程式，功能有存款、提款、查詢餘額及查詢兩個帳戶餘額的百分比。  

其指令為:  
a: 選擇帳戶 A。  
b: 選擇帳戶 B。  
v: 查詢所選帳戶餘額，可能為負值。  
w: 所選帳戶提款。  
s: 所選帳戶存款。  
p: 查詢兩個帳戶餘額的百分比，計算方式:  
若一餘額為負數或 0，另一餘額為正數，則比例為 0%:100%。  
兩餘額均為 0，比例為 50%:50%。  
其餘情況 (帳戶 A) : (帳戶 B) 其公式為 A/(A + B) %，(1-A/(A + B))%，  
先計算 A 帳戶百分比，百分比捨去小數，B 百分比為 100-A 百分比。  
e : exit 

輸入說明 

a: 選擇帳戶 A。輸出 Select A。  
b: 選擇帳戶 B。輸出 Select B。  
v: 查詢所選帳戶餘額，可能為負值。  
w: 所選帳戶提款。輸出 [所選帳戶 Withdraw]。輸出所選帳戶餘額。  
s: 所選帳戶存款。輸出 [所選帳戶 Deposit]。輸出所選帳戶餘額。 
p: 查詢兩個帳戶餘額的百分比。  
e : exit 


輸出說明  
a: 選擇帳戶 A。輸出 [Select A]，中間一個空白。  
b: 選擇帳戶 B。輸出 [Select B]，中間一個空白。  
v: 查詢所選帳戶餘額，可能為負值。輸出[帳號名稱:帳戶餘額]，中間沒有空白。  
w: 所選帳戶提款。輸出 [所選帳戶:Withdraw,帳戶餘額]，中間沒有空白。  
s: 所選帳戶存款。輸出 [所選帳戶:Deposit,帳戶餘額]，中間沒有空白。  
p: 查詢兩個帳戶餘額的百分比 A/(A + B)。輸出[A:所佔百分比,B:所佔百分比]，中間沒有空白。 

============= 
Sample input: 

a  
v  
p  
s  
2000  
b  
v  
s  
2000  
p  
a  
w  
1000  
b  
w  
1000  
b  
w  
1500  
a  
w  
500  
p  
b  
s  
2000  
p  
a  
s  
500  
b  
s  
500  
p  
e  

=================== 
Sample output: 

Select A  
A:0  
A:50%,B:50%  
A:Deposit,2000  
Select B  
B:0  
B:Deposit,2000  
A:50%,B:50%  
Select A  
A:Withdraw,1000  
Select B  
B:Withdraw,1000  
Select B  
B:Withdraw,-500  
Select A  
A:Withdraw,500  
A:100%,B:0%  
Select B  
B:Deposit,1500  
A:25%,B:75%  
Select A  
A:Deposit,1000  
Select B  
B:Deposit,2000  
A:33%,B:67%  
