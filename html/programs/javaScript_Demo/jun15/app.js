function fn1()

{

var list=document.getElementById("list");

fetch('https://jsonplaceholder.typicode.com/todos')

// .then((x)=>x.json())

// .then(x=>console.log(x))

.then(response => response.json())

.then(json =>json.map(x=>list.innerHTML+="<li>"+x.id+"</li>"))

}

function fn2(){
    document.getElementById("b").style.color="blue";
    document.getElementById("b").style.backgroundColor="yellow";

}