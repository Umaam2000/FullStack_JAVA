function fnpalindrom(){
var input=document.getElementById("original").value;
s=input.split("");
s=s.reverse();
s=s.toString();
s=s.replaceAll(",","");
if(input==s){
    document.getElementById("result-pallindrom").innerText=s+" is a pallindrom";
}
else{
document.getElementById("result-pallindrom").innerText=s+" is not a pallindrom";
 }
}

function fnPrime(){
    var l=document.getElementById("lsb").value;
    var m=document.getElementById("msb").value;
    let result=true;
    let arr=[];
    for(let x=l;x<m;x++){
        if(x>=10){
            result=(x%2==0 || x%3==0 || x%5==0 || x%7==0 )?false:true;
    
            
        }
        else{
            result=(x==2 || x==3 || x==5 || x==7)?true:false;
            
        }
        if(result==true){
            arr.push(x);
        }
    }
    document.getElementById("result-prime").innerText=arr.toString();
}

function fnFibonacci(){
    let num1=0;
    let num2=1;
    let sum=num1+num2;
    let arr=[0,1,sum];
    for(let i=1;i<100;i++){
        num1=num2;
        num2=sum;
        sum=num1+num2;
        arr.push(sum);   
    }
    document.getElementById("result-fibinocci").innerText=arr.toString();
}

function fnSum(){
    let num=document.getElementById("sumnum").value;
    let res=num%9==0?9:num%9;
    document.getElementById("result-sum").innerText=res;
}