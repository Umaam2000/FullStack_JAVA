// function fnSimpleFetch(){
// fetch('https://jsonplaceholder.typicode.com/todos')
//       .then(response => response.json())
//       .then(json => document.getElementById('result-SimpleFetch').innerText=(JSON.stringify(json)));

// }
 async function fnSimpleFetch(){
    const response = await fetch('https://jsonplaceholder.typicode.com/todos');
    const jsonData = await response.json();
    console.log(JSON.stringify(jsonData));
    const j=JSON.parse((JSON.stringify(jsonData)));
    console.log(j);
  }

  function fnFetchById(){
    var i=document.getElementById("id").value ;
    fetch(`https://jsonplaceholder.typicode.com/todos/${i}`)
    .then(response =>response.json())
    .then(json =>document.getElementById('result-FetchById').innerText=JSON.stringify(json))
  }

async function fnFetchByIds(){
    const response=await fetch("https://jsonplaceholder.typicode.com/todos");
 const jsonData=await response.json();
 const data=jsonData.filter(x => {
     if(x.id>=1 && x.id<=10){
         return x;
     }
 })
 console.log(data);
}

