function prime(n){
    if(n<10){
        return (n==2 || n==3 || n==5 || n==7)?true:false     
    }
    else{
        return (n%2==0 || n%3==0 || n%5==0 || n%7==0)?false:true
    }
    
}
const arr=[1,2,3,4,5,6,7,8,9,10,123,235,6,3456,235]
arr.forEach(element =>prime(element)?console.log("prime"+element):"");