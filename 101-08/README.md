# 101-08. 最佳資費選擇  


輸入每月網內、網外、市話、通話時間(秒)及網內、網外簡訊則數，求最佳資費。  

費率如下表:  

資費類型 183型 383型 983型  
月租費 183元 383元 983元  
優惠內容 月 租 費 可 抵 等 額 通 信 費  
語音費率 網內 0.08 0.07 0.06  
(元/秒) 網外 0.139 0.130 0.108  
市話 0.135 0.121 0.101  
(元/秒)  
簡訊費率 網內 1.128 1.128 1.128  
(元/則) 網外 1.483 1.483 1.483  

--------------------------------- 
輸入說明  
--------------- 
網內語音(秒)，整數  
網外語音(秒)，整數  
市話 (秒)，整數  
網內簡訊數，整數  
網內簡訊數，整數  

--------------------------------- 
輸入說明  
--------------------------------- 
最佳資費類型，(183, 383, 983)  
最佳資費，整數  


--------------------------------- 
測試資料：(Test Case)  

input  
120  
150  
20  
10  
5  

output  
183  
183  


input  
3000  
4000  
200  
5  
5  

output  
383  
767  
